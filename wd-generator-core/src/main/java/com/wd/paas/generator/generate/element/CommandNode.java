package com.wd.paas.generator.generate.element;


import com.wd.paas.common.PropertyInfo;
import com.wd.paas.common.ReturnInfo;
import com.wd.paas.common.RuleInfo;
import com.wd.paas.common.SourceInfo;
import com.wd.paas.common.enums.RepositoryTypeEnum;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Locale;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommandNode extends CompositeElement {

    private String name;

    private String description;

    private List<SourceInfo> sourceList;

    private RepositoryTypeEnum repository;

    private String category;

    private List<PropertyInfo> propertyList;

    private DomainEventNode astDomainEvent;

    private Boolean eventEnable;

    private List<RuleInfo> ruleList;

    private ReturnInfo returnInfo;

    private String packagePath;

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        AggregateNode astAggregate = (AggregateNode) this.getParentNode();
        String outputPath = astAggregate.getOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                // url
                ModelUrlConstant.ACTION,

                // cmd
                ModelUrlConstant.COMMAND_DTO_CLASS,
                ModelUrlConstant.COMMAND_CLASS,

                // event
                ModelUrlConstant.EVENT_CLASS,

                // Handler
                ModelUrlConstant.ADD_COMMAND_HANDLER_CLASS,
                ModelUrlConstant.UPDATE_COMMAND_HANDLER_CLASS,
                ModelUrlConstant.DELETE_COMMAND_HANDLER_CLASS
        };
        String[] replacementList = {
                // url
                category.toLowerCase(Locale.ROOT),

                // cmd
                category.concat(VelocityLabel.CLASS_DTO_SUFFIX),
                name,

                // event
                astDomainEvent.getName(),

                // handler
                name,
                name,
                name

        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

}
