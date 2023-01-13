package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.generate.visitor.element.DomainModel;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.input.dsl.convert.DomainModelDslConvert;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author shimmer
 */
@Data
public class DomainModelDsl implements ElementBuildable {

    @SerializedName("aggregates")
    private List<AggregateDsl> aggregateList;

    @Override
    public DomainModel build() {
        DomainModel domainModel = DomainModelDslConvert.INSTANCE.dto2Do(this);
        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(aggregateList).ifPresent(e -> e.stream().map(ElementBuildable::build).forEach(elements::add));
        domainModel.addAll(elements);
        return domainModel;
    }
}
