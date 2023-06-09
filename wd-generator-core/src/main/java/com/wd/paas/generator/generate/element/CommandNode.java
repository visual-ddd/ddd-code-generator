package com.wd.paas.generator.generate.element;

import com.wd.paas.common.PropertyInfo;
import com.wd.paas.common.ReturnInfo;
import com.wd.paas.common.RuleInfo;
import com.wd.paas.common.SourceInfo;
import com.wd.paas.common.enums.RepositoryTypeEnum;
import com.wd.paas.common.enums.CommandSourceTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.List;
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

    private ExternalEventNode externalEventNode;

    private Boolean eventEnable;

    private List<RuleInfo> ruleList;

    private ReturnInfo returnInfo;

    private String packagePath;

    private String cmdNoSuffixName;

    private String cmdDTOName;

    /**
     * 提供给Velocity查询指令触发来源信息
     *
     * @param type 触发来源类型
     * @return 触发来源对应的value
     */
    public Object getSourceValue(String type) {
        CommandSourceTypeEnum commandSourceType = CommandSourceTypeEnum.of(type);
        for (SourceInfo sourceInfo : this.sourceList) {
            String sourceInfoType = sourceInfo.getType();
            if (commandSourceType.getValue().equals(sourceInfoType)) {
                return Optional.ofNullable(sourceInfo.getValue()).orElse(true);
            }
        }
        return false;
    }
}
