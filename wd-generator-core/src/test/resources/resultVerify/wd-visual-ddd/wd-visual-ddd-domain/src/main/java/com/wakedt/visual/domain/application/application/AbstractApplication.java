package com.wakedt.visual.domain.application.application;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 应用-聚合根
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Data
public abstract class AbstractApplication {

    /** 应用 ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 名称 */
    private String name;

    /** 标识符 */
    private String identity;

    /** 包名 */
    private String packageName;

    /** 描述 */
    private String description;

}