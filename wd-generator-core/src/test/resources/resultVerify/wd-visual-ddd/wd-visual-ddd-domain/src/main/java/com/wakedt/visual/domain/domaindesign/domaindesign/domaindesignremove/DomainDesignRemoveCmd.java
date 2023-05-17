package com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除业务域-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignRemoveCmd {

    /** 业务域 ID */
    private Long id;

}