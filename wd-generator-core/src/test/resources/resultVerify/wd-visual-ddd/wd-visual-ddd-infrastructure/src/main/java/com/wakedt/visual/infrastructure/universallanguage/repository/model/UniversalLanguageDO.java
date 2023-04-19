package com.wakedt.visual.infrastructure.universallanguage.repository.model;

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
 * 维护系统中统一语言的领域实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_universal_language")
@Entity
@Table(name = "wd_universal_language")
public class UniversalLanguageDO extends BaseJpaAggregate {

    /** 统一语言 ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 概念 */
    private String conception;

    /** 英文名 */
    private String englishName;

    /** 定义 */
    private String definition;

    /** 统一语言类型 */
    private Integer languageType;

    /** 约束 */
    private String restraint;

    /** 所属唯一标识(组织/团队的主键id) */
    private Long identity;

    /** 举例 */
    private String example;
}