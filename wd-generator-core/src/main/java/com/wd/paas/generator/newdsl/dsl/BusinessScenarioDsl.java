package com.wd.paas.generator.newdsl.dsl;

import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shimmer
 */
@AllArgsConstructor
@Data
public class BusinessScenarioDsl {

    private Info info;

    private Versionable versionable;
}