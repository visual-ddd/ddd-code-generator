package com.wakedt.visual.infrastructure.organization.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

import com.wakedt.visual.infrastructure.BaseJpaAggregate;

/**
 * 关联到当前团队的用户，团队管理员可以为成员绑定不同的团队职位实体类
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "team_member")
@TableName("team_member")
public class TeamMemberDO extends BaseJpaAggregate {

    /** 团队成员ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 团队唯一标识 */
    private Long teamId;

    /** 团队成员的账号唯一标识 */
    private Long accountId;

    /** 团队成员在所属团队中扮演的职位 */
    private String memberTypeList;
}