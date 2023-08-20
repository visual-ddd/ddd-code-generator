package com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversioncreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新增业务域版本-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignVersionCreateCmd {

    /** 业务域ID */
    private Long domainDesignId;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;

}