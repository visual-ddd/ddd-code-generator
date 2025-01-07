package com.wakedt.visual.bizdomain.organization.infrastructure.repository;

import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.core.resultcode.CommonResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.bizdomain.organization.domain.team.Team;
import com.wakedt.visual.bizdomain.organization.domain.team.TeamRepository;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamDO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.mapper.TeamMapper;
import com.wakedt.visual.bizdomain.organization.infrastructure.assembler.Team2TeamDOConvert;

/**
 * Team-聚合仓储实现类
 *
 * @author visual-ddd
 * @since 1.0
 */
@Slf4j
@Component
public class TeamRepositoryImpl implements TeamRepository {

    @Resource
    private TeamMapper teamMapper;

    @Override
    public Team save(Team team) {
        TeamDO teamDO = Team2TeamDOConvert.INSTANCE.dto2Do(team);
        int insert = teamMapper.insert(teamDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return Team2TeamDOConvert.INSTANCE.do2Dto(teamDO);
    }

    @Override
    public Team update(Team team) {
        TeamDO teamDO = Team2TeamDOConvert.INSTANCE.dto2Do(team);
        int update = teamMapper.updateById(teamDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return Team2TeamDOConvert.INSTANCE.do2Dto(teamDO);
    }

    @Override
    public void remove(Team team) {
        TeamDO teamDO = Team2TeamDOConvert.INSTANCE.dto2Do(team);
        teamMapper.deleteById(teamDO.getId());
    }

    @Override
    public Team find(Long id) {
        TeamDO result = teamMapper.selectById(id);
        if (result == null) throw new BizException(CommonResultCode.NOT_EXISTS);
        return Team2TeamDOConvert.INSTANCE.do2Dto(result);
    }
}
