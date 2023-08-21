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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 组织域-RPC能力接口
 */
public interface OrganizationRpcService {

    /** 新增组织 */
    ResultDTO<Long> organizationCreate(OrganizationCreateDTO dto);

    /** 编辑组织 */
    ResultDTO<Boolean> organizationModify(OrganizationModifyDTO dto);

    /** 删除组织 */
    ResultDTO<Boolean> organizationRemove(OrganizationRemoveDTO dto);

    /** 解绑组织管理员 */
    ResultDTO<Boolean> organizationManagerUnbind(OrganizationManagerUnbindDTO dto);

    /** 绑定组织管理员 */
    ResultDTO<Boolean> organizationManagerBind(OrganizationManagerBindDTO dto);

    /** 新增团队 */
    ResultDTO<Long> teamCreate(TeamCreateDTO dto);

    /** 编辑团队 */
    ResultDTO<Boolean> teamModify(TeamModifyDTO dto);

    /** 删除团队 */
    ResultDTO<Boolean> teamRemove(TeamRemoveDTO dto);

    /** 绑定团队管理员 */
    ResultDTO<Boolean> teamManagerBind(TeamManagerBindDTO dto);

    /** 解绑团队管理员 */
    ResultDTO<Boolean> teamManagerUnbind(TeamManagerUnBindDTO dto);

    /** 添加团队成员 */
    ResultDTO<Long> teamMemberAdd(TeamMemberAddDTO dto);

    /** 删除团队成员 */
    ResultDTO<Boolean> teamMemberRemove(TeamMemberRemoveDTO dto);

    /** 绑定团队成员职位 */
    ResultDTO<Boolean> teamMemberRoleBind(TeamMemberRoleBindDTO dto);

    /** 解绑团队成员职位 */
    ResultDTO<Boolean> teamManagerRoleUnbind(TeamMemberRoleUnBindDTO dto);

    /** 查询组织详情 */
    ResultDTO<OrganizationDTO> organizationQuery(OrganizationQuery query);

    /** 分页查询组织 */
    PageResultDTO<List<OrganizationDTO>> organizationPageQuery(OrganizationPageQuery pageQuery);

    /** 查询团队详情 */
    ResultDTO<TeamDTO> teamQuery(TeamQuery query);

    /** 分页查询团队 */
    PageResultDTO<List<TeamDTO>> teamPageQuery(TeamPageQuery pageQuery);

    /** 分页查询团队成员 */
    PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery);

}