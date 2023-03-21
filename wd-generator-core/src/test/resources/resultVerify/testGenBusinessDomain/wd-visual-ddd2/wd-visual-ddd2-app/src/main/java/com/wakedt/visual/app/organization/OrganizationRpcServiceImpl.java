
package com.wakedt.visual.app.organization;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.organization.OrganizationRpcService;
import com.wakedt.visual.client.organization.query.OrganizationQuery;
import com.wakedt.visual.client.organization.query.OrganizationPageQuery;
import com.wakedt.visual.client.organization.query.OrganizationInfoByAccountIdQuery;
import com.wakedt.visual.client.organization.query.TeamQuery;
import com.wakedt.visual.client.organization.query.TeamPageQuery;
import com.wakedt.visual.client.organization.query.TeamInfoByAccountIdQuery;
import com.wakedt.visual.client.organization.query.TeamMemberByTeamIdPageQuery;
import com.wakedt.visual.client.organization.query.OrganizationCreateDTO;
import com.wakedt.visual.client.organization.query.OrganizationModifyDTO;
import com.wakedt.visual.client.organization.query.OrganizationRemoveDTO;
import com.wakedt.visual.client.organization.query.OrganizationManagerBindDTO;
import com.wakedt.visual.client.organization.query.OrganizationManagerUnbindDTO;
import com.wakedt.visual.client.organization.query.TeamCreateDTO;
import com.wakedt.visual.client.organization.query.TeamModifyDTO;
import com.wakedt.visual.client.organization.query.TeamRemoveDTO;
import com.wakedt.visual.client.organization.query.TeamManagerBindDTO;
import com.wakedt.visual.client.organization.query.TeamManagerUnBindDTO;
import com.wakedt.visual.client.organization.query.TeamMemberAddDTO;
import com.wakedt.visual.client.organization.query.TeamMemberRemoveDTO;
import com.wakedt.visual.client.organization.query.TeamMemberRoleBindDTO;
import com.wakedt.visual.client.organization.query.TeamMemberRoleUnBindDTO;
import com.wakedt.visual.client.organization.dto.OrganizationDTO;
import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.client.organization.dto.TeamMemberDTO;
import com.wakedt.visual.app.organization.view.OrganizationQueryExe;
import com.wakedt.visual.app.organization.view.OrganizationPageQueryExe;
import com.wakedt.visual.app.organization.view.OrganizationInfoByAccountIdQueryExe;
import com.wakedt.visual.app.organization.view.TeamQueryExe;
import com.wakedt.visual.app.organization.view.TeamPageQueryExe;
import com.wakedt.visual.app.organization.view.TeamInfoByAccountIdQueryExe;
import com.wakedt.visual.app.organization.view.TeamMemberByTeamIdPageQueryExe;
import com.wakedt.visual.app.organization.assembler.OrganizationCreateDTO2OrganizationCreateCmdConvert;
import com.wakedt.visual.app.organization.assembler.OrganizationModifyDTO2OrganizationModifyCmdConvert;
import com.wakedt.visual.app.organization.assembler.OrganizationRemoveDTO2OrganizationRemoveCmdConvert;
import com.wakedt.visual.app.organization.assembler.OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert;
import com.wakedt.visual.app.organization.assembler.OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert;
import com.wakedt.visual.app.organization.assembler.TeamCreateDTO2TeamCreateCmdConvert;
import com.wakedt.visual.app.organization.assembler.TeamModifyDTO2TeamModifyCmdConvert;
import com.wakedt.visual.app.organization.assembler.TeamRemoveDTO2TeamRemoveCmdConvert;
import com.wakedt.visual.app.organization.assembler.TeamManagerBindDTO2TeamManagerBindCmdConvert;
import com.wakedt.visual.app.organization.assembler.TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert;
import com.wakedt.visual.app.organization.assembler.TeamMemberAddDTO2TeamMemberAddCmdConvert;
import com.wakedt.visual.app.organization.assembler.TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert;
import com.wakedt.visual.app.organization.assembler.TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert;
import com.wakedt.visual.app.organization.assembler.TeamMemberRoleUnBindDTO2TeamMemberRoleUnBindCmdConvert;
import com.wakedt.visual.domain.organization.organization.create.OrganizationCreateCmdHandler;
import com.wakedt.visual.domain.organization.organization.modify.OrganizationModifyCmdHandler;
import com.wakedt.visual.domain.organization.organization.remove.OrganizationRemoveCmdHandler;
import com.wakedt.visual.domain.organization.organization.managerbind.OrganizationManagerBindCmdHandler;
import com.wakedt.visual.domain.organization.organization.managerunbind.OrganizationManagerUnbindCmdHandler;
import com.wakedt.visual.domain.organization.team.create.TeamCreateCmdHandler;
import com.wakedt.visual.domain.organization.team.modify.TeamModifyCmdHandler;
import com.wakedt.visual.domain.organization.team.remove.TeamRemoveCmdHandler;
import com.wakedt.visual.domain.organization.team.managerbind.TeamManagerBindCmdHandler;
import com.wakedt.visual.domain.organization.team.managerunbind.TeamManagerUnBindCmdHandler;
import com.wakedt.visual.domain.organization.teammember.memberadd.TeamMemberAddCmdHandler;
import com.wakedt.visual.domain.organization.teammember.memberremove.TeamMemberRemoveCmdHandler;
import com.wakedt.visual.domain.organization.teammember.memberrolebind.TeamMemberRoleBindCmdHandler;
import com.wakedt.visual.domain.organization.teammember.managerroleunbind.TeamMemberRoleUnBindCmdHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 组织结构管理的领域-RPC能力接口实现
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
    private OrganizationManagerBindCmdHandler organizationManagerBindCmdHandler;
    @Resource
    private OrganizationManagerUnbindCmdHandler organizationManagerUnbindCmdHandler;
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
    private OrganizationInfoByAccountIdQueryExe organizationInfoByAccountIdQueryExe;
    @Resource
    private TeamQueryExe teamQueryExe;
    @Resource
    private TeamPageQueryExe teamPageQueryExe;
    @Resource
    private TeamInfoByAccountIdQueryExe teamInfoByAccountIdQueryExe;
    @Resource
    private TeamMemberByTeamIdPageQueryExe teamMemberByTeamIdPageQueryExe;


    @Override
    public ResultDTO<Long> create(OrganizationCreateDTO dto) {
        Long id = organizationCreateCmdHandler.handle(OrganizationCreateDTO2OrganizationCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> modify(OrganizationModifyDTO dto) {
        organizationModifyCmdHandler.handle(OrganizationModifyDTO2OrganizationModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> remove(OrganizationRemoveDTO dto) {
        organizationRemoveCmdHandler.handle(OrganizationRemoveDTO2OrganizationRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> managerBind(OrganizationManagerBindDTO dto) {
        organizationManagerBindCmdHandler.handle(OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> managerUnBind(OrganizationManagerUnbindDTO dto) {
        organizationManagerUnbindCmdHandler.handle(OrganizationManagerUnbindDTO2OrganizationManagerUnbindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Long> create(TeamCreateDTO dto) {
        Long id = teamCreateCmdHandler.handle(TeamCreateDTO2TeamCreateCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(id);
    }

    @Override
    public ResultDTO<Boolean> modify(TeamModifyDTO dto) {
        teamModifyCmdHandler.handle(TeamModifyDTO2TeamModifyCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> remove(TeamRemoveDTO dto) {
        teamRemoveCmdHandler.handle(TeamRemoveDTO2TeamRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> managerBind(TeamManagerBindDTO dto) {
        teamManagerBindCmdHandler.handle(TeamManagerBindDTO2TeamManagerBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> managerUnBind(TeamManagerUnBindDTO dto) {
        teamManagerUnBindCmdHandler.handle(TeamManagerUnBindDTO2TeamManagerUnBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> memberAdd(TeamMemberAddDTO dto) {
        teamMemberAddCmdHandler.handle(TeamMemberAddDTO2TeamMemberAddCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> memberRemove(TeamMemberRemoveDTO dto) {
        teamMemberRemoveCmdHandler.handle(TeamMemberRemoveDTO2TeamMemberRemoveCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> memberRoleBind(TeamMemberRoleBindDTO dto) {
        teamMemberRoleBindCmdHandler.handle(TeamMemberRoleBindDTO2TeamMemberRoleBindCmdConvert.INSTANCE.dto2Do(dto));
        return ResultDTO.success(Boolean.TRUE);
    }

    @Override
    public ResultDTO<Boolean> managerRoleUnbind(TeamMemberRoleUnBindDTO dto) {
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
    public ResultDTO<OrganizationDTO> organizationInfoByAccountIdQuery(OrganizationInfoByAccountIdQuery query) {
        return organizationInfoByAccountIdQueryExe.execute(query);
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
    public ResultDTO<TeamDTO> teamInfoByAccountIdQuery(TeamInfoByAccountIdQuery query) {
        return teamInfoByAccountIdQueryExe.execute(query);
    }

    @Override
    public PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery) {
        return teamMemberByTeamIdPageQueryExe.execute(pageQuery);
    }
}