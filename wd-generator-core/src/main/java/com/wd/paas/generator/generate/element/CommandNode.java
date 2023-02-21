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
import java.util.Optional;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommandNode extends CompositeElement {

    private List<SourceInfo> sourceList;

    private RepositoryTypeEnum repository;

    private String category;

    private List<PropertyInfo> propertyList;

    private DomainEventNode astDomainEvent;

    private Boolean eventEnable;

    private List<RuleInfo> ruleList;

    private ReturnInfo returnInfo;

    private String packagePath;

    @Override
    public void initProperties() {
        super.initProperties();
        String oldName = this.getName();
        initClassName(oldName);
        this.setCategory(StringUtils.isBlank(category) ? excludeCmdSuffix() : category);

        // 事件
        String eventName = this.getName().concat(ModelUrlConstant.EVENT_CLASS);
        astDomainEvent.setName(Optional.ofNullable(astDomainEvent.getName()).orElse(eventName));
        astDomainEvent.setPropertyList(getEventProperties());
        astDomainEvent.setDescription(this.getDescription());
    }

    private void initClassName(String oldName) {
        if (oldName.endsWith(ModelUrlConstant.COMMAND_CLASS_SUFFIX)) {
            return;
        }
        this.setName(oldName.concat(ModelUrlConstant.COMMAND_CLASS_SUFFIX));
    }

    private List<PropertyInfo> getEventProperties() {
        List<PropertyInfo> eventPropertyList = astDomainEvent.getPropertyList();
        if (eventPropertyList == null || eventPropertyList.isEmpty()) {
            return this.getPropertyList();
        } else {
            eventPropertyList.addAll(this.getPropertyList());
            return eventPropertyList;
        }
    }

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
                getCmdDTOName(),
                this.getName(),

                // event
                astDomainEvent.getName(),

                // handler
                this.getName(),
                this.getName(),
                this.getName()
        };
        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    public String excludeCmdSuffix() {
        String name = this.getName();
        return name.substring(0, name.lastIndexOf(ModelUrlConstant.COMMAND_CLASS_SUFFIX));
    }

    public String getCmdDTOName() {
        return excludeCmdSuffix().concat(VelocityLabel.CLASS_DTO_SUFFIX);
    }
}
