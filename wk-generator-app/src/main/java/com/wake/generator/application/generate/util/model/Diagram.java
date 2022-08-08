package com.wake.generator.application.generate.util.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Diagram {

    @XmlElement(name = "mxGraphModel")
    private MxGraphModel mxGraphModel;

}
