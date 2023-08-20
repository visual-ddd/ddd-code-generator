package com.wakedt.visual.domain.organization.teammember;

/**
 * 团队成员-聚合根-仓储接口
 */
public interface TeamMemberRepository {

    TeamMember save(TeamMember teamMember);

    TeamMember update(TeamMember teamMember);

    void remove(TeamMember teamMember);

    TeamMember find(Long id);

}
