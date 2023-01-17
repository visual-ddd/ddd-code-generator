package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.EnumMemberInfo;
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
