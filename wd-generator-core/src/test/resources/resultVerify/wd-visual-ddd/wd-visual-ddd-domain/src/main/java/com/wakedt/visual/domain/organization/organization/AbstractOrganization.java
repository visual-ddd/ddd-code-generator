package com.wakedt.visual.domain.organization.organization;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 组织-聚合根
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
public abstract class AbstractOrganization {

    /** 组织 ID */
    private Long id;

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织管理员 */
    private Long organizationManagerId;

}