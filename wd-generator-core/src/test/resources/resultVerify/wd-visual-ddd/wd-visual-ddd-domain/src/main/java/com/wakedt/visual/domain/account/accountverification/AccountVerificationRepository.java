package com.wakedt.visual.domain.account.accountverification;

/**
 * 账号进行邮箱验证操作时，需要使用验证码进行验证-聚合根-仓储接口
 */
public interface AccountVerificationRepository {

    AccountVerification save(AccountVerification accountVerification);

    AccountVerification update(AccountVerification accountVerification);

    void remove(AccountVerification accountVerification);

    AccountVerification find(Long id);

}
