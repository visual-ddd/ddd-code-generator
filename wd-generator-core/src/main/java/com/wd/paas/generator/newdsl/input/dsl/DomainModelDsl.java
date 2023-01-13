package com.wd.paas.generator.newdsl.input.dsl;


import com.wd.paas.generator.newdsl.generate.visitor.element.DomainModel;
import lombok.Data;

import java.util.List;

/**
 * @author shimmer
 */
@Data
public class DomainModelDsl implements ElementBuildable {

    private List<AggregateDsl> aggregates;

    @Override
    public DomainModel build() {
        return null;
    }
}
