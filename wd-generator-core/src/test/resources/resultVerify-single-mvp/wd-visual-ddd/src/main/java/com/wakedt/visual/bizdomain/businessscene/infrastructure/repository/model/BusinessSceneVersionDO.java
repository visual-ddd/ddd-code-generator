package com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedata.common.mybatis.plus.po.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务场景版本实体类
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_business_scene_version")
public class BusinessSceneVersionDO extends BaseDO {

    /** 业务场景版本ID */
    @TableId(type = IdType.AUTO)
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
    private Integer versionState;
}