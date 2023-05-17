package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 更新业务域DSL-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignDslUpdateCmd {

    /** 业务域场景ID */
    private Long id;

    /** 业务域DSL */
    private String domainDesignDsl;

    /** 图形DSL */
    private String graphDsl;

}