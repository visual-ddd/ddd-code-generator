package com.wakedt.visual.bizdomain.organization.app.cmd.teammemberadd;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.bizdomain.organization.domain.teammember.*;

/**
 * 添加团队成员-指令处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Component
public class TeamMemberAddCmdHandler {

    @Resource
    private TeamMemberRepository repository;
    @Resource
    private TeamMemberFactory factory;

    public Long handle(TeamMemberAddCmd createCmd) {
        TeamMember entity = factory.getInstance(createCmd);

        /* TODO CheckRepeatedTeamMember(团队成员不能重复) 校验团队成员是否重复 */

        TeamMember newEntity = repository.save(entity);
        return newEntity.getId();
    }
}