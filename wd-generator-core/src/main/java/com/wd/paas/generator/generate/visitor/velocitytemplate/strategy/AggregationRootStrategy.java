package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.AggregateRootNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author shimmer
 */
public class AggregationRootStrategy extends AbstractElementStrategy {

    private final AggregateRootNode aggregateRootNode;

    public AggregationRootStrategy(AggregateRootNode aggregateRootNode) {
        super(aggregateRootNode);
        this.aggregateRootNode = aggregateRootNode;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.AGGREGATION_ID, aggregateRootNode.getIdentity());
        context.put(VelocityLabel.AGGREGATION_CLASS_NAME, aggregateRootNode.getName());
        context.put(VelocityLabel.AGGREGATION_CLASS_DESCRIPTION, aggregateRootNode.getDescription());
        context.put(VelocityLabel.AGGREGATION_CLASS_TITLE, aggregateRootNode.getTitle());
        context.put(VelocityLabel.AGGREGATION_CLASS_ID, aggregateRootNode.getId());
        context.put(VelocityLabel.AGGREGATION_CLASS_FIELDS, aggregateRootNode.getPropertyList());
        context.put(VelocityLabel.AGGREGATION_CLASS_METHODS, aggregateRootNode.getMethodList());
    }

    @Override
    public List<String> getTemplatePathList() {
        return Arrays.asList(GenerateElementTypeEnum.AGGREGATION_ROOT.getTemplateUrls());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath) {
        AggregationStrategy aggregationStrategy = new AggregationStrategy((AggregateNode) aggregateRootNode.getParentNode());
        String outputPath = aggregationStrategy.parseOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.AGGREGATION_CLASS
        };
        String[] replacementList = {
                aggregateRootNode.getName()
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

}
