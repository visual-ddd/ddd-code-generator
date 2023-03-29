package com.wakedt.visual.infrastructure.account.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

import com.wakedt.visual.infrastructure.BaseJpaAggregate;

/**
 * 用户的唯一标识，用于平台登录实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("account")
@Entity
@Table(name = "account")
public class AccountDO extends BaseJpaAggregate {

    /** 用户 ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;

    /** 用户名 */
    private String userName;

    /** 密码 */
    private String password;

    /** 用户头像 */
    private String icon;

    /** 描述 */
    private String description;

    /** 用户重置密码时携带的唯一标识 */
    private String uuid;
}