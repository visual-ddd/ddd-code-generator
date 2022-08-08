package com.wake.generator.application.generate.util.model;

import lombok.Data;

import javax.xml.bind.annotation.*;

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