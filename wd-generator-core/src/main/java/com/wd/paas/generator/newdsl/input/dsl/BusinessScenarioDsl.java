package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessScenario;
import com.wd.paas.generator.newdsl.input.dsl.convert.BusinessScenarioDslConvert;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class BusinessScenarioDsl extends Versionable implements ElementBuildable {

    @Override
    public BusinessScenario build() {
        BusinessScenario businessScenario = BusinessScenarioDslConvert.INSTANCE.dto2Do(this);


        return businessScenario;
    }
}