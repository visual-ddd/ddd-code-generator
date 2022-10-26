package com.wd.paas.generator.input.chartXml;

import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.input.chartXml.util.ChartXmlObjectParser;
import com.wd.paas.generator.input.chartXml.util.model.ChartXmlObject;
import java.io.InputStream;
import java.util.List;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 流转dto
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Slf4j
@Data
public final class ChartXmlStream2DomainChartDTO {

    public static ChartDTO getDomainChartDTO(InputStream chartXmlInputStream) {

        // 解析需要生成的图谱
        List<ChartXmlObject> chartXmlObjects = ChartXmlObjectParser.parse(chartXmlInputStream);

        ChartDTO domainChartDTO = new ChartDTO();
        DomainChartFactory domainChartFactory = new DomainChartFactory(domainChartDTO);

        for (ChartXmlObject chartXmlObject : chartXmlObjects) {
            domainChartFactory.putInstance(chartXmlObject);
        }
        return domainChartDTO;
    }

}
