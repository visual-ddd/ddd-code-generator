package com.wakedt.visual.domaindesign.app.cmd.domaindesignmodify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 编辑业务域-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignModifyCmd {

    /** 业务域 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

}