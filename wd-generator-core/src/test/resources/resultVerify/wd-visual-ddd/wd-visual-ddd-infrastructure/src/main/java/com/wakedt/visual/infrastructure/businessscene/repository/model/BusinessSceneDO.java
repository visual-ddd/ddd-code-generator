package com.wakedt.visual.infrastructure.businessscene.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedt.visual.infrastructure.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 业务场景实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_business_scene")
@Entity
@Table(name = "wd_business_scene")
public class BusinessSceneDO extends BaseJpaAggregate {

    /** 业务场景 ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
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