package com.wake.generator.application.generate.util.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Root {

    @XmlElement(name = "object")
    private List<ObjectLabel> objectLabelList;

}
