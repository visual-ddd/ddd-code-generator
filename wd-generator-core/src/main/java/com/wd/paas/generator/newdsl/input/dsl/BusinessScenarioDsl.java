package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessScenario;
import com.wd.paas.generator.newdsl.input.dsl.convert.BusinessDomainDslConvert;
import com.wd.paas.generator.newdsl.input.dsl.convert.BusinessScenarioDslConvert;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shimmer
 */
@AllArgsConstructor
@Data
public class BusinessScenarioDsl {

    @SerializedName("info")
    private Info info;

    @SerializedName("versionable")
    private Versionable versionable;

    public BusinessScenario buildBusinessScenario() {
        BusinessScenario businessScenario = BusinessScenarioDslConvert.INSTANCE.dto2Do(this);


        return businessScenario;
    }
}