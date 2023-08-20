package com.wakedt.visual.domain.account.account;

/**
 * 账号-聚合根-仓储接口
 */
public interface AccountRepository {

    Account save(Account account);

    Account update(Account account);

    void remove(Account account);

    Account find(Long id);

}
