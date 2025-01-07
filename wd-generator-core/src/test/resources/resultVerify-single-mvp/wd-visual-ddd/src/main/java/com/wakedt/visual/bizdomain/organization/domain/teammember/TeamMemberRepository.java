package com.wakedt.visual.bizdomain.organization.domain.teammember;

/**
 * 团队成员-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0
 */
public interface TeamMemberRepository {

    TeamMember save(TeamMember teamMember);

    TeamMember update(TeamMember teamMember);

    void remove(TeamMember teamMember);

    TeamMember find(Long id);

}
