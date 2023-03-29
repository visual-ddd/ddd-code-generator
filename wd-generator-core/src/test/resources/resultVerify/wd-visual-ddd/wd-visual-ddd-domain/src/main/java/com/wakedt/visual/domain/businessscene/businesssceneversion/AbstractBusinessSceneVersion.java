package com.wakedt.visual.domain.businessscene.businesssceneversion;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

/**
 * 描述业务场景版本信息-聚合根
 */
@Data
public abstract class AbstractBusinessSceneVersion {

    /** 业务场景版本ID */
    private Long id;

    /** 业务场景的唯一标识 */
    private Long businessSceneId;

    /** 描述信息 */
    private String description;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

    /** 当前版本的唯一标识 */
    private String currentVersion;

    /** 业务场景抽象文本描述语言 */
    private String businessSceneDsl;

    /** 图形的抽象文本描述语言 */
    private String graphDsl;

    /** 版本状态 */
    private VersionState versionState;

    /** 校验版本号命名是否符合标准 */
    public abstract void checkLegalVersion();

    /** 当前版本发布后不能再进行任何操作 */
    public abstract void checkVersionPublishedException();

    /** 当未发布时，抛出异常 */
    public abstract void checkVersionUnPublishedException();

}