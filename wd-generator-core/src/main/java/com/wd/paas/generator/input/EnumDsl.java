package com.wd.paas.generator.input;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.common.EnumMemberInfo;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class EnumDsl {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("baseType")
    private String baseType;

    @SerializedName("members")
    private List<EnumMemberInfo> memberList;
}
