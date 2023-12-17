package com.wakedt.visual.domain.businessscene.businesssceneversion;

import lombok.Data;

/**
 * 业务场景版本-聚合根
 *
 * @author shimmer
 * @since 1.0
 */
@Data
public abstract class AbstractBusinessSceneVersion {

    /** 业务场景版本ID */
    private Long id;

    /** 业务场景ID */
    private Long businessSceneId;

    /** 描述 */
    private String description;

    /** 起始版本号 */
    private String startVersion;

    /** 当前版本号 */
    private String currentVersion;

    /** 业务场景DSL */
    private String businessSceneDsl;

    /** 图形DSL */
    private String graphDsl;

    /** 版本状态 */
    private VersionState versionState;

    /**
      * 版本号合法
      */
    public abstract void checkLegalVersion();

    /**
      * 发布锁定
      */
    public abstract void checkVersionPublishedException();

    /**
      * 未发布异常
      */
    public abstract void checkVersionUnPublishedException();

}