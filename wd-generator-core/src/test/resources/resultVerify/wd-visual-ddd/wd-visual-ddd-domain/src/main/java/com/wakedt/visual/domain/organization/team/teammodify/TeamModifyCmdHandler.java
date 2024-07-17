package com.wakedt.visual.domain.organization.team.teammodify;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import com.wakedt.visual.domain.organization.team.*;

/**
 * 编辑团队-指令处理器
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class TeamModifyCmdHandler {

    @Resource
    private TeamRepository repository;

    public void handle(TeamModifyCmd updateCmd) {
        log.info("编辑团队-指令处理器:{}", updateCmd);

        Team team = repository.find(updateCmd.getId());
        team.teamModify(updateCmd);

        /* TODO CheckRepeatedName(校验名称是否重复) 校验名称是否重复 */

        repository.update(team);

    }
}