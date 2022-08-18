package com.wake.generator.application.generate.util;

import com.wake.generator.application.generate.common.DomainShapeEnum;
import com.wake.generator.application.generate.common.ModifyEnum;
import com.wake.generator.application.generate.entity.DomainShape;
import com.wake.generator.application.generate.entity.Field;
import com.wake.generator.application.generate.entity.Global;
import com.wake.generator.application.generate.entity.Method;
import com.wake.generator.application.generate.util.model.MXFileRoot;
import com.wake.generator.application.generate.util.model.ObjectLabel;
import com.wake.generator.client.generete.dto.GenerateDomainDto;
import com.wake.generator.client.generete.dto.GenerateProjectDto;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * xml转图谱实体
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/15
 */
@Slf4j
public class Xml2ChartConvert {

    public static final Pattern COLOR_PATTERN = Pattern.compile("fillColor=(.*?);");

    /**
     * 解析chartXml文件流
     *
     * @param chartXmlInputStream 图谱Xml文件流
     * @return 需要生成的图形集合
     */
    public static Set<DomainShape> getDomainShape(InputStream chartXmlInputStream) {
        List<ObjectLabel> objectLabels = Xml2ChartConvert.parseXmlByStream(chartXmlInputStream);
        return Xml2ChartConvert.transformDomainShapes(objectLabels);
    }

    /**
     * 从chartXml标签中提取需要生成的图形信息
     *
     * @param objectLabelList 解析后的标签列表
     * @return 需要生成的图形集合
     */
    public static Set<DomainShape> transformDomainShapes(List<ObjectLabel> objectLabelList) {
        // 解析并缓存属性列表、方法列表和action包名
        Map<String, List<Field>> fieldsMap = new HashMap<>(100);
        Map<String, List<Method>> methodsMap = new HashMap<>(50);
        Map<String, String> actionMap = new HashMap<>(20);
        ArrayList<ObjectLabel> umlElements = new ArrayList<>();
        for (ObjectLabel objectLabel : objectLabelList) {
            DomainShapeEnum shapeType = objectLabel.getShapeType();
            String parentId = objectLabel.getMxCell().getParent();
            if (Objects.isNull(shapeType)) {
                continue;
            }
            switch (shapeType) {
                case FIELD:
                    List<Field> fieldList = fieldsMap.get(parentId);
                    if (Objects.isNull(fieldList)) {
                        fieldList = new ArrayList<>();
                        fieldsMap.put(parentId, fieldList);
                    }
                    fieldList.add(transformField(objectLabel));
                    break;
                case METHOD:
                    List<Method> methodList = methodsMap.get(parentId);
                    if (Objects.isNull(methodList)) {
                        methodList = new ArrayList<>();
                        methodsMap.put(parentId, methodList);
                    }
                    methodList.add(transformMethod(objectLabel));
                    break;
                case ACTION:
                    String actionPackage = objectLabel.getActionPackage();
                    actionMap.put(objectLabel.getId(), actionPackage);
                    break;
                case AGGREGATION:
                case VALUE_OBJECT:
                case EVENT:
                case COMMAND:
                    umlElements.add(objectLabel);
                    break;
                default:
                    break;
            }
        }
        // 解析需要生成的UML元素
        Set<DomainShape> domainShapes = new HashSet<>();
        for (ObjectLabel element : umlElements) {
            String id = element.getId();
            DomainShape domainShape = transformDomainShape(element);
            domainShape.setFieldList(fieldsMap.get(id));
            domainShape.setMethodList(methodsMap.get(id));
            domainShape.setActionName(actionMap.get(element.getMxCell().getParent()));
            domainShapes.add(domainShape);
        }
        // 解析元素所属聚合
        parseAggregationColor(domainShapes);
        return domainShapes;
    }

    /**
     * 解析chartXml文件流
     *
     * @param chartXmlInputStream chartXml输入流
     * @return 解析后的标签集合
     */
    public static List<ObjectLabel> parseXmlByStream(InputStream chartXmlInputStream) {
        MXFileRoot mxFileRoot;
        try {
            mxFileRoot = JAXBContextParseXmlUtil.xml2javaFromRecource(chartXmlInputStream,
                MXFileRoot.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return mxFileRoot.getDiagram().getMxGraphModel().getRoot().getObjectLabelList();
    }

    private static void parseAggregationColor(Set<DomainShape> domainShapes) {
        // 缓存聚合颜色映射表
        Map<String, DomainShape> aggregationColorMap = new HashMap<>(7);
        for (DomainShape domainShape : domainShapes) {
            if (DomainShapeEnum.AGGREGATION.equals(domainShape.getShapeType())) {
                String color = domainShape.getColor();
                // 聚合必须标颜色才加入生成列表
                if (StringUtils.isEmpty(color)) {
                    continue;
                }
                aggregationColorMap.put(color, domainShape);
            }
        }
        Iterator<DomainShape> iterator = domainShapes.iterator();
        while (iterator.hasNext()) {
            DomainShape domainShape = iterator.next();
            if (DomainShapeEnum.AGGREGATION.equals(domainShape.getShapeType())) {
                continue;
            }
            String color = domainShape.getColor();
            DomainShape aggregation = aggregationColorMap.get(color);
            // 如果没有找到对应的聚合颜色,则从生成列表中删除
            if (Objects.isNull(aggregation)) {
                iterator.remove();
            }
            domainShape.setParentAggregation(aggregation);
        }
    }

    public static Global transformGlobal(GenerateProjectDto projectDto,
        GenerateDomainDto chartDto) {
        Global global = new Global();
        global.setProjectName(projectDto.getProjectName());
        global.setGroup(projectDto.getGroupPackage());
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        global.setDateTime(dateTime.format(formatter));
        global.setAuthor(chartDto.getAuthor());
        global.setFiled(chartDto.getDomainPackage());
        return global;
    }

    /**
     * 映射为需要生成的图形信息
     *
     * @param element
     * @return DomainShape
     */
    private static DomainShape transformDomainShape(ObjectLabel element) {
        DomainShape domainShape = new DomainShape();
        domainShape.setName(element.getClassName());
        domainShape.setDescription(element.getClassDesc());
        domainShape.setShapeType(element.getShapeType());
        String style = element.getMxCell().getStyle();
        domainShape.setColor(getAggregationColor(style));
        return domainShape;
    }

    /**
     * 正则取出图形填充的聚合颜色标识
     *
     * @param style
     * @return
     */
    public static String getAggregationColor(String style) {
        String result = null;
        Matcher matcher = COLOR_PATTERN.matcher(style);
        if (matcher.find()) {
            result = matcher.group(1);
        }
        return result;
    }

    /**
     * 映射为属性元素
     *
     * @param objectLabel
     * @return 属性对象
     */
    private static Field transformField(ObjectLabel objectLabel) {
        Field field = new Field();
        field.setName(objectLabel.getFieldName());
        field.setType(objectLabel.getFieldType());
        ModifyEnum fieldModify = Optional.ofNullable(objectLabel.getFieldModify())
            .orElse(ModifyEnum.PRIVATE);
        field.setModifier(fieldModify.getValue());
        field.setDescription(objectLabel.getFieldDesc());
        return field;
    }

    /**
     * 映射为方法元素
     *
     * @param objectLabel
     * @return 方法对象
     */
    private static Method transformMethod(ObjectLabel objectLabel) {
        Method method = new Method();
        method.setReturnType(objectLabel.getMethodReturn());
        method.setAttributeLabel(objectLabel.getMethodAttr());
        method.setName(objectLabel.getMethodName());
        ModifyEnum methodModify = Optional.ofNullable(objectLabel.getMethodModify())
            .orElse(ModifyEnum.PUBLIC);
        method.setModifier(methodModify.getValue());
        method.setDescription(objectLabel.getMethodDesc());
        return method;
    }

}
