package com.wakedt.visual.domain.organization.team;

/**
 * 每个团队是单一职责的，通常负责独立子领域的开发工作。-聚合根-仓储接口
 */
public interface TeamRepository {

    Team save(Team team);

    Team update(Team team);

    void remove(Team team);

    Team find(Long id);

}
