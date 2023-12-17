package com.wakedt.visual.domain.organization.teammember;

import lombok.Data;

import java.util.List;

/**
 * 团队成员-聚合根
 *
 * @author shimmer
 * @since 1.0
 */
@Data
public abstract class AbstractTeamMember {

    /** 团队成员ID */
    private Long id;

    /** 团队ID */
    private Long teamId;

    /** 成员账号ID */
    private Long accountId;

    /** 成员类型标签 */
    private List<MemberType> memberTypeList;

}