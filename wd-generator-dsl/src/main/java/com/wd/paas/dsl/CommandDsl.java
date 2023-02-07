package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * 指令/命令DSL
 * 描述一个业务动作的原子能力
 *
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommandDsl extends Info {

    /**
     * 命令的触发来源，默认为 http, rpc 两种类型
     */
    @SerializedName("source")
    private List<SourceInfo> sourceList;

    /**
     * 绑定的仓储能力
     */
    @SerializedName("repository")
    private String repository;

    /**
     * 命令分类，小写，可选，会影响 java 包结构，如果未提供，则为 name
     */
    @SerializedName("category")
    private String category;

    /**
     * 命令属性
     */
    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    /**
     * 指令处理器DSL
     */
    @SerializedName("handler")
    private HandlerDsl handler;

    /**
     * 事件, 即命令执行完成之后的触发的领域事件
     */
    @SerializedName("event")
    private DomainEventDsl domainEvent;

    /**
     * 事件是否是需要发送  false 不发送，true 发送
     */
    @SerializedName("eventSendable")
    private Boolean eventEnable;

    /**
     * 规则列表
     */
    @SerializedName("rules")
    private List<RuleInfo> ruleList;

    /**
     * 命令返回值，默认为 void
     * 备注：可能不符合 CQRS 严格定义
     */
    @SerializedName("return")
    private ReturnInfo returnInfo;
}
