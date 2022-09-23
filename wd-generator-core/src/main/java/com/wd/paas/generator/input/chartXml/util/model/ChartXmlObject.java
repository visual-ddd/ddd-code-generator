package com.wd.paas.generator.input.chartXml.util.model;

import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

/**
 * 画板中需要解析的元素xml标签
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/18
 * @see GenerateElementTypeEnum 元素类型
 */
@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ChartXmlObject {
    /**
     * 基本
     */
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "shapeType")
    private GenerateElementTypeEnum shapeType;
    @XmlElement(name = "mxCell")
    private MxCell mxCell;

    /**
     * 节点
     */
    @XmlAttribute(name = "nodeDesc")
    private String nodeDesc;

    /**
     * 动作
     */
    @XmlAttribute(name = "actionPackage")
    private String actionPackage;

    /**
     * UML类
     */
    @XmlAttribute(name = "className")
    private String className;
    @XmlAttribute(name = "classDesc")
    private String classDesc;
    @XmlAttribute(name = "classPackage")
    private String classPackage;

    /**
     * 属性
     */
    @XmlAttribute(name = "fieldDesc")
    private String fieldDesc;
    @XmlAttribute(name = "fieldName")
    private String fieldName;
    @XmlAttribute(name = "fieldType")
    private String fieldType;
    @XmlAttribute(name = "fieldModify")
    private String fieldModify;

    /**
     * 方法
     */
    @XmlAttribute(name = "methodReturn")
    private String methodReturn;
    @XmlAttribute(name = "methodName")
    private String methodName;
    @XmlAttribute(name = "methodModify")
    private String methodModify;
    @XmlAttribute(name = "methodDesc")
    private String methodDesc;
    @XmlAttribute(name = "methodAttr")
    private String methodAttr;
}
