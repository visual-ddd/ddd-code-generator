package com.wakedt.visual.domain.application.applicationversion;

import lombok.Data;

import java.util.Set;

/**
 * 应用版本-聚合根
 *
 * @author shimmer
 * @since 1.0
 */
@Data
public abstract class AbstractApplicationVersion {

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
    public abstract void checkVersionPublishedException();

    /**
     * 未发布异常
     */
    public abstract void checkVersionUnPublishedException();

    /**
     * 版本号合法
     */
    public abstract void checkLegalVersion();

}