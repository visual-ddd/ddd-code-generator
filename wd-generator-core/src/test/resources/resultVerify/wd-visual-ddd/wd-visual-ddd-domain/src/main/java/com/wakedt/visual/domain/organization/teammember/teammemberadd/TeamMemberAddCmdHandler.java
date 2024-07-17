package com.wakedt.visual.domain.organization.teammember.teammemberadd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.teammember.*;

/**
 * 添加团队成员-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class TeamMemberAddCmdHandler {

    @Resource
    private TeamMemberRepository repository;
    @Resource
    private TeamMemberFactory factory;

    public Long handle(TeamMemberAddCmd createCmd) {
        log.info("添加团队成员-指令处理器:{}", createCmd);

        TeamMember entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedTeamMember(团队成员不能重复) 校验团队成员是否重复 */

        TeamMember newEntity = repository.save(entity);

        return newEntity.getId();
    }
}