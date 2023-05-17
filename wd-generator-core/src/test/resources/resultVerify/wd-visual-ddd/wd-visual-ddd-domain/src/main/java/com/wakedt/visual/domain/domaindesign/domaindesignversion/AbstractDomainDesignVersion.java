package com.wakedt.visual.domain.domaindesign.domaindesignversion;

import lombok.Data;

/**
 * 业务域版本-聚合根
 */
@Data
public abstract class AbstractDomainDesignVersion {

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

    /** 版本号合法 */
    public abstract void checkLegalVersion();

    /** 发布锁定 */
    public abstract void checkVersionPublishedException();

    /** 未发布异常 */
    public abstract void checkVersionUnPublishedException();

}