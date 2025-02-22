package com.wakedt.visual.domain.organization.team.teammodify;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 编辑团队-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Component
public class TeamModifyCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamModifyCmd updateCmd) {
        Team team = repository.find(updateCmd.getId());
        team.teamModify(updateCmd);

        /* TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复 */

        repository.update(team);

    }
}