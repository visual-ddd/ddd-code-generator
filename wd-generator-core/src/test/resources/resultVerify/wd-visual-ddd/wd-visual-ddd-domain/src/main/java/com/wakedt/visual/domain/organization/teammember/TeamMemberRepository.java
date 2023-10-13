package com.wakedt.visual.domain.organization.teammember;

/**
 * 团队成员-聚合根-仓储接口
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
public interface TeamMemberRepository {

    /**
     * 存储
     *
     * @param teamMember 团队成员
     * @return TeamMember
     */
    TeamMember save(TeamMember teamMember);

    /**
     * 更新
     *
     * @param teamMember 团队成员
     * @return TeamMember
     */
    TeamMember update(TeamMember teamMember);

    /**
     * 删除
     *
     * @param teamMember 团队成员
     */
    void remove(TeamMember teamMember);

    /**
     * 查询
     *
     * @param id 唯一标识
     * @return TeamMember
     */
    TeamMember find(Long id);

}
