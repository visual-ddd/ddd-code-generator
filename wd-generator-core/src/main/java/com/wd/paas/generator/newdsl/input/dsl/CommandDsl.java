package com.wd.paas.generator.newdsl.input.dsl;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class CommandDsl implements Serializable {

    private String name;

    private String description;

    private List<SourceDsl> sourceList;

    private RepositoryDsl repository;

    private List<PropertyDsl> propertyList;

    private DomainEventDsl domainEvent;

    private Boolean eventEnable;

    private List<RuleDsl> ruleList;

    private ReturnDsl returnDsl;

}
