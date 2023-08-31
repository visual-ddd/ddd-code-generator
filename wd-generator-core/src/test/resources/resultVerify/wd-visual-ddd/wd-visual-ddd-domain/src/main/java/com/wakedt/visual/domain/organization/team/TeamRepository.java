package com.wakedt.visual.domain.organization.team;

/**
 * 团队-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0
 */
public interface TeamRepository {

    /**
     * 存储
     *
     * @param team 团队
     * @return Team
     */
    Team save(Team team);

    /**
     * 更新
     *
     * @param team 团队
     * @return Team
     */
    Team update(Team team);

    /**
     * 删除
     *
     * @param team 团队
     */
    void remove(Team team);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return Team
     */
    Team find(Long id);

}
