package com.wake.generator.application.handler;

import com.wake.generator.application.domain.DomainElement;
import com.wake.generator.application.domain.Field;
import com.wake.generator.application.domain.Method;
import com.wake.generator.application.util.PropertiesConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.ArrayUtils;

/**
 * <p>Title: ClassImportParser</p>
 * <p>Description: 解析类需要导入的包</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 11:43
 */
@Slf4j
public class ClassImportParser {

    /**
     * 正则匹配字段中的类型
     */
    private static final String FIELD_TYPE_EXPRESSION = "(\\w+)";
    /**
     * 正则匹配方法参数中的类型块
     */
    private static final String ATTRIBUTE_LIST_EXPRESSION = "([\\w+<>]+)\\s";
    /**
     * 暂存可供导入的类型列表，k: 类型名称， v: 包路径
     */
    private final Map<String, String> classTypeMap = new HashMap<>();

    /**
     * 启动导入解析器
     *
     * @param DomainElementList 需要解析的类列表
     */
    public void run(List<DomainElement> DomainElementList) {
        this.initClassTypeMap(DomainElementList);
        for (DomainElement DomainElement : DomainElementList) {
            DomainElement.setImportClassSet(this.parseImportClass(classTypeMap, DomainElement));
        }
    }

    /**
     * 初始化可供导入的类型
     *
     * @param DomainElementList 需要生成的类集合
     */
    private void initClassTypeMap(List<DomainElement> DomainElementList) {
        // 获取配置文件中系统支持的类型
        Map<String, Object> propertiesMap = PropertiesConfig.getPropertiesMap();
        Set<Entry<String, Object>> entries = propertiesMap.entrySet();
        for (Entry<String, Object> entry : entries) {
            classTypeMap.put(entry.getKey(), (String) entry.getValue());
        }
        // 获取环境中可供使用的类型
        DomainElementList.forEach(DomainElement -> classTypeMap.put(DomainElement.getName(), DomainElement.getPackagePath()));
    }

    /**
     * 解析类的导入关系
     *
     * @param classTypeMap 可导入的类型map k: 类名, v: 包路径
     * @param DomainElement     当前类
     * @return 当前类需要导入的包路径
     */
    public Set<String> parseImportClass(Map<String, String> classTypeMap, DomainElement DomainElement) {
        Set<String> result = new HashSet<>();

        // 需要排除的字段类型
        String exclude = classTypeMap.get("exclude");
        String[] excludes = exclude.split(",");

        // 提取需要导入的类型集合
        Set<String> importTypeSet = getImportTypeSet(DomainElement);
        for (String importType : importTypeSet) {
            if (ArrayUtils.contains(excludes, importType)) {
                log.debug("排除类型：" + importType);
                continue;
            }
            // 从提供的类型map中提取对应的包路径
            String path = classTypeMap.get(importType);
            if (Objects.isNull(path)) {
                log.warn("类型匹配失败，不支持的类型：" + importType);
            } else {
                result.add(path);
            }
        }
        return result;
    }

    /**
     * 从类信息中提取需要导入的类型集合
     *
     * @param DomainElement 类DTO
     * @return 类型集合
     */
    private Set<String> getImportTypeSet(DomainElement DomainElement) {
        Set<String> importTypeSet = new HashSet<>();
        Pattern fieldPattern = Pattern.compile(FIELD_TYPE_EXPRESSION);
        Pattern attributePattern = Pattern.compile(ATTRIBUTE_LIST_EXPRESSION);

        // 获取字段列表中用到的类型
        for (Field field : DomainElement.getFieldList()) {
            matchToTarget(importTypeSet, fieldPattern, field.getType());
        }

        // 获取方法列表中用到的类型
        for (Method method : DomainElement.getMethodList()) {
            // 响应类型
            matchToTarget(importTypeSet, fieldPattern, method.getReturnType());
            // 参数类型
            Set<String> attributeSet = new HashSet<>();
            matchToTarget(attributeSet, attributePattern, method.getAttributeLabel());
            for (String attr : attributeSet) {
                matchToTarget(importTypeSet, fieldPattern, attr);
            }
        }
        return importTypeSet;
    }

    /**
     * 根据 pattern 对 str 进行正则匹配，并将每次匹配的第一组结果存于 target
     *
     * @param target     结果Set
     * @param pattern    正则规则
     * @param str 待匹配的字符串
     */
    private static void matchToTarget(Set<String> target, Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            target.add(matcher.group(1));
        }
    }

}
