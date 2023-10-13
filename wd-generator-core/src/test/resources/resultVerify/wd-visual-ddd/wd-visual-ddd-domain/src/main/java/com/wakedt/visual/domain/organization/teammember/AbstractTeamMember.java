package com.wakedt.visual.domain.organization.teammember;

import lombok.Data;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 团队成员-聚合根
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
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