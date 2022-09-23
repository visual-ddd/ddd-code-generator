package com.wd.paas.generator.generate.generator.project.domainchart.abstractuml;

import com.wd.paas.generator.generate.constant.VelocityLabel;
import lombok.Data;
import org.apache.velocity.VelocityContext;

import java.util.List;

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

    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.CLASS_NAME, className);
        context.put(VelocityLabel.CLASS_PACKAGE, classPackage);
        context.put(VelocityLabel.CLASS_DESCRIPTION, classDesc);
        context.put(VelocityLabel.CLASS_FIELDS, fieldList);
        context.put(VelocityLabel.CLASS_METHODS, methodList);
    }
}
