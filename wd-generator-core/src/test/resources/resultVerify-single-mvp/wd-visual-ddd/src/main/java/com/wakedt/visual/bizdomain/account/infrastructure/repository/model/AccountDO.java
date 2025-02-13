package com.wakedt.visual.bizdomain.account.infrastructure.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wakedata.common.mybatis.plus.po.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * 账号实体类
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("account")
@Table(name = "account")
@Entity
public class AccountDO extends BaseJpaAggregate {

    /** 用户 ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 账号 */
    private String accountNo;

    /** 用户名 */
    private String userName;

    /** 密码 */
    private String password;

    /** 用户头像 */
    private String icon;

    /** 描述 */
    private String description;

    /** 重置密码唯一标识 */
    private String uuid;
}