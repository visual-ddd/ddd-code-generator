package com.wakedt.visual.domain.businessscene.businessscene;

import java.util.List;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify.BusinessSceneModifyCmd;
import com.wakedt.visual.domain.businessscene.businessscene.businesssceneremove.BusinessSceneRemoveCmd;

/**
 * 维护业务场景及版本的领域-聚合根能力
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