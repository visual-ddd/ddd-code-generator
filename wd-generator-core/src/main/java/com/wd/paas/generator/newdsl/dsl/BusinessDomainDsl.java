package com.wd.paas.generator.newdsl.dsl;

import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 描述一个完整业务提供的原子能力，以及实现细节
 *
 * @author shimmer
 */
@AllArgsConstructor
@Data
public class BusinessDomainDsl {

    private Info info;

    private Versionable versionable;

    private DomainModelDsl domainModel;

}
