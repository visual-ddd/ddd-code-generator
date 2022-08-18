package com.wake.generator.application.generate.util.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * module.xml pojo父节点定义
 *
 * @author 佟蕊
 */
@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement(name = "mxfile")
public class MXFileRoot {

    @XmlAttribute(name = "host")
    public String host;

    @XmlElement(name = "diagram")
    public Diagram diagram;

}