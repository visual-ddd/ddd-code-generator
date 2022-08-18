package com.wake.generator.application.generate.util.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Diagram {

    @XmlElement(name = "mxGraphModel")
    private MxGraphModel mxGraphModel;

}
