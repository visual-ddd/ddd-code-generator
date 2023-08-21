package com.wakedt.visual.domaindesign.app.cmd.domaindesigncreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新增业务域-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDesignCreateCmd {

    /** 名称 */
    private String name;

    /** 团队ID */
    private Long teamId;

    /** 标识符 */
    private String identity;

    /** 描述 */
    private String description;

    /** 起始版本号 */
    private String startVersion;

}