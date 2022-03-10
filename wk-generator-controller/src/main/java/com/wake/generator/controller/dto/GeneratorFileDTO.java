package com.wake.generator.controller.dto;

import com.wake.generator.core.constant.TemplateType;
import com.wake.generator.core.domain.Method;
import com.wake.generator.core.domain.Property;
import com.wake.generator.core.domain.file.AbstractGeneratorFile;
import com.wake.generator.core.domain.file.code.AbstractCodeGeneratorFile;
import com.wake.generator.core.domain.file.code.ClassGeneratorFile;
import com.wake.generator.core.domain.file.code.InterfaceGeneratorFile;
import java.util.List;
import java.util.Set;
import lombok.Data;

/**
 * <p>Title: GeneratorFileDTO</p>
 * <p>Description: 生成文件DTO</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/9 17:14
 */
@Data
public class GeneratorFileDTO {

    /**
     * 文件名
     */
    private String name;

    /**
     * 文件输出全路径
     */
    private String outputUrl;

    /**
     * 文件对应的模板类型
     */
    private TemplateType templateType;

    /**
     * 注解列表
     */
    private List<String> annotations;

    /**
     * 修饰符
     */
    private String modifier;

    /**
     * 继承的父类
     */
    private ClassGeneratorFile extendsClass;

    /**
     * 实现列表
     */
    private Set<InterfaceGeneratorFile> implementSet;

    /**
     * 参数列表
     */
    private List<Property> propertyList;

    /**
     * 方法列表
     */
    private List<Method> methodList;

    /**
     * 第一个字母小写的类名
     */
    private String classLowName;

    /**
     * 继承的接口类
     */
    private Set<InterfaceGeneratorFile> extendsInterfaceSet;

    /**
     * 根据不同图形类型创建对应的实体并返回。
     *
     * @return TemplateType 模板类型
     * @see TemplateType
     */
    public AbstractGeneratorFile transformToGeneratorFile() {
        switch (templateType) {
            case CLASS:
                return generateClassGeneratorFile();
            case INTERFACE:
                return generateInterfaceGeneratorFile();
            default:
                return null;
        }
    }

    /**
     * 生成类文件对象
     *
     * @return 类文件对象
     */
    public ClassGeneratorFile generateClassGeneratorFile() {
        ClassGeneratorFile result = new ClassGeneratorFile();
        dealGeneratorFileValue(result);
        dealCodeGeneratorFileValue(result);
        result.setExtendsClass(extendsClass);
        result.setImplementSet(implementSet);
        result.setPropertyList(propertyList);
        result.setMethodList(methodList);
        result.setClassLowName(classLowName);
        return result;
    }

    /**
     * 生成接口文件对象
     *
     * @return 接口文件对象
     */
    public InterfaceGeneratorFile generateInterfaceGeneratorFile() {
        InterfaceGeneratorFile result = new InterfaceGeneratorFile();
        dealGeneratorFileValue(result);
        dealCodeGeneratorFileValue(result);
        result.setExtendsInterfaceSet(extendsInterfaceSet);
        result.setMethodList(methodList);
        return result;
    }

    /**
     * 填充代码文件数据
     *
     * @param domainShape domainShape
     * @param <T>         T extends AbstractCodeGeneratorFile
     */
    private <T extends AbstractCodeGeneratorFile> void dealCodeGeneratorFileValue(T domainShape) {
        domainShape.setAnnotations(annotations);
        domainShape.setModifier(modifier);
    }

    /**
     * 填充生成文件数据
     *
     * @param domainShape domainShape
     * @param <T>         T extends AbstractGeneratorFile
     */
    private <T extends AbstractGeneratorFile> void dealGeneratorFileValue(T domainShape) {
        domainShape.setName(name);
        domainShape.setOutputUrl(outputUrl);
        domainShape.setTemplateType(templateType);
    }


}
