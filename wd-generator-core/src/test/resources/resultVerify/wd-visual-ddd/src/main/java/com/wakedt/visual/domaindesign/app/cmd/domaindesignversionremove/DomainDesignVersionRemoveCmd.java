package com.wakedt.visual.domaindesign.app.cmd.domaindesignversionremove;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 删除业务域版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionRemoveCmd {

    /** 业务域场景ID */
    private Long id;

}