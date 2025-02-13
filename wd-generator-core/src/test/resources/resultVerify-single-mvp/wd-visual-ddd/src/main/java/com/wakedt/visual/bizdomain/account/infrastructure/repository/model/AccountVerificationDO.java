package com.wakedt.visual.bizdomain.account.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedata.common.mybatis.plus.po.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 账号验证码实体类
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("account_verification")
@Table(name = "account_verification")
@Entity
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