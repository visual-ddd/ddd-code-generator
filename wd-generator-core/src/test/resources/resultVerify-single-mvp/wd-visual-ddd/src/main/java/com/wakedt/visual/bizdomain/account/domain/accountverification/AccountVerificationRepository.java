package com.wakedt.visual.bizdomain.account.domain.accountverification;

/**
 * 账号验证码-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface AccountVerificationRepository {

    AccountVerification save(AccountVerification accountVerification);

    AccountVerification update(AccountVerification accountVerification);

    void remove(AccountVerification accountVerification);

    AccountVerification find(Long id);

}
