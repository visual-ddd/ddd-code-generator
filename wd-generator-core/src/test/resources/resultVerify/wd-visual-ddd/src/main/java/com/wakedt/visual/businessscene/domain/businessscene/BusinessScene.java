package com.wakedt.visual.businessscene.domain.businessscene;

import com.wakedt.visual.businessscene.app.cmd.businessscenemodify.BusinessSceneModifyCmd;
import com.wakedt.visual.businessscene.app.cmd.businesssceneremove.BusinessSceneRemoveCmd;

/**
 * 业务场景-聚合根能力
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