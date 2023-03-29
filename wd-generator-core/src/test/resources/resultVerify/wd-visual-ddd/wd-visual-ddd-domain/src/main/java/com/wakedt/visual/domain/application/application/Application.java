package com.wakedt.visual.domain.application.application;

import java.util.List;
import com.wakedt.visual.domain.application.application.applicationmodify.ApplicationModifyCmd;
import com.wakedt.visual.domain.application.application.applicationremove.ApplicationRemoveCmd;

/**
 * 维护应用及版本的领域-聚合根能力
 */
public class Application extends AbstractApplication {

    public void applicationModify(ApplicationModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setName(updateCmd.getName());
        this.setPackageName(updateCmd.getPackageName());
        this.setDescription(updateCmd.getDescription());
    }

    public void applicationRemove(ApplicationRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }
}