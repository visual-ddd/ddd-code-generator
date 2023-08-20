package com.wakedt.visual.domain.account.accountverification;

/**
 * 账号验证码-聚合根-仓储接口
 */
public interface AccountVerificationRepository {

    AccountVerification save(AccountVerification accountVerification);

    AccountVerification update(AccountVerification accountVerification);

    void remove(AccountVerification accountVerification);

    AccountVerification find(Long id);

}
