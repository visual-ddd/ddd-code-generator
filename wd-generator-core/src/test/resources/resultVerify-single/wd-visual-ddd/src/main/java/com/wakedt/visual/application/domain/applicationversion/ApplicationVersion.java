package com.wakedt.visual.application.domain.applicationversion;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.application.app.cmd.applicationversionmodify.ApplicationVersionModifyCmd;
import com.wakedt.visual.application.app.cmd.applicationversionremove.ApplicationVersionRemoveCmd;
import com.wakedt.visual.application.app.cmd.businesssceneversionbind.BusinessSceneVersionBindCmd;
import com.wakedt.visual.application.app.cmd.domaindesignversionbind.DomainDesignVersionBindCmd;
import com.wakedt.visual.application.app.cmd.applicationversionpublish.ApplicationVersionPublishCmd;

/**
 * 应用版本-聚合根
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
public class ApplicationVersion {

    /** 应用版本ID */
    private Long id;

    /** 应用ID */
    private Long applicationId;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;

    /** 描述 */
    private String description;

    /** 关联业务域列表 */
    private Set<Long> domainDesignVersionIds;

    /** 关联业务场景列表 */
    private Set<Long> businessSceneVersionIds;

    /** 版本状态 */
    private VersionState versionState;

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

    /**
      * 版本号合法
      */
    public void checkLegalVersion(){
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