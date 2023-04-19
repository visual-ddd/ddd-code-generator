package com.wakedt.visual.domain.domaindesign.domaindesignversion;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 描述业务域版本信息-聚合根
 */
@Data
public abstract class AbstractDomainDesignVersion {

    /** 业务域版本ID */
    private Long id;

    /** 业务域的唯一标识 */
    private Long domainDesignId;

    /** 第一次创建时，需要指定起始版本号 */
    private String startVersion;

    /** 当前版本的唯一标识 */
    private String currentVersion;

    /** 描述信息 */
    private String description;

    /** 业务域抽象文本描述语言 */
    private String domainDesignDsl;

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