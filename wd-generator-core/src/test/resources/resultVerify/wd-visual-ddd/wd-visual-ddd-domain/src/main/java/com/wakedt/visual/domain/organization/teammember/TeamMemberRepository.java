package com.wakedt.visual.domain.organization.teammember;

/**
 * 关联到当前团队的用户，团队管理员可以为成员绑定不同的团队职位-聚合根-仓储接口
 */
public interface TeamMemberRepository {

    TeamMember save(TeamMember teamMember);

    TeamMember update(TeamMember teamMember);

    void remove(TeamMember teamMember);

    TeamMember find(Long id);

}
