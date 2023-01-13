package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.generate.visitor.element.Aggregate;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.input.dsl.convert.AggregateDslConvert;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class AggregateDsl implements ElementBuildable {

    private AggregateRootDsl root;

    private List<EntityDsl> entityList;

    private List<ValueObjectDsl> valueObjectList;

    private List<EnumDsl> enumList;

    private List<CommandDsl> commandList;

    @Override
    public Aggregate build() {
        Aggregate aggregate = AggregateDslConvert.INSTANCE.dto2Do(this);
        List<Element> elements = new ArrayList<>();
        entityList.stream().map(ElementBuildable::build).forEach(elements::add);
        valueObjectList.stream().map(ElementBuildable::build).forEach(elements::add);
        enumList.stream().map(ElementBuildable::build).forEach(elements::add);
        commandList.stream().map(ElementBuildable::build).forEach(elements::add);
        aggregate.addAll(elements);
        return aggregate;
    }
}
