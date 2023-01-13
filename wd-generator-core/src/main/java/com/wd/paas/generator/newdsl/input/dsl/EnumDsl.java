package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.common.EnumMemberInfo;
import com.wd.paas.generator.newdsl.generate.visitor.element.AEnum;
import com.wd.paas.generator.newdsl.input.dsl.convert.EnumDslConvert;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class EnumDsl implements ElementBuildable {

    private String name;

    private String description;

    private String baseType;

    private List<EnumMemberInfo> memberList;

    @Override
    public AEnum build() {
        AEnum anEnum = EnumDslConvert.INSTANCE.dto2Do(this);
        return anEnum;
    }
}
