package com.wakedt.visual.app.organization;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.organization.assembler.*;
import com.wakedt.visual.app.organization.view.*;
import com.wakedt.visual.client.organization.OrganizationRpcService;
import com.wakedt.visual.client.organization.dto.OrganizationDTO;
import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.client.organization.dto.TeamMemberDTO;
import com.wakedt.visual.client.organization.query.*;
import com.wakedt.visual.domain.organization.organization.organizationcreate.OrganizationCreateCmdHandler;
import com.wakedt.visual.domain.organization.organization.organizationmanagerbind.OrganizationManagerBindCmdHandler;
import com.wakedt.visual.domain.organization.organization.organizationmanagerunbind.OrganizationManagerUnbindCmdHandler;
import com.wakedt.visual.domain.organization.organization.organizationmodify.OrganizationModifyCmdHandler;
import com.wakedt.visual.domain.organization.organization.organizationremove.OrganizationRemoveCmdHandler;
import com.wakedt.visual.domain.organization.team.teamcreate.TeamCreateCmdHandler;
import com.wakedt.visual.domain.organization.team.teammanagerbind.TeamManagerBindCmdHandler;
import com.wakedt.visual.domain.organization.team.teammanagerunbind.TeamManagerUnBindCmdHandler;
import com.wakedt.visual.domain.organization.team.teammodify.TeamModifyCmdHandler;
import com.wakedt.visual.domain.organization.team.teamremove.TeamRemoveCmdHandler;
import com.wakedt.visual.domain.organization.teammember.teammanagerroleunbind.TeamMemberRoleUnBindCmdHandler;
import com.wakedt.visual.domain.organization.teammember.teammemberadd.TeamMemberAddCmdHandler;
import com.wakedt.visual.domain.organization.teammember.teammemberremove.TeamMemberRemoveCmdHandler;
import com.wakedt.visual.domain.organization.teammember.teammemberrolebind.TeamMemberRoleBindCmdHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 组织域-RPC能力接口实现
 */
@Service
public class OrganizationRpcServiceImpl implements OrganizationRpcService {

    @Resource
    private OrganizationCreateCmdHandler organizationCreateCmdHandler;
    @Resource
    private OrganizationModifyCmdHandler organizationModifyCmdHandler;
    @Resource
    private OrganizationRemoveCmdHandler organizationRemoveCmdHandler;
    @Resource
    private OrganizationManagerUnbindCmdHandler organizationManagerUnbindCmdHandler;
    @Resource
    private OrganizationManagerBindCmdHandler organizationManagerBindCmdHandler;
    @Resource
    private TeamCreateCmdHandler teamCreateCmdHandler;
    @Resource
    private TeamModifyCmdHandler teamModifyCmdHandler;
    @Resource
    private TeamRemoveCmdHandler teamRemoveCmdHandler;
    @Resource
    private TeamManagerBindCmdHandler teamManagerBindCmdHandler;
    @Resource
    private TeamManagerUnBindCmdHandler teamManagerUnBindCmdHandler;
    @Resource
    private TeamMemberAddCmdHandler teamMemberAddCmdHandler;
    @Resource
    private TeamMemberRemoveCmdHandler teamMemberRemoveCmdHandler;
    @Resource
    private TeamMemberRoleBindCmdHandler teamMemberRoleBindCmdHandler;
    @Resource
    private TeamMemberRoleUnBindCmdHandler teamMemberRoleUnBindCmdHandler;
    @Resource
    private OrganizationQueryExe organizationQueryExe;
    @Resource
    private OrganizationPageQueryExe organizationPageQueryExe;
    @Resource
    private TeamQueryExe teamQueryExe;
    @Resource
    private TeamPageQueryExe teamPageQueryExe;
    @Resource
    private TeamMemberByTeamIdPageQueryExe teamMemberByTeamIdPageQueryExe;


    @Override
    public ResultDTO<Long> organizationCreate(OrganizationCreateDTO dto) {
        Long id = organizationCreateCmdHandler.handle(OrganizationCreateDTO2OrganizationCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> organizationModify(OrganizationModifyDTO dto) {
        organizationModifyCmdHandler.handle(OrganizationModifyDTO2OrganizationModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> organizationRemove(OrganizationRemoveDTO dto) {
        organizationRemoveCmdHandler.handle(OrganizationRemoveDTO2OrganizationRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> organizationManagerUnbind(OrganizationManagerUnbindDTO dto) {
        organizationManagerUnbindCmdHandler.handle(OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> organizationManagerBind(OrganizationManagerBindDTO dto) {
        organizationManagerBindCmdHandler.handle(OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Long> teamCreate(TeamCreateDTO dto) {
        Long id = teamCreateCmdHandler.handle(TeamCreateDTO2TeamCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> teamModify(TeamModifyDTO dto) {
        teamModifyCmdHandler.handle(TeamModifyDTO2TeamModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> teamRemove(TeamRemoveDTO dto) {
        teamRemoveCmdHandler.handle(TeamRemoveDTO2TeamRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> teamManagerBind(TeamManagerBindDTO dto) {
        teamManagerBindCmdHandler.handle(TeamManagerBindDTO2TeamManagerBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> teamManagerUnbind(TeamManagerUnBindDTO dto) {
        teamManagerUnBindCmdHandler.handle(TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Long> teamMemberAdd(TeamMemberAddDTO dto) {
        Long id = teamMemberAddCmdHandler.handle(TeamMemberAddDTO2TeamMemberAddCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> teamMemberRemove(TeamMemberRemoveDTO dto) {
        teamMemberRemoveCmdHandler.handle(TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> teamMemberRoleBind(TeamMemberRoleBindDTO dto) {
        teamMemberRoleBindCmdHandler.handle(TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> teamManagerRoleUnbind(TeamMemberRoleUnBindDTO dto) {
        teamMemberRoleUnBindCmdHandler.handle(TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<OrganizationDTO> organizationQuery(OrganizationQuery query) {
        return organizationQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<OrganizationDTO>> organizationPageQuery(OrganizationPageQuery pageQuery) {
        return organizationPageQueryExe.execute(pageQuery);
    }

    @Override
    public ResultDTO<TeamDTO> teamQuery(TeamQuery query) {
        return teamQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<TeamDTO>> teamPageQuery(TeamPageQuery pageQuery) {
        return teamPageQueryExe.execute(pageQuery);
    }

    @Override
    public PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery) {
        return teamMemberByTeamIdPageQueryExe.execute(pageQuery);
    }
}