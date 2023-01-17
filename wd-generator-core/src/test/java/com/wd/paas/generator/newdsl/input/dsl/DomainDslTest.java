package com.wd.paas.generator.newdsl.input.dsl;

import com.google.common.reflect.TypeToken;
import com.wd.paas.generator.builder.ElementBuilder;
import com.wd.paas.generator.generate.DslParser;
import com.wd.paas.generator.generate.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.input.*;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DomainDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/applicationDsl.json", ApplicationDsl.class);
        List<BusinessDomainDsl> businessDomainDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/businessDomainDsl.json", new TypeToken<List<BusinessDomainDsl>>(){}.getType());
        List<AggregateDsl> aggregateDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/aggregationDsl.json", new TypeToken<List<AggregateDsl>>(){}.getType());
        List<CommandDsl> commandDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/commandDsl.json", new TypeToken<List<CommandDsl>>(){}.getType());
        List<EntityDsl> entityDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/entityDsl.json", new TypeToken<List<EntityDsl>>(){}.getType());
        List<EnumDsl> enumDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/enumDsl.json", new TypeToken<List<EnumDsl>>(){}.getType());
        List<ValueObjectDsl> valueObjectDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/valueObjectDsl.json", new TypeToken<List<ValueObjectDsl>>(){}.getType());

        aggregateDslList.get(0).setEntityList(entityDslList);
        aggregateDslList.get(0).setEnumList(enumDslList);
        aggregateDslList.get(0).setValueObjectList(valueObjectDslList);
        aggregateDslList.get(0).setCommandList(commandDslList);
        businessDomainDslList.get(0).getDomainModel().setAggregateList(aggregateDslList);
        applicationDsl.setBusinessDomainList(businessDomainDslList);

        DslParser dslStruct = new DslParser();
        dslStruct.add(ElementBuilder.build(applicationDsl));

        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./",null));
        dslStruct.accept(javaTemplateVisitor);

        Assert.assertTrue(true);
    }
}