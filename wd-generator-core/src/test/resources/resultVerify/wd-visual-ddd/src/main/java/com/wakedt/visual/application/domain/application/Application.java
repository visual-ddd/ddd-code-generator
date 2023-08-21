package com.wakedt.visual.application.domain.application;

import com.wakedt.visual.application.app.cmd.applicationmodify.ApplicationModifyCmd;
import com.wakedt.visual.application.app.cmd.applicationremove.ApplicationRemoveCmd;

/**
 * 应用-聚合根能力
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