package com.wakedt.visual.domaindesign.domain.domaindesignversion;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionmodify.DomainDesignVersionModifyCmd;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionremove.DomainDesignVersionRemoveCmd;
import com.wakedt.visual.domaindesign.app.cmd.domaindesigndslupdate.DomainDesignDslUpdateCmd;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionpublish.DomainDesignVersionPublishCmd;

/**
 * 业务域版本-聚合根
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Data
public class DomainDesignVersion {

    /** 业务域版本ID */
    private Long id;

    /** 业务域ID */
    private Long domainDesignId;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;

    /** 业务域DSL */
    private String domainDesignDsl;

    /** 图形DSL */
    private String graphDsl;

    /** 版本状态 */
    private VersionState versionState;

    /**
      * 版本号合法
      */
    public void checkLegalVersion(){
        // TODO 版本号合法(校验版本号命名是否符合标准)
    }

    /**
      * 发布锁定
      */
    public void checkVersionPublishedException(){
        // TODO 发布锁定(当前版本发布后不能再进行任何操作)
    }

    /**
      * 未发布异常
      */
    public void checkVersionUnPublishedException(){
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