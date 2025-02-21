package com.wakedt.visual.bizdomain.organization.app;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationQuery;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationPageQuery;
import com.wakedt.visual.bizdomain.organization.client.request.TeamQuery;
import com.wakedt.visual.bizdomain.organization.client.request.TeamPageQuery;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberByTeamIdPageQuery;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationCreateDTO;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationModifyDTO;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationRemoveDTO;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationManagerUnbindDTO;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationManagerBindDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamCreateDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamModifyDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamRemoveDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamManagerBindDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamManagerUnBindDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberAddDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberRemoveDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberRoleBindDTO;
import com.wakedt.visual.bizdomain.organization.client.request.TeamMemberRoleUnBindDTO;
import com.wakedt.visual.bizdomain.organization.client.response.OrganizationDTO;
import com.wakedt.visual.bizdomain.organization.client.response.TeamDTO;
import com.wakedt.visual.bizdomain.organization.client.response.TeamMemberDTO;
import com.wakedt.visual.bizdomain.organization.domain.organization.OrganizationRepository;
import com.wakedt.visual.bizdomain.organization.domain.team.TeamRepository;
import com.wakedt.visual.bizdomain.organization.domain.teammember.TeamMemberRepository;
import com.wakedt.visual.bizdomain.organization.domain.organization.Organization;
import com.wakedt.visual.bizdomain.organization.domain.team.Team;
import com.wakedt.visual.bizdomain.organization.domain.teammember.TeamMember;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.mapper.OrganizationMapper;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.mapper.TeamMapper;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.mapper.TeamMemberMapper;
import com.wakedt.visual.bizdomain.organization.app.assembler.OrganizationDTO2OrganizationDOConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.OrganizationDTO2OrganizationDOConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamDTO2TeamDOConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamDTO2TeamDOConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamMemberDTO2TeamMemberDOConvert;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.OrganizationDO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.OrganizationDO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamDO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamDO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.TeamMemberDO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 组织域
 *
 * @author visual-ddd
 * @since 1.0
 */
@Service
@AllArgsConstructor
public class OrganizationApplication {

    private OrganizationRepository organizationRepository;
    private TeamRepository teamRepository;
    private TeamMemberRepository teamMemberRepository;
    private OrganizationMapper organizationMapper;
    private TeamMapper teamMapper;
    private TeamMemberMapper teamMemberMapper;

    public ResultDTO<Long> organizationCreate(OrganizationCreateDTO dto) {
        Organization entity = BeanUtil.copyProperties(dto, Organization.class);
        Organization newEntity = organizationRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<Boolean> organizationModify(OrganizationModifyDTO dto) {
        Organization entity = organizationRepository.find(dto.getId());
        entity.organizationModify(dto);
        organizationRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> organizationRemove(OrganizationRemoveDTO dto) {
        Organization entity = organizationRepository.find(dto.getId());
        entity.organizationRemove(dto);
        organizationRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> organizationManagerUnbind(OrganizationManagerUnbindDTO dto) {
        Organization entity = organizationRepository.find(dto.getId());
        entity.organizationManagerUnbind(dto);
        organizationRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> organizationManagerBind(OrganizationManagerBindDTO dto) {
        Organization entity = organizationRepository.find(dto.getId());
        entity.organizationManagerBind(dto);
        organizationRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> teamCreate(TeamCreateDTO dto) {
        Team entity = BeanUtil.copyProperties(dto, Team.class);
        Team newEntity = teamRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<Boolean> teamModify(TeamModifyDTO dto) {
        Team entity = teamRepository.find(dto.getId());
        entity.teamModify(dto);
        teamRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamRemove(TeamRemoveDTO dto) {
        Team entity = teamRepository.find(dto.getId());
        entity.teamRemove(dto);
        teamRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamManagerBind(TeamManagerBindDTO dto) {
        Team entity = teamRepository.find(dto.getId());
        entity.teamManagerBind(dto);
        teamRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamManagerUnbind(TeamManagerUnBindDTO dto) {
        Team entity = teamRepository.find(dto.getId());
        entity.teamManagerUnbind(dto);
        teamRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> teamMemberAdd(TeamMemberAddDTO dto) {
        TeamMember entity = BeanUtil.copyProperties(dto, TeamMember.class);
        TeamMember newEntity = teamMemberRepository.save(entity);
        return ResultDTO.success(newEntity.getId());
    }

    public ResultDTO<Boolean> teamMemberRemove(TeamMemberRemoveDTO dto) {
        TeamMember entity = teamMemberRepository.find(dto.getId());
        entity.teamMemberRemove(dto);
        teamMemberRepository.remove(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamMemberRoleBind(TeamMemberRoleBindDTO dto) {
        TeamMember entity = teamMemberRepository.find(dto.getId());
        entity.teamMemberRoleBind(dto);
        teamMemberRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamManagerRoleUnbind(TeamMemberRoleUnBindDTO dto) {
        TeamMember entity = teamMemberRepository.find(dto.getId());
        entity.teamManagerRoleUnbind(dto);
        teamMemberRepository.update(entity);
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<OrganizationDTO> organizationQuery(OrganizationQuery query) {
        OrganizationDO organizationDO = organizationMapper.organizationQuery(query);
        return ResultDTO.success(OrganizationDTO2OrganizationDOConvert.INSTANCE.do2Dto(organizationDO));
    }

    public PageResultDTO<List<OrganizationDTO>> organizationPageQuery(OrganizationPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<OrganizationDO> pageInfo = new PageInfo<>(organizationMapper.organizationPageQuery(pageQuery));
        return OrganizationDTO2OrganizationDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public ResultDTO<TeamDTO> teamQuery(TeamQuery query) {
        TeamDO teamDO = teamMapper.teamQuery(query);
        return ResultDTO.success(TeamDTO2TeamDOConvert.INSTANCE.do2Dto(teamDO));
    }

    public PageResultDTO<List<TeamDTO>> teamPageQuery(TeamPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<TeamDO> pageInfo = new PageInfo<>(teamMapper.teamPageQuery(pageQuery));
        return TeamDTO2TeamDOConvert.INSTANCE.convertPage(pageInfo);
    }

    public PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery) {
        PageHelper.startPage(pageQuery.getPageNo(),pageQuery.getPageSize());
        PageInfo<TeamMemberDO> pageInfo = new PageInfo<>(teamMemberMapper.teamMemberByTeamIdPageQuery(pageQuery));
        return TeamMemberDTO2TeamMemberDOConvert.INSTANCE.convertPage(pageInfo);
    }
}