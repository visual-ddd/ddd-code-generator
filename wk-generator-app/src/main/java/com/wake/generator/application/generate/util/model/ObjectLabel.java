package com.wake.generator.application.generate.util.model;

import com.wake.generator.application.generate.common.GenerateElementTypeEnum;
import com.wake.generator.application.generate.common.ModifyEnum;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

/**
 * chartXml映射结构
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/18
 */
@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ObjectLabel {

    /**
     * 基本
     */
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "shapeType")
    private GenerateElementTypeEnum shapeType;
    @XmlElement(name = "mxCell")
    private MxCell mxCell;

//    /**
//     * 图谱
//     */
//    @XmlAttribute(name = "chartName")
//    private String chartName;
//    @XmlAttribute(name = "author")
//    private String author;
//    @XmlAttribute(name = "domainPackage")
//    private String domainPackage;
//    @XmlAttribute(name = "projectPackage")
//    private String projectPackage;
//    @XmlAttribute(name = "projectName")
//    private String projectName;

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
    private ModifyEnum fieldModify;

    /**
     * 方法
     */
    @XmlAttribute(name = "methodReturn")
    private String methodReturn;
    @XmlAttribute(name = "methodName")
    private String methodName;
    @XmlAttribute(name = "methodModify")
    private ModifyEnum methodModify;
    @XmlAttribute(name = "methodDesc")
    private String methodDesc;
    @XmlAttribute(name = "methodAttr")
    private String methodAttr;

}
