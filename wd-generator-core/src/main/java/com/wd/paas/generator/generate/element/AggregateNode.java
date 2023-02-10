package com.wd.paas.generator.generate.element;

import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AggregateNode extends CompositeElement {

    private AggregateRootNode root;

    public List<CommandNode> getCommandList() {
        return getChildElementList(CommandNode.class);
    }

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        DomainModelNode domainModel = (DomainModelNode) this.getParentNode();
        BusinessDomainNode astBusinessDomain = (BusinessDomainNode) domainModel.getParentNode();

        AggregateRootNode astAggregateRoot = Optional.of(root).orElse(new AggregateRootNode());
        String outputPath = astBusinessDomain.getOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                ModelUrlConstant.AGGREGATION,
                ModelUrlConstant.AGGREGATION_CLASS
        };
        String[] replacementList = {
                astAggregateRoot.getName().toLowerCase(),
                astAggregateRoot.getName()
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
