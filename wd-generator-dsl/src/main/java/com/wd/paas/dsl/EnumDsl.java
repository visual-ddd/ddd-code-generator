package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.EnumMemberInfo;
import com.wd.paas.common.Info;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * 枚举DSL
 *
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EnumDsl extends Info {

    /**
     * 基础类型：'number' | 'string'
     */
    @SerializedName("baseType")
    private String baseType;

    /**
     * 枚举成员信息列表
     */
    @SerializedName("members")
    private List<EnumMemberInfo> memberList;
}
