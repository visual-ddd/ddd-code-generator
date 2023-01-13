package com.wd.paas.generator.newdsl.generate.visitor.element;


import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import com.wd.paas.generator.newdsl.common.EnumMemberInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AEnum extends LeafElement{

    private String name;

    private String description;

    private String baseType;

    private List<EnumMemberInfo> memberList;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
