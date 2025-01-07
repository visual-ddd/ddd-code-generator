package com.wakedt.visual.bizdomain.organization.app;

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
import com.wakedt.visual.bizdomain.organization.app.view.OrganizationQueryExe;
import com.wakedt.visual.bizdomain.organization.app.view.OrganizationPageQueryExe;
import com.wakedt.visual.bizdomain.organization.app.view.TeamQueryExe;
import com.wakedt.visual.bizdomain.organization.app.view.TeamPageQueryExe;
import com.wakedt.visual.bizdomain.organization.app.view.TeamMemberByTeamIdPageQueryExe;
import com.wakedt.visual.bizdomain.organization.app.assembler.OrganizationCreateDTO2OrganizationCreateCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.OrganizationModifyDTO2OrganizationModifyCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.OrganizationRemoveDTO2OrganizationRemoveCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamCreateDTO2TeamCreateCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamModifyDTO2TeamModifyCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamRemoveDTO2TeamRemoveCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamManagerBindDTO2TeamManagerBindCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamMemberAddDTO2TeamMemberAddCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.assembler.TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationcreate.OrganizationCreateCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationmodify.OrganizationModifyCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationremove.OrganizationRemoveCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationmanagerunbind.OrganizationManagerUnbindCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationmanagerbind.OrganizationManagerBindCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.teamcreate.TeamCreateCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammodify.TeamModifyCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.teamremove.TeamRemoveCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammanagerbind.TeamManagerBindCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammanagerunbind.TeamManagerUnBindCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammemberadd.TeamMemberAddCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammemberremove.TeamMemberRemoveCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammemberrolebind.TeamMemberRoleBindCmdHandler;
import com.wakedt.visual.bizdomain.organization.app.cmd.teammanagerroleunbind.TeamMemberRoleUnBindCmdHandler;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
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

    private OrganizationCreateCmdHandler organizationCreateCmdHandler;
    private OrganizationModifyCmdHandler organizationModifyCmdHandler;
    private OrganizationRemoveCmdHandler organizationRemoveCmdHandler;
    private OrganizationManagerUnbindCmdHandler organizationManagerUnbindCmdHandler;
    private OrganizationManagerBindCmdHandler organizationManagerBindCmdHandler;
    private TeamCreateCmdHandler teamCreateCmdHandler;
    private TeamModifyCmdHandler teamModifyCmdHandler;
    private TeamRemoveCmdHandler teamRemoveCmdHandler;
    private TeamManagerBindCmdHandler teamManagerBindCmdHandler;
    private TeamManagerUnBindCmdHandler teamManagerUnBindCmdHandler;
    private TeamMemberAddCmdHandler teamMemberAddCmdHandler;
    private TeamMemberRemoveCmdHandler teamMemberRemoveCmdHandler;
    private TeamMemberRoleBindCmdHandler teamMemberRoleBindCmdHandler;
    private TeamMemberRoleUnBindCmdHandler teamMemberRoleUnBindCmdHandler;
    private OrganizationQueryExe organizationQueryExe;
    private OrganizationPageQueryExe organizationPageQueryExe;
    private TeamQueryExe teamQueryExe;
    private TeamPageQueryExe teamPageQueryExe;
    private TeamMemberByTeamIdPageQueryExe teamMemberByTeamIdPageQueryExe;


    public ResultDTO<Long> organizationCreate(OrganizationCreateDTO dto) {
        Long id = organizationCreateCmdHandler.handle(OrganizationCreateDTO2OrganizationCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> organizationModify(OrganizationModifyDTO dto) {
        organizationModifyCmdHandler.handle(OrganizationModifyDTO2OrganizationModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> organizationRemove(OrganizationRemoveDTO dto) {
        organizationRemoveCmdHandler.handle(OrganizationRemoveDTO2OrganizationRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> organizationManagerUnbind(OrganizationManagerUnbindDTO dto) {
        organizationManagerUnbindCmdHandler.handle(OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> organizationManagerBind(OrganizationManagerBindDTO dto) {
        organizationManagerBindCmdHandler.handle(OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> teamCreate(TeamCreateDTO dto) {
        Long id = teamCreateCmdHandler.handle(TeamCreateDTO2TeamCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> teamModify(TeamModifyDTO dto) {
        teamModifyCmdHandler.handle(TeamModifyDTO2TeamModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamRemove(TeamRemoveDTO dto) {
        teamRemoveCmdHandler.handle(TeamRemoveDTO2TeamRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamManagerBind(TeamManagerBindDTO dto) {
        teamManagerBindCmdHandler.handle(TeamManagerBindDTO2TeamManagerBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamManagerUnbind(TeamManagerUnBindDTO dto) {
        teamManagerUnBindCmdHandler.handle(TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Long> teamMemberAdd(TeamMemberAddDTO dto) {
        Long id = teamMemberAddCmdHandler.handle(TeamMemberAddDTO2TeamMemberAddCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    public ResultDTO<Boolean> teamMemberRemove(TeamMemberRemoveDTO dto) {
        teamMemberRemoveCmdHandler.handle(TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamMemberRoleBind(TeamMemberRoleBindDTO dto) {
        teamMemberRoleBindCmdHandler.handle(TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<Boolean> teamManagerRoleUnbind(TeamMemberRoleUnBindDTO dto) {
        teamMemberRoleUnBindCmdHandler.handle(TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    public ResultDTO<OrganizationDTO> organizationQuery(OrganizationQuery query) {
        return organizationQueryExe.execute(query);
    }

    public PageResultDTO<List<OrganizationDTO>> organizationPageQuery(OrganizationPageQuery pageQuery) {
        return organizationPageQueryExe.execute(pageQuery);
    }

    public ResultDTO<TeamDTO> teamQuery(TeamQuery query) {
        return teamQueryExe.execute(query);
    }

    public PageResultDTO<List<TeamDTO>> teamPageQuery(TeamPageQuery pageQuery) {
        return teamPageQueryExe.execute(pageQuery);
    }

    public PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery) {
        return teamMemberByTeamIdPageQueryExe.execute(pageQuery);
    }
}