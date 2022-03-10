package com.wake.generator.core.parser;

import com.wake.generator.core.domain.Method;
import com.wake.generator.core.domain.Property;
import com.wake.generator.core.domain.file.code.AbstractCodeGeneratorFile;
import com.wake.generator.core.domain.file.code.ClassGeneratorFile;
import com.wake.generator.core.domain.file.code.InterfaceGeneratorFile;
import com.wake.generator.core.util.PropertiesConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;

/**
 * <p>Title: ClassImportParser</p>
 * <p>Description: 解析类需要导入的包</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/2/24 15:52
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
    private Map<String, String> classTypeMap;

    /**
     * 启动导入解析器
     *
     * @param codeFiles 需要解析的文件列表
     */
    public void parser(Set<AbstractCodeGeneratorFile> codeFiles) {
        this.initClassTypeMap(codeFiles);
        for (AbstractCodeGeneratorFile codeFile : codeFiles) {
            codeFile.setImportClassSet(this.parseImportClass(classTypeMap, codeFile));
        }
    }

    /**
     * 初始化可供导入的类型
     *
     * @param codeFiles 需要生成的文件集合
     */
    private void initClassTypeMap(Set<AbstractCodeGeneratorFile> codeFiles) {
        this.classTypeMap = new HashMap<>(50);
        // 获取配置文件中系统支持的类型
        Map<String, Object> propertiesMap = PropertiesConfig.getPropertiesMap();
        Set<Entry<String, Object>> entries = propertiesMap.entrySet();
        for (Entry<String, Object> entry : entries) {
            classTypeMap.put(entry.getKey(), (String) entry.getValue());
        }
        // 获取环境中可供使用的类型
        codeFiles.forEach(codeFile -> classTypeMap.put(codeFile.getName(), codeFile.getPackagePath()));
    }

    /**
     * 解析类的导入关系
     *
     * @param classTypeMap 可导入的类型map k: 类名, v: 包路径
     * @param codeFile     需要生成的代码文件
     * @return 当前类需要导入的包路径
     */
    public Set<String> parseImportClass(Map<String, String> classTypeMap, AbstractCodeGeneratorFile codeFile) {
        Set<String> result = new HashSet<>();

        // 需要排除的字段类型
        String exclude = classTypeMap.get("exclude");
        String[] excludes = exclude.split(",");

        // 提取需要导入的类型集合
        Set<String> importTypeSet = getImportTypeSet(codeFile);
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
     * @param codeFile 类DTO
     * @return 类型集合
     */
    private Set<String> getImportTypeSet(AbstractCodeGeneratorFile codeFile) {
        Set<String> importTypeSet = new HashSet<>();
        Pattern fieldPattern = Pattern.compile(FIELD_TYPE_EXPRESSION);
        Pattern attributePattern = Pattern.compile(ATTRIBUTE_LIST_EXPRESSION);

        // 类文件
        if (codeFile instanceof ClassGeneratorFile) {
            ClassGeneratorFile classFile = (ClassGeneratorFile) codeFile;
            // 获取字段列表中用到的类型
            for (Property property : classFile.getPropertyList()) {
                matchToTarget(importTypeSet, fieldPattern, property.getType());
            }

            // 获取方法列表中用到的类型
            for (Method method : classFile.getMethodList()) {
                methodImport(importTypeSet, fieldPattern, attributePattern, method);
            }
        } else if (codeFile instanceof InterfaceGeneratorFile) {
            // 接口文件
            InterfaceGeneratorFile interfaceFile = (InterfaceGeneratorFile) codeFile;
            // 获取方法列表中用到的类型
            for (Method method : interfaceFile.getMethodList()) {
                methodImport(importTypeSet, fieldPattern, attributePattern, method);
            }
        }

        return importTypeSet;
    }

    private void methodImport(Set<String> importTypeSet, Pattern fieldPattern, Pattern attributePattern,
        Method method) {
        // 响应类型
        matchToTarget(importTypeSet, fieldPattern, method.getReturnType());
        // 参数类型
        Set<String> attributeSet = new HashSet<>();
        matchToTarget(attributeSet, attributePattern, method.getAttributeLabel());
        for (String attr : attributeSet) {
            matchToTarget(importTypeSet, fieldPattern, attr);
        }
    }

    /**
     * 根据 pattern 对 str 进行正则匹配，并将每次匹配的第一组结果存于 target
     *
     * @param target  结果Set
     * @param pattern 正则规则
     * @param str     待匹配的字符串
     */
    private static void matchToTarget(Set<String> target, Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            target.add(matcher.group(1));
        }
    }

}
