package com.wakedt.visual.organization.domain.teammember;

/**
 * 团队成员-聚合根-仓储接口
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
public interface TeamMemberRepository {

    TeamMember save(TeamMember teamMember);

    TeamMember update(TeamMember teamMember);

    void remove(TeamMember teamMember);

    TeamMember find(Long id);

}
