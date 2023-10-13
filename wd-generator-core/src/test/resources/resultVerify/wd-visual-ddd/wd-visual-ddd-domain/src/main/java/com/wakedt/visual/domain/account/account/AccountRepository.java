package com.wakedt.visual.domain.account.account;

/**
 * 账号-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
public interface AccountRepository {

    /**
     * 存储
     *
     * @param account 账号
     * @return Account
     */
    Account save(Account account);

    /**
     * 更新
     *
     * @param account 账号
     * @return Account
     */
    Account update(Account account);

    /**
     * 删除
     *
     * @param account 账号
     */
    void remove(Account account);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return Account
     */
    Account find(Long id);

}
