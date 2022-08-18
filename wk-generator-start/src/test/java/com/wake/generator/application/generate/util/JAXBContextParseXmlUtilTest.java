package com.wake.generator.application.generate.util;

import com.wake.generator.application.generate.common.DomainShapeEnum;
import com.wake.generator.application.generate.common.ModifyEnum;
import com.wake.generator.application.generate.entity.DomainChart;
import com.wake.generator.application.generate.entity.DomainShape;
import com.wake.generator.application.generate.entity.Field;
import com.wake.generator.application.generate.entity.Global;
import com.wake.generator.application.generate.entity.Method;
import com.wake.generator.application.generate.util.model.MXFileRoot;
import com.wake.generator.application.generate.util.model.ObjectLabel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class JAXBContextParseXmlUtilTest {

    @Test
    public void xml2javaFromFullPath() throws Exception {
        MXFileRoot mxFileRoot = JAXBContextParseXmlUtil.xml2javaFromFullPath(
            "/Users/shimmer/IdeaProjects/wake-code-generator/a.xml",
            MXFileRoot.class);
        List<ObjectLabel> objectLabelList = mxFileRoot.getDiagram().getMxGraphModel().getRoot()
            .getObjectLabelList();

        DomainChart domainChart = new DomainChart();
        ObjectLabel globalInfo = objectLabelList.get(0);
        domainChart.setGlobal(transformGlobal(globalInfo));
        Set<DomainShape> domainShapes = transformDomainShapes(objectLabelList);
        // 添加项目元素
        DomainShape projectShape = new DomainShape();
        projectShape.setShapeType(DomainShapeEnum.PROJECT);
        domainShapes.add(projectShape);
        domainChart.setDomainShapeList(domainShapes);
        domainChart.getDomainShapeList().forEach(domainShape -> log.info(domainShape.toString()));
    }

    private Set<DomainShape> transformDomainShapes(List<ObjectLabel> objectLabelList) {
        // 解析并缓存属性列表、方法列表和action包名
        Map<String, List<Field>> fieldsMap = new HashMap<>();
        Map<String, List<Method>> methodsMap = new HashMap<>();
        Map<String, String> actionMap = new HashMap<>();
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

    private void parseAggregationColor(Set<DomainShape> domainShapes) {
        // 缓存聚合颜色映射表
        Map<String, DomainShape> aggregationColorMap = new HashMap<>();
        for (DomainShape domainShape : domainShapes) {
            if (DomainShapeEnum.AGGREGATION.equals(domainShape.getShapeType())) {
                aggregationColorMap.put(domainShape.getColor(), domainShape);
            }
        }
        for (DomainShape domainShape : domainShapes) {
            if (DomainShapeEnum.AGGREGATION.equals(domainShape.getShapeType())) {
                continue;
            }
            String color = domainShape.getColor();
            DomainShape aggregation = aggregationColorMap.get(color);
            domainShape.setParentAggregation(aggregation);
        }
    }

    private Global transformGlobal(ObjectLabel objectLabel) {
        Global global = new Global();
        global.setProjectName(objectLabel.getProjectName());
        global.setAuthor(objectLabel.getAuthor());
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        global.setDateTime(dateTime.format(formatter));
        global.setGroup(objectLabel.getProjectPackage());
        global.setFiled(objectLabel.getDomainPackage());
        return global;
    }

    /**
     * 映射为需要生成的图形信息
     *
     * @param element
     * @return DomainShape
     */
    private DomainShape transformDomainShape(ObjectLabel element) {
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
     * @param style chartXml中style
     * @return 聚合颜色标识
     */
    public String getAggregationColor(String style) {
        String result = null;
        Pattern pattern = Pattern.compile("fillColor=(.*?);");
        Matcher matcher = pattern.matcher(style);
        if (matcher.find()) {
            result = matcher.group(1);
            log.info(result);
        }
        return result;
    }

    /**
     * 映射为属性元素
     *
     * @param objectLabel
     * @return 属性对象
     */
    private Field transformField(ObjectLabel objectLabel) {
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
    private Method transformMethod(ObjectLabel objectLabel) {
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