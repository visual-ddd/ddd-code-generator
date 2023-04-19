package com.wakedt.visual.domain.businessscene.businessscene;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 维护业务场景及版本的领域-聚合根
 */
@Data
public abstract class AbstractBusinessScene {

    /** 业务场景 ID */
    private Long id;

    /** 团队的唯一标识 */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 唯一标识，此处使用大驼峰命名 */
    private String identity;

    /** 描述信息 */
    private String description;

}