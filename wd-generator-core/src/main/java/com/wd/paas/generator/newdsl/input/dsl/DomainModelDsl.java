package com.wd.paas.generator.newdsl.input.dsl;


import lombok.Data;
import java.util.List;

/**
 * @author shimmer
 */
@Data
public class DomainModelDsl {

    private List<AggregateDsl> aggregates;
}
