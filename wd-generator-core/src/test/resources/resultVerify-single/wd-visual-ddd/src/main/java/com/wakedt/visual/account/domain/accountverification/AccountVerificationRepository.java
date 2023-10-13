package com.wakedt.visual.account.domain.accountverification;

/**
 * 账号验证码-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
public interface AccountVerificationRepository {

    AccountVerification save(AccountVerification accountVerification);

    AccountVerification update(AccountVerification accountVerification);

    void remove(AccountVerification accountVerification);

    AccountVerification find(Long id);

}
