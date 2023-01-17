package com.wd.paas.generator.input;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author shimmer
 */
@Data
public class DomainModelDsl {

    @SerializedName("aggregates")
    private List<AggregateDsl> aggregateList;

}
