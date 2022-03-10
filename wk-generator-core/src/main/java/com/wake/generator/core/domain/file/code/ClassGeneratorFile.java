package com.wake.generator.core.domain.file.code;

import com.wake.generator.core.domain.Method;
import com.wake.generator.core.domain.Property;
import java.util.List;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>Title: </p>
 * <p>Description: 类信息</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/2/15 11:32
 */
@EqualsAndHashCode(callSuper = true)
@Slf4j
@Data
public class ClassGeneratorFile extends AbstractCodeGeneratorFile {

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

}
