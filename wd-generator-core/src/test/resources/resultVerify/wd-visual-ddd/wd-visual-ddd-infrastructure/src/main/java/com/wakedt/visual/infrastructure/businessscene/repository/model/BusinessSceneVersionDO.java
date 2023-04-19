package com.wakedt.visual.infrastructure.businessscene.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.*;
import java.math.*;

import com.wakedt.visual.infrastructure.BaseJpaAggregate;

/**
 * 描述业务场景版本信息实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_business_scene_version")
@Entity
@Table(name = "wd_business_scene_version")
public class BusinessSceneVersionDO extends BaseJpaAggregate {

    /** 业务场景版本ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
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
    private Integer versionState;
}