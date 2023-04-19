package com.wd.paas.generator.test;

import lombok.Data;

/**
 * 账号-聚合根
 *
 * @author zhuxueliang
 */
@Data
public abstract class AbstractAccount {

    /** 账号(目前以用户邮箱作为账号) */
    private String accountNo;

    /** 用户名 */
    private String userName;

    /** 密码 */
    private String password;

    /** 重置密码唯一标识 */
    private String uuid;

    /** 描述 */
    private String description;

    /** 用户头像 */
    private String icon;

    /**
     * 更改密码时验证密码是否正确
     *
     * @param password 密码
     */
    public abstract Boolean checkLoginPass(String password);

    /**
     * 验证重置密码唯一标识是否正确
     *
     * @param uuid uuid
     */
    public abstract void checkUuidPass(String uuid);

    /**
     * 验证是否为系统管理员
     */
    public abstract void checkSystemAdmin();

}