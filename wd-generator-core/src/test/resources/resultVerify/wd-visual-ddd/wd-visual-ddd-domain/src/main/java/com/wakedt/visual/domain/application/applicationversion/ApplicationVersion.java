package com.wakedt.visual.domain.application.applicationversion;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domain.application.applicationversion.applicationversionmodify.ApplicationVersionModifyCmd;
import com.wakedt.visual.domain.application.applicationversion.applicationversionremove.ApplicationVersionRemoveCmd;
import com.wakedt.visual.domain.application.applicationversion.businesssceneversionbind.BusinessSceneVersionBindCmd;
import com.wakedt.visual.domain.application.applicationversion.domaindesignversionbind.DomainDesignVersionBindCmd;
import com.wakedt.visual.domain.application.applicationversion.applicationversionpublish.ApplicationVersionPublishCmd;

/**
 * 应用版本-聚合根能力
 */
public class ApplicationVersion extends AbstractApplicationVersion {

    @Override
    public void checkVersionPublishedException() {
        // TODO 发布锁定(当前版本发布后不能再进行任何操作)
    }

    @Override
    public void checkVersionUnPublishedException() {
        // TODO 未发布异常(当未发布时，抛出异常)
    }

    @Override
    public void checkLegalVersion() {
        // TODO 版本号合法(校验版本号命名是否符合标准)
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