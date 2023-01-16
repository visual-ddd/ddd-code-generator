package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.generate.visitor.element.Aggregate;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.input.dsl.convert.AggregateDslConvert;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AggregateDsl extends Info implements ElementBuildable {

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

    @Override
    public Aggregate build() {
        Aggregate aggregate = AggregateDslConvert.INSTANCE.dto2Do(this);
        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(entityList).ifPresent(e -> e.stream().map(ElementBuildable::build).forEach(elements::add));
        Optional.ofNullable(valueObjectList).ifPresent(e -> e.stream().map(ElementBuildable::build).forEach(elements::add));
        Optional.ofNullable(enumList).ifPresent(e -> e.stream().map(ElementBuildable::build).forEach(elements::add));
        Optional.ofNullable(commandList).ifPresent(e -> e.stream().map(ElementBuildable::build).forEach(elements::add));
        aggregate.addAll(elements);
        return aggregate;
    }
}
