package com.wakedt.visual.domain.businessscene.businessscene;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务场景-聚合根
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
public abstract class AbstractBusinessScene {

    /** 业务场景 ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 描述 */
    private String description;

}