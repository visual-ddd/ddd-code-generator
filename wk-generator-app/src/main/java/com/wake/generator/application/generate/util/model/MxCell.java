package com.wake.generator.application.generate.util.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class MxCell {

    @XmlAttribute(name = "parent")
    private String parent;

    @XmlAttribute(name = "style")
    private String style;

}
