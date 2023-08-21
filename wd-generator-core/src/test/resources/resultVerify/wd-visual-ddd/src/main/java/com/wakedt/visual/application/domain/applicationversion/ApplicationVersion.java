package com.wakedt.visual.application.domain.applicationversion;

import com.wakedt.visual.application.app.cmd.applicationversionmodify.ApplicationVersionModifyCmd;
import com.wakedt.visual.application.app.cmd.applicationversionpublish.ApplicationVersionPublishCmd;
import com.wakedt.visual.application.app.cmd.applicationversionremove.ApplicationVersionRemoveCmd;
import com.wakedt.visual.application.app.cmd.businesssceneversionbind.BusinessSceneVersionBindCmd;
import com.wakedt.visual.application.app.cmd.domaindesignversionbind.DomainDesignVersionBindCmd;

/**
 * 应用版本-聚合根能力
 */
public class ApplicationVersion extends AbstractApplicationVersion {

    @Override
    public void checkVersionPublishedException() {
        /* TODO 发布锁定(当前版本发布后不能再进行任何操作) */
    }

    @Override
    public void checkVersionUnPublishedException() {
        /* TODO 未发布异常(当未发布时，抛出异常) */
    }

    @Override
    public void checkLegalVersion() {
        /* TODO 版本号合法(校验版本号命名是否符合标准) */
    }

    public void applicationVersionModify(ApplicationVersionModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setDescription(updateCmd.getDescription());
    }

    public void applicationVersionRemove(ApplicationVersionRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void businessSceneVersionBind(BusinessSceneVersionBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setBusinessSceneVersionIds(updateCmd.getBusinessSceneVersionIds());
    }

    public void domainDesignVersionBind(DomainDesignVersionBindCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setDomainDesignVersionIds(updateCmd.getDomainDesignVersionIds());
    }

    public void applicationVersionPublish(ApplicationVersionPublishCmd updateCmd) {
        this.setId(updateCmd.getId());
    }
}