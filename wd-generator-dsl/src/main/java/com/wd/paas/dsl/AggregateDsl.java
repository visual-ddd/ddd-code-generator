package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.Info;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * 聚合DSL
 *
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AggregateDsl extends Info {

    /**
     * 聚合根DSL，指定一个实体作为聚合的根实体
     */
    @SerializedName("root")
    private EntityDsl root;

    /**
     * 实体DSL列表
     */
    @SerializedName("entities")
    private List<EntityDsl> entityList;

    /**
     * 值对象DSL列表
     */
    @SerializedName("valueObjects")
    private List<ValueObjectDsl> valueObjectList;

    /**
     * 枚举DSL列表
     */
    @SerializedName("enums")
    private List<EnumDsl> enumList;

    /**
     * 指令DSL列表
     */
    @SerializedName("commands")
    private List<CommandDsl> commandList;
}
