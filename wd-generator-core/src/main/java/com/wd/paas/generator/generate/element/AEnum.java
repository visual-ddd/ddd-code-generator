package com.wd.paas.generator.generate.element;


import com.wd.paas.common.EnumMemberInfo;
import com.wd.paas.generator.generate.Visitor;
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
