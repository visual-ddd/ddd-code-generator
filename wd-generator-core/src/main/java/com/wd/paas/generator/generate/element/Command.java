package com.wd.paas.generator.generate.element;


import com.wd.paas.generator.common.PropertyInfo;
import com.wd.paas.generator.common.ReturnInfo;
import com.wd.paas.generator.common.RuleInfo;
import com.wd.paas.generator.common.SourceInfo;
import com.wd.paas.generator.constant.CmdTypeEnum;
import com.wd.paas.generator.generate.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Command extends CompositeElement{

    private String name;

    private String description;

    private List<SourceInfo> sourceList;

    private CmdTypeEnum repository;

    private String category;

    private List<PropertyInfo> propertyList;

    private DomainEvent domainEvent;

    private Boolean eventEnable;

    private List<RuleInfo> ruleList;

    private ReturnInfo returnInfo;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
