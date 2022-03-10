package com.wake.generator.controller.dto;

import com.wake.generator.core.constant.TemplateType;
import com.wake.generator.core.domain.Method;
import com.wake.generator.core.domain.Property;
import com.wake.generator.core.domain.file.AbstractGeneratorFile;
import com.wake.generator.core.domain.file.code.AbstractCodeFile;
import com.wake.generator.core.domain.file.code.ClassFile;
import com.wake.generator.core.domain.file.code.InterfaceFile;
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
    private ClassFile extendsClass;

    /**
     * 实现列表
     */
    private Set<InterfaceFile> implementSet;

    /**
     * 参数列表
     */
    private Set<Property> propertySet;

    /**
     * 方法列表
     */
    private Set<Method> methodSet;

    /**
     * 描述
     */
    private String description;

    /**
     * 继承的接口类
     */
    private Set<InterfaceFile> extendsInterfaceSet;

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
    public ClassFile generateClassGeneratorFile() {
        ClassFile result = new ClassFile();
        dealGeneratorFileValue(result);
        dealCodeGeneratorFileValue(result);
        result.setExtendsClass(extendsClass);
        result.setImplementSet(implementSet);
        result.setPropertySet(propertySet);
        result.setMethodSet(methodSet);
        return result;
    }

    /**
     * 生成接口文件对象
     *
     * @return 接口文件对象
     */
    public InterfaceFile generateInterfaceGeneratorFile() {
        InterfaceFile result = new InterfaceFile();
        dealGeneratorFileValue(result);
        dealCodeGeneratorFileValue(result);
        result.setExtendsInterfaceSet(extendsInterfaceSet);
        result.setMethodSet(methodSet);
        return result;
    }

    /**
     * 填充代码文件数据
     *
     * @param domainShape domainShape
     * @param <T>         T extends AbstractCodeGeneratorFile
     */
    private <T extends AbstractCodeFile> void dealCodeGeneratorFileValue(T domainShape) {
        domainShape.setAnnotations(annotations);
        domainShape.setModifier(modifier);
        domainShape.setDescription(description);
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
