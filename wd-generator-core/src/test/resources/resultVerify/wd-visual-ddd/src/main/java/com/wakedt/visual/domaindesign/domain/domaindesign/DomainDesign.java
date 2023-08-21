package com.wakedt.visual.domaindesign.domain.domaindesign;

import com.wakedt.visual.domaindesign.app.cmd.domaindesignmodify.DomainDesignModifyCmd;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignremove.DomainDesignRemoveCmd;

/**
 * 业务域-聚合根能力
 */
public class DomainDesign extends AbstractDomainDesign {

    public void domainDesignModify(DomainDesignModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
    }

    public void domainDesignRemove(DomainDesignRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }
}