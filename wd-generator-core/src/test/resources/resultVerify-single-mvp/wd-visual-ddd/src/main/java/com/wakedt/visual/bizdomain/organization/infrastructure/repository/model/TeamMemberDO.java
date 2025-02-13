package com.wakedt.visual.bizdomain.organization.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedata.common.mybatis.plus.po.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 团队成员实体类
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("wd_organization_team_member")
@Table(name = "wd_organization_team_member")
@Entity
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