package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 编辑业务域版本-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionModifyCmd {

    /** 业务域场景ID */
    private Long id;

    /** 描述 */
    private String description;

}