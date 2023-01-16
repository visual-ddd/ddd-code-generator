package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
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

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("baseType")
    private String baseType;

    @SerializedName("members")
    private List<EnumMemberInfo> memberList;

    @Override
    public AEnum build() {
        AEnum anEnum = EnumDslConvert.INSTANCE.dto2Do(this);
        return anEnum;
    }
}
