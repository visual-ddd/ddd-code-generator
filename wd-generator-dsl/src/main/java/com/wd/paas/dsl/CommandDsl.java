package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.PropertyInfo;
import com.wd.paas.common.ReturnInfo;
import com.wd.paas.common.RuleInfo;
import com.wd.paas.common.SourceInfo;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class CommandDsl {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("sources")
    private List<SourceInfo> sourceList;

    @SerializedName("repository")
    private String repository;

    @SerializedName("category")
    private String category;

    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    @SerializedName("domainEvent")
    private DomainEventDsl domainEvent;

    @SerializedName("eventEnable")
    private Boolean eventEnable;

    @SerializedName("rules")
    private List<RuleInfo> ruleList;

    @SerializedName("returnInfo")
    private ReturnInfo returnInfo;
}
