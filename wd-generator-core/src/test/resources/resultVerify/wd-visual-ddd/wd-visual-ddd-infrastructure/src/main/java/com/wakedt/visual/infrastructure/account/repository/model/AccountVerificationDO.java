package com.wakedt.visual.infrastructure.account.repository.model;

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
 * 账号进行邮箱验证操作时，需要使用验证码进行验证实体类
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("account_verification")
@Entity
@Table(name = "account_verification")
public class AccountVerificationDO extends BaseJpaAggregate {

    /** 实体唯一标识符 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 验证码 */
    private String code;

    /** 用户登录的唯一标识，目前以用户邮箱作为账号 */
    private String accountNo;
}