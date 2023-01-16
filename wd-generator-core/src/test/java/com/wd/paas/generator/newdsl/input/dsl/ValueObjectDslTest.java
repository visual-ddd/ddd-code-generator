package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.RuleInfo;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.constant.CmdTypeEnum;
import com.wd.paas.generator.newdsl.generate.visitor.element.*;
import com.wd.paas.generator.newdsl.generate.visitor.objectstruct.DslStruct;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.TemplateContext;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValueObjectDslTest {

    @Test
    public void accept() {
        Application application = getApplication("app1","domain1","aggregate1","valueObject1", "command1");

        DslStruct dslStruct = new DslStruct();
        dslStruct.add(application);

        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./",null));
        dslStruct.accept(javaTemplateVisitor);

        Assert.assertTrue(true);
    }

    private static Application getApplication(String appName,String domainName,String aggregateName, String valueObjectName,String commandName) {
        Application application = new Application();
/*        application.setInfo(Info.builder().name(appName).build());
        application.setVersionable(Versionable.builder().version("R5.0").build());

        BusinessDomain businessDomain = new BusinessDomain();
        businessDomain.setInfo(Info.builder().name(appName + domainName).build());*/

        Aggregate aggregate = new Aggregate();
        aggregate.setRoot(AggregateRoot.builder().name(aggregateName).build());

        ValueObject valueObject = new ValueObject();
        valueObject.setDescription("值对象");
        valueObject.setName(valueObjectName);

        List<PropertyInfo> properties = new ArrayList<>();
        properties.add(new PropertyInfo("wcs","String","字段","private"));
        valueObject.setPropertyList(properties);

        Command command = new Command();
        command.setCategory("create");
        command.setDescription("指令");
        command.setRepository(CmdTypeEnum.SAVE);
        command.setEventEnable(true);
        command.setName(commandName);
        command.setRuleList(Collections.singletonList(RuleInfo.builder().name("HAHAHA").build()));

        DomainEvent domainEvent = new DomainEvent();
        domainEvent.setName("指令事件");
        command.setDomainEvent(domainEvent);

        aggregate.add(command);
        aggregate.add(valueObject);
//        businessDomain.add(aggregate);
//        application.add(businessDomain);
        return application;
    }

}