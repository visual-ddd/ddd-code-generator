package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionpublish;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发布业务域版本-指令
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionPublishCmd {

    /** 业务域场景ID */
    private Long id;

}