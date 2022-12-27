package com.wd.paas.generator.generate.generator.project.domainchart.abstractuml;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;

/**
 * UML抽象类
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class UmlClass {

    /**
     * 类名
     */
    public String className;

    /**
     * 类属性列表
     */
    public List<UmlField> fieldList;

    /**
     * 类方法列表
     */
    public List<UmlMethod> methodList;

    /**
     * 类所在包名
     */
    public String classPackage;

    /**
     * 类描述信息
     */
    public String classDesc;

    public String getClassPackage() {
        return Optional.ofNullable(classPackage).map(String::toLowerCase).orElse(StringUtils.EMPTY);
    }
}
