package com.wd.paas.generator.input.chartXml.util.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

/**
 * xml字段
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
public class MxGraphModel {

    @XmlElement(name = "root")
    private Root root;

}
