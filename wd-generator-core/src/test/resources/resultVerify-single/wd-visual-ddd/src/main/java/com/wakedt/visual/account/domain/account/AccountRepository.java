package com.wakedt.visual.account.domain.account;

/**
 * 账号-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
public interface AccountRepository {

    Account save(Account account);

    Account update(Account account);

    void remove(Account account);

    Account find(Long id);

}
