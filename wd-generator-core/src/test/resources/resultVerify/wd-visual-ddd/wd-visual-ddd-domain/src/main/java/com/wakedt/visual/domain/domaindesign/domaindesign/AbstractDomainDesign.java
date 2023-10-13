package com.wakedt.visual.domain.domaindesign.domaindesign;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务域-聚合根
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Data
public abstract class AbstractDomainDesign {

    /** 业务域 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 团队ID */
    private Long teamId;

    /** 标识符 */
    private String identity;

    /** 描述 */
    private String description;

}