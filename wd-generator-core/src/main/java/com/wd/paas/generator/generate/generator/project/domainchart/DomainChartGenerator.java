package com.wd.paas.generator.generate.generator.project.domainchart;

import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.generator.AbstractGenerator;
import com.wd.paas.generator.generate.generator.DomainChartInfo;
import com.wd.paas.generator.generate.generator.project.domainchart.aggregation.AggregationGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.velocity.VelocityContext;

import java.util.List;

/**
 * DDD领域图谱生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DomainChartGenerator extends AbstractGenerator {

    /**
     * 领域图谱信息
     */
    private DomainChartInfo domainChartInfo;
    /**
     * 聚合列表
     */
    private List<AggregationGenerator> aggregationList;

    @Override
    public void generate(GenerateContext generateContext) {
        super.generate(generateContext);
        aggregationList.forEach(aggregation -> aggregation.run(generateContext));
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.DOMAIN_NAME, domainChartInfo.getName());
        context.put(VelocityLabel.DOMAIN_AUTHOR, domainChartInfo.getAuthor());
        context.put(VelocityLabel.DOMAIN_DATE_TIME, domainChartInfo.getDateTime());
    }

    @Override
    public GenerateElementTypeEnum getElementTypeUrl() {
        return GenerateElementTypeEnum.DOMAIN_CHART;
    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String targetPath) {
        return super.parseOutputPath(templateUrl, context, targetPath)
                .replace(ModelUrlConstant.FIELD, domainChartInfo.getName())
                .replace(ModelUrlConstant.DOMAIN_CHART, domainChartInfo.getDescription());
    }
}
