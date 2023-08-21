package com.wakedt.visual.domaindesign.domain.domaindesign;

import com.wakedt.visual.domaindesign.app.cmd.domaindesignmodify.DomainDesignModifyCmd;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignremove.DomainDesignRemoveCmd;
import lombok.Data;

/**
 * 业务域-聚合根
 */
@Data
public class DomainDesign {

    /** 业务域 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 团队ID */
    private Long teamId;

    /** 标识符 */
    private String identity;

    /** 描述 */
    private String description;

    public void domainDesignModify(DomainDesignModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
    }

    public void domainDesignRemove(DomainDesignRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

}