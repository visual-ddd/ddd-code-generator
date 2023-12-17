package com.wakedt.visual.infrastructure.account.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedt.visual.infrastructure.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 账号验证码实体类
 *
 * @author shimmer
 * @since 1.0
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

    /** 账号标识 */
    private String accountNo;
}