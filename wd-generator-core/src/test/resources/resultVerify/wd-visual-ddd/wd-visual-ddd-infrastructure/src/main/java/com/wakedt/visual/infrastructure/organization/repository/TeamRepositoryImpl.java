package com.wakedt.visual.infrastructure.organization.repository;

import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.core.resultcode.CommonResultCode;
import com.wakedt.visual.domain.organization.team.Team;
import com.wakedt.visual.domain.organization.team.TeamRepository;
import com.wakedt.visual.infrastructure.organization.assembler.Team2TeamDOConvert;
import com.wakedt.visual.infrastructure.organization.repository.mapper.TeamMapper;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * 团队-聚合仓储实现类
 *
 * @author shimmer
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
        TeamDO result = Optional.ofNullable(teamMapper.selectById(id))
                .orElseThrow(() -> new BizException(CommonResultCode.NOT_EXISTS));
        return Team2TeamDOConvert.INSTANCE.do2Dto(result);
    }
}