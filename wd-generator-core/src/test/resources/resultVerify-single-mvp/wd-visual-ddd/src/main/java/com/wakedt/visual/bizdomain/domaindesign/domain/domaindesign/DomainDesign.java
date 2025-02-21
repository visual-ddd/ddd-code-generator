package com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignModifyDTO;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignRemoveDTO;

/**
 * 业务域-聚合根
 *
 * @author visual-ddd
 * @since 1.0
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

    public void domainDesignModify(DomainDesignModifyDTO updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
    }

    public void domainDesignRemove(DomainDesignRemoveDTO removeCmd) {
        this.setId(removeCmd.getId());
    }

}