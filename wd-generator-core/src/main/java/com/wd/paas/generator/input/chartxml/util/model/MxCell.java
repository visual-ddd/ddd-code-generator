package com.wd.paas.generator.input.chartxml.util.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.Data;

/**
 * xml字段
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class MxCell {

    @XmlAttribute(name = "parent")
    private String parent;

    @XmlAttribute(name = "style")
    private String style;

}
