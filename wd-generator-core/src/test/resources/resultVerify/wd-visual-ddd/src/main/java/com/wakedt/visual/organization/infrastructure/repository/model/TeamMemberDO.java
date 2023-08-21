package com.wakedt.visual.organization.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedt.visual.organization.infrastructure.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 团队成员实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_organization_team_member")
@Entity
@Table(name = "wd_organization_team_member")
public class TeamMemberDO extends BaseJpaAggregate {

    /** 团队成员ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 成员账号ID */
    private Long accountId;

    /** 团队成员类型 */
    private String memberTypeList;
}