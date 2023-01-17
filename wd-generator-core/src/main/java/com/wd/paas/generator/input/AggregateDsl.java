package com.wd.paas.generator.input;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.common.Info;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AggregateDsl extends Info {

    @SerializedName("root")
    private AggregateRootDsl root;

    @SerializedName("entities")
    private List<EntityDsl> entityList;

    @SerializedName("valueObjects")
    private List<ValueObjectDsl> valueObjectList;

    @SerializedName("enums")
    private List<EnumDsl> enumList;

    @SerializedName("commands")
    private List<CommandDsl> commandList;
}
