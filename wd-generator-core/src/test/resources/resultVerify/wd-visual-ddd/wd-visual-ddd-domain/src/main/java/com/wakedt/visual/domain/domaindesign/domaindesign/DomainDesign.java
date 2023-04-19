package com.wakedt.visual.domain.domaindesign.domaindesign;

import java.util.*;
import java.math.*;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify.DomainDesignModifyCmd;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove.DomainDesignRemoveCmd;

/**
 * 维护业务域及版本的领域-聚合根能力
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