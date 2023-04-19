package com.wakedt.visual.domain.account.account;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 用户的唯一标识，用于平台登录-聚合根
 */
@Data
public abstract class AbstractAccount {

    /** 用户 ID */
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

    /** 验证密码是否正确 */
    public abstract void checkLoginPass(String password);

    /** 验证重置密码唯一标识是否正确 */
    public abstract void checkUuidPass(String uuid);

}