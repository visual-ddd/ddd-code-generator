package com.wakedt.visual.domain.businessscene.businessscene;

import com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify.BusinessSceneModifyCmd;
import com.wakedt.visual.domain.businessscene.businessscene.businesssceneremove.BusinessSceneRemoveCmd;

/**
 * 业务场景-聚合根能力
 *
 * @author shimmer
 * @since 1.0
 */
public class BusinessScene extends AbstractBusinessScene {

    public void businessSceneModify(BusinessSceneModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setDescription(updateCmd.getDescription());
    }

    public void businessSceneRemove(BusinessSceneRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }
}