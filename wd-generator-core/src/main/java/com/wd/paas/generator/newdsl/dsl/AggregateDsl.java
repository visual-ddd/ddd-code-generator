package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class AggregateDsl implements Serializable {

    private AggregateRootDsl root;

    private List<EntityDsl> entityList;

    private List<ValueObjectDsl> valueObjectList;

    private List<EnumDsl> enumList;

    private List<CommandDsl> commandList;
}
