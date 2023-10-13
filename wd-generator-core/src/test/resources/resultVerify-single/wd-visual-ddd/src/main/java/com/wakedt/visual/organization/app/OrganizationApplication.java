package com.wakedt.visual.organization.app;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.organization.client.OrganizationRpcService;
import com.wakedt.visual.organization.client.query.OrganizationQuery;
import com.wakedt.visual.organization.client.query.OrganizationPageQuery;
import com.wakedt.visual.organization.client.query.TeamQuery;
import com.wakedt.visual.organization.client.query.TeamPageQuery;
import com.wakedt.visual.organization.client.query.TeamMemberByTeamIdPageQuery;
import com.wakedt.visual.organization.client.query.OrganizationCreateDTO;
import com.wakedt.visual.organization.client.query.OrganizationModifyDTO;
import com.wakedt.visual.organization.client.query.OrganizationRemoveDTO;
import com.wakedt.visual.organization.client.query.OrganizationManagerUnbindDTO;
import com.wakedt.visual.organization.client.query.OrganizationManagerBindDTO;
import com.wakedt.visual.organization.client.query.TeamCreateDTO;
import com.wakedt.visual.organization.client.query.TeamModifyDTO;
import com.wakedt.visual.organization.client.query.TeamRemoveDTO;
import com.wakedt.visual.organization.client.query.TeamManagerBindDTO;
import com.wakedt.visual.organization.client.query.TeamManagerUnBindDTO;
import com.wakedt.visual.organization.client.query.TeamMemberAddDTO;
import com.wakedt.visual.organization.client.query.TeamMemberRemoveDTO;
import com.wakedt.visual.organization.client.query.TeamMemberRoleBindDTO;
import com.wakedt.visual.organization.client.query.TeamMemberRoleUnBindDTO;
import com.wakedt.visual.organization.client.dto.OrganizationDTO;
import com.wakedt.visual.organization.client.dto.TeamDTO;
import com.wakedt.visual.organization.client.dto.TeamMemberDTO;
import com.wakedt.visual.organization.app.view.OrganizationQueryExe;
import com.wakedt.visual.organization.app.view.OrganizationPageQueryExe;
import com.wakedt.visual.organization.app.view.TeamQueryExe;
import com.wakedt.visual.organization.app.view.TeamPageQueryExe;
import com.wakedt.visual.organization.app.view.TeamMemberByTeamIdPageQueryExe;
import com.wakedt.visual.organization.app.assembler.OrganizationCreateDTO2OrganizationCreateCmdConvert;
import com.wakedt.visual.organization.app.assembler.OrganizationModifyDTO2OrganizationModifyCmdConvert;
import com.wakedt.visual.organization.app.assembler.OrganizationRemoveDTO2OrganizationRemoveCmdConvert;
import com.wakedt.visual.organization.app.assembler.OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert;
import com.wakedt.visual.organization.app.assembler.OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert;
import com.wakedt.visual.organization.app.assembler.TeamCreateDTO2TeamCreateCmdConvert;
import com.wakedt.visual.organization.app.assembler.TeamModifyDTO2TeamModifyCmdConvert;
import com.wakedt.visual.organization.app.assembler.TeamRemoveDTO2TeamRemoveCmdConvert;
import com.wakedt.visual.organization.app.assembler.TeamManagerBindDTO2TeamManagerBindCmdConvert;
import com.wakedt.visual.organization.app.assembler.TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert;
import com.wakedt.visual.organization.app.assembler.TeamMemberAddDTO2TeamMemberAddCmdConvert;
import com.wakedt.visual.organization.app.assembler.TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert;
import com.wakedt.visual.organization.app.assembler.TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert;
import com.wakedt.visual.organization.app.assembler.TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert;
import com.wakedt.visual.organization.app.cmd.organizationcreate.OrganizationCreateCmdHandler;
import com.wakedt.visual.organization.app.cmd.organizationmodify.OrganizationModifyCmdHandler;
import com.wakedt.visual.organization.app.cmd.organizationremove.OrganizationRemoveCmdHandler;
import com.wakedt.visual.organization.app.cmd.organizationmanagerunbind.OrganizationManagerUnbindCmdHandler;
import com.wakedt.visual.organization.app.cmd.organizationmanagerbind.OrganizationManagerBindCmdHandler;
import com.wakedt.visual.organization.app.cmd.teamcreate.TeamCreateCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammodify.TeamModifyCmdHandler;
import com.wakedt.visual.organization.app.cmd.teamremove.TeamRemoveCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammanagerbind.TeamManagerBindCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammanagerunbind.TeamManagerUnBindCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammemberadd.TeamMemberAddCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammemberremove.TeamMemberRemoveCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammemberrolebind.TeamMemberRoleBindCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammanagerroleunbind.TeamMemberRoleUnBindCmdHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 组织域
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Service
public class OrganizationApplication {

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