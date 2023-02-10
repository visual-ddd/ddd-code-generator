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
public class ASTAggregate extends CompositeElement {

    private ASTAggregateRoot root;

    public List<ASTCommand> getCommandList() {
        return getChildElementList(ASTCommand.class);
    }

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        ASTDomainModel domainModel = (ASTDomainModel) this.getParentNode();
        ASTBusinessDomain astBusinessDomain = (ASTBusinessDomain) domainModel.getParentNode();

        ASTAggregateRoot astAggregateRoot = Optional.of(root).orElse(new ASTAggregateRoot());
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
