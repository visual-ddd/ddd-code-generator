package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class HandlerDsl {
    private String name;

    private String description;

    private List<SourceDsl> sourceList;

    private RepositoryDsl repository;

    private List<PropertyDsl> propertyList;

    private DomainEventDsl domainEvent;

    private Boolean eventSend;

    private List<RuleDsl> ruleList;

    private ReturnDsl returnDsl;

}
