package com.wakedt.visual.organization.domain.team;

/**
 * 团队-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
public interface TeamRepository {

    Team save(Team team);

    Team update(Team team);

    void remove(Team team);

    Team find(Long id);

}
