package com.wake.generator.application.generate.util.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Root {

    @XmlElement(name = "object")
    private List<ObjectLabel> objectLabelList;

}
