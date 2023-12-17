package com.wakedt.visual.domain.domaindesign.domaindesignversion;

import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate.DomainDesignDslUpdateCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify.DomainDesignVersionModifyCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionpublish.DomainDesignVersionPublishCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionremove.DomainDesignVersionRemoveCmd;

/**
 * 业务域版本-聚合根能力
 *
 * @author shimmer
 * @since 1.0
 */
public class DomainDesignVersion extends AbstractDomainDesignVersion {

    @Override
    public void checkLegalVersion() {
        // TODO 版本号合法(校验版本号命名是否符合标准)
    }

    @Override
    public void checkVersionPublishedException() {
        // TODO 发布锁定(当前版本发布后不能再进行任何操作)
    }

    @Override
    public void checkVersionUnPublishedException() {
        // TODO 未发布异常(当未发布时，抛出异常)
    }

    public void domainDesignVersionModify(DomainDesignVersionModifyCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setDescription(updateCmd.getDescription());
    }

    public void domainDesignVersionRemove(DomainDesignVersionRemoveCmd removeCmd) {
        this.setId(removeCmd.getId());
    }

    public void domainDesignDslUpdate(DomainDesignDslUpdateCmd updateCmd) {
        this.setId(updateCmd.getId());
        this.setDomainDesignDsl(updateCmd.getDomainDesignDsl());
        this.setGraphDsl(updateCmd.getGraphDsl());
    }

    public void domainDesignVersionPublish(DomainDesignVersionPublishCmd updateCmd) {
        this.setId(updateCmd.getId());
    }
}