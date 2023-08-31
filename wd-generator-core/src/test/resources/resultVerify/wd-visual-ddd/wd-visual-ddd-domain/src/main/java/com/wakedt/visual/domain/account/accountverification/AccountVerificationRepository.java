package com.wakedt.visual.domain.account.accountverification;

/**
 * 账号验证码-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0
 */
public interface AccountVerificationRepository {

    /**
     * 存储
     *
     * @param accountVerification 账号验证码
     * @return AccountVerification
     */
    AccountVerification save(AccountVerification accountVerification);

    /**
     * 更新
     *
     * @param accountVerification 账号验证码
     * @return AccountVerification
     */
    AccountVerification update(AccountVerification accountVerification);

    /**
     * 删除
     *
     * @param accountVerification 账号验证码
     */
    void remove(AccountVerification accountVerification);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return AccountVerification
     */
    AccountVerification find(Long id);

}
