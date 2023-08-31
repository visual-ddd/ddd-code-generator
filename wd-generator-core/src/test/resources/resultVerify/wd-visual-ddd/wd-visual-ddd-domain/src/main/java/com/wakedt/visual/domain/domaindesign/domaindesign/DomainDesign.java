package com.wakedt.visual.domain.domaindesign.domaindesign;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify.DomainDesignModifyCmd;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove.DomainDesignRemoveCmd;

/**
 * 业务域-聚合根能力
 *
 * @author shimmer
 * @since 1.0
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