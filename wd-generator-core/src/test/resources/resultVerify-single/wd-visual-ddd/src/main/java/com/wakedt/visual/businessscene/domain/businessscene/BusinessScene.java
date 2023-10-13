package com.wakedt.visual.businessscene.domain.businessscene;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.businessscene.app.cmd.businessscenemodify.BusinessSceneModifyCmd;
import com.wakedt.visual.businessscene.app.cmd.businesssceneremove.BusinessSceneRemoveCmd;

/**
 * 业务场景-聚合根
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
public class BusinessScene {

    /** 业务场景 ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 描述 */
    private String description;

    public void businessSceneModify(BusinessSceneModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
    }

    public void businessSceneRemove(BusinessSceneRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

}