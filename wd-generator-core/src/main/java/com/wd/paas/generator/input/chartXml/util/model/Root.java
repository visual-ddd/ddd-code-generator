package com.wd.paas.generator.input.chartXml.util.model;

import java.util.List;
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
public class Root {

    @XmlElement(name = "object")
    private List<ChartXmlObject> objectLabelList;

}
