package com.wakedt.visual.organization.client;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
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
import com.wakedt.visual.organization.app.OrganizationApplication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 组织域-RPC能力接口实现
 */
@Service
public class OrganizationRpcServiceImpl implements OrganizationRpcService {

    @Resource
    private OrganizationApplication application;

    @Override
    public ResultDTO<Long> organizationCreate(OrganizationCreateDTO dto) {
        return application.organizationCreate(dto);
    }

    @Override
    public ResultDTO<Boolean> organizationModify(OrganizationModifyDTO dto) {
        return application.organizationModify(dto);
    }

    @Override
    public ResultDTO<Boolean> organizationRemove(OrganizationRemoveDTO dto) {
        return application.organizationRemove(dto);
    }

    @Override
    public ResultDTO<Boolean> organizationManagerUnbind(OrganizationManagerUnbindDTO dto) {
        return application.organizationManagerUnbind(dto);
    }

    @Override
    public ResultDTO<Boolean> organizationManagerBind(OrganizationManagerBindDTO dto) {
        return application.organizationManagerBind(dto);
    }

    @Override
    public ResultDTO<Long> teamCreate(TeamCreateDTO dto) {
        return application.teamCreate(dto);
    }

    @Override
    public ResultDTO<Boolean> teamModify(TeamModifyDTO dto) {
        return application.teamModify(dto);
    }

    @Override
    public ResultDTO<Boolean> teamRemove(TeamRemoveDTO dto) {
        return application.teamRemove(dto);
    }

    @Override
    public ResultDTO<Boolean> teamManagerBind(TeamManagerBindDTO dto) {
        return application.teamManagerBind(dto);
    }

    @Override
    public ResultDTO<Boolean> teamManagerUnbind(TeamManagerUnBindDTO dto) {
        return application.teamManagerUnbind(dto);
    }

    @Override
    public ResultDTO<Long> teamMemberAdd(TeamMemberAddDTO dto) {
        return application.teamMemberAdd(dto);
    }

    @Override
    public ResultDTO<Boolean> teamMemberRemove(TeamMemberRemoveDTO dto) {
        return application.teamMemberRemove(dto);
    }

    @Override
    public ResultDTO<Boolean> teamMemberRoleBind(TeamMemberRoleBindDTO dto) {
        return application.teamMemberRoleBind(dto);
    }

    @Override
    public ResultDTO<Boolean> teamManagerRoleUnbind(TeamMemberRoleUnBindDTO dto) {
        return application.teamManagerRoleUnbind(dto);
    }

    @Override
    public ResultDTO<OrganizationDTO> organizationQuery(OrganizationQuery query) {
        return application.organizationQuery(query);
    }

    @Override
    public PageResultDTO<List<OrganizationDTO>> organizationPageQuery(OrganizationPageQuery pageQuery) {
        return application.organizationPageQuery(pageQuery);
    }

    @Override
    public ResultDTO<TeamDTO> teamQuery(TeamQuery query) {
        return application.teamQuery(query);
    }

    @Override
    public PageResultDTO<List<TeamDTO>> teamPageQuery(TeamPageQuery pageQuery) {
        return application.teamPageQuery(pageQuery);
    }

    @Override
    public PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery) {
        return application.teamMemberByTeamIdPageQuery(pageQuery);
    }
}