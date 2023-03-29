package com.wakedt.visual.domain.application.application;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

/**
 * 维护应用及版本的领域-聚合根
 */
@Data
public abstract class AbstractApplication {

    /** 应用 ID */
    private Long id;

    /** 团队的唯一标识 */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 唯一标识，此处使用大驼峰命名 */
    private String identity;

    /** 生成项目时的包结构 */
    private String packageName;

    /** 描述信息 */
    private String description;

}