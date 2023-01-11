package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/***
 * @author： wangchensheng
 * @date： 2023-01-11 16:44
 * @version 1.0
 */
@Data
public class AggregateDsl implements Serializable {

    private AggregateRootDsl root;

    private List<EntityDsl> entities;

    private List<ValueObjectDsl> valueObjects;

    private List<EnumDsl> enums;

    private List<CommandDsl> commands;
}
