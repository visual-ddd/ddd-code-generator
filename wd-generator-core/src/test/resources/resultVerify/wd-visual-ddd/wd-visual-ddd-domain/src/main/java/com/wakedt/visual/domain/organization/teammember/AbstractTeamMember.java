package com.wakedt.visual.domain.organization.teammember;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 关联到当前团队的用户，团队管理员可以为成员绑定不同的团队职位-聚合根
 */
@Data
public abstract class AbstractTeamMember {

    /** 团队成员ID */
    private Long id;

    /** 团队唯一标识 */
    private Long teamId;

    /** 团队成员的账号唯一标识 */
    private Long accountId;

    /** 成员类型标签 */
    private List<MemberType> memberTypeList;

}