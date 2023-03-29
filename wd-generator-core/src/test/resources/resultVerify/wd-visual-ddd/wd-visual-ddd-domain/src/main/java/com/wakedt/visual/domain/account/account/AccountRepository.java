package com.wakedt.visual.domain.account.account;

/**
 * 用户的唯一标识，用于平台登录-聚合根-仓储接口
 */
public interface AccountRepository {

    Account save(Account account);

    Account update(Account account);

    void remove(Account account);

    Account find(Long id);

}
