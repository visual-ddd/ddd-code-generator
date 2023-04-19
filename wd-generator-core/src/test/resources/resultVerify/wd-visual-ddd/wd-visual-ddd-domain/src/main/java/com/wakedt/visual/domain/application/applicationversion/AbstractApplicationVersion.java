package com.wakedt.visual.domain.application.applicationversion;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 描述应用版本信息-聚合根
 */
@Data
public abstract class AbstractApplicationVersion {

    /** 应用版本ID */
    private Long id;

    /** 应用的唯一标识 */
    private Long applicationId;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

    /** 当前版本的唯一标识 */
    private String currentVersion;

    /** 描述信息 */
    private String description;

    /** 当前应用关联的业务域版本ID列表 */
    private Set<Long> domainDesignVersionIds;

    /** 当前应用关联的业务场景版本ID列表 */
    private Set<Long> businessSceneVersionIds;

    /** 版本状态 */
    private VersionState versionState;

    /** 当前版本发布后不能再进行任何操作 */
    public abstract void checkVersionPublishedException();

    /** 当未发布时，抛出异常 */
    public abstract void checkVersionUnPublishedException();

    /** 校验版本号命名是否符合标准 */
    public abstract void checkLegalVersion();

}