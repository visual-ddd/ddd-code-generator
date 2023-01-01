package com.wd.paas.generator.input.chartxml.util.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * chart.xml pojo父节点定义
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement(name = "mxfile")
public class MxFileRoot {

    @XmlElement(name = "diagram")
    public List<Diagram> diagramList;

}