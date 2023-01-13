package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.input.dsl.convert.BusinessDomainDslConvert;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 描述一个完整业务提供的原子能力，以及实现细节
 *
 * @author shimmer
 */
@AllArgsConstructor
@Data
public class BusinessDomainDsl implements ElementBuildable {

    @SerializedName("info")
    private Info info;

    @SerializedName("versionable")
    private Versionable versionable;

    @SerializedName("domainModel")
    private DomainModelDsl domainModel;

    @Override
    public BusinessDomain build() {
        BusinessDomain businessDomain = BusinessDomainDslConvert.INSTANCE.dto2Do(this);


        return businessDomain;
    }
}
