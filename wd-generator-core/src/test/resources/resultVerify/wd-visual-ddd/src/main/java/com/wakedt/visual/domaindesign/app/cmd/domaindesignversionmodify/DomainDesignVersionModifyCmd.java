package com.wakedt.visual.domaindesign.app.cmd.domaindesignversionmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 编辑业务域版本-指令
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