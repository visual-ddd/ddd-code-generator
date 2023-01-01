package com.wd.paas.generator.input.chartxml.util;

import com.wd.paas.generator.input.chartxml.util.model.ChartXmlObject;
import com.wd.paas.generator.input.chartxml.util.model.Diagram;
import com.wd.paas.generator.input.chartxml.util.model.MxFileRoot;
import com.wd.paas.generator.input.chartxml.util.model.MxGraphModel;
import com.wd.paas.generator.input.chartxml.util.model.Root;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * 从chartXml图谱文件流中,获取DDD元素相关的xml对象集合
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/26
 */
public class ChartXmlObjectParser {

    /**
     * 解析chartXml文件流, 获取DDD元素对应的xml对象集合
     *
     * @param chartXmlStream 图谱xml内容
     * @return DDD元素对应的xml对象集合
     */
    public static List<ChartXmlObject> parse(InputStream chartXmlStream) {
        MxFileRoot mxFileRoot;
        try {
            mxFileRoot = JAXBContextParseXmlUtil.xml2javaFromRecource(chartXmlStream,
                MxFileRoot.class);
        } catch (Exception e) {
            throw new RuntimeException("Xml文件流解析异常!", e);
        }
        return Optional.ofNullable(mxFileRoot)
            .map(MxFileRoot::getDiagramList)
            .map(diagrams -> diagrams.get(0))
            .map(Diagram::getMxGraphModel)
            .map(MxGraphModel::getRoot)
            .map(Root::getObjectLabelList)
            .orElse(Collections.emptyList());
    }

}