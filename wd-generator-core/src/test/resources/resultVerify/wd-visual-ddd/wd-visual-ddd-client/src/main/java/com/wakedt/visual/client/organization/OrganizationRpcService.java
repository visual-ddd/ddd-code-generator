package com.wakedt.visual.client.organization;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.organization.query.OrganizationQuery;
import com.wakedt.visual.client.organization.query.OrganizationPageQuery;
import com.wakedt.visual.client.organization.query.TeamQuery;
import com.wakedt.visual.client.organization.query.TeamPageQuery;
import com.wakedt.visual.client.organization.query.TeamMemberByTeamIdPageQuery;
import com.wakedt.visual.client.organization.query.OrganizationCreateDTO;
import com.wakedt.visual.client.organization.query.OrganizationModifyDTO;
import com.wakedt.visual.client.organization.query.OrganizationRemoveDTO;
import com.wakedt.visual.client.organization.query.OrganizationManagerUnbindDTO;
import com.wakedt.visual.client.organization.query.OrganizationManagerBindDTO;
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
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 组织域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
public interface OrganizationRpcService {

    /**
     * 新增组织
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Long> organizationCreate(OrganizationCreateDTO dto);

    /**
     * 编辑组织
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> organizationModify(OrganizationModifyDTO dto);

    /**
     * 删除组织
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> organizationRemove(OrganizationRemoveDTO dto);

    /**
     * 解绑组织管理员
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> organizationManagerUnbind(OrganizationManagerUnbindDTO dto);

    /**
     * 绑定组织管理员
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> organizationManagerBind(OrganizationManagerBindDTO dto);

    /**
     * 新增团队
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Long> teamCreate(TeamCreateDTO dto);

    /**
     * 编辑团队
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> teamModify(TeamModifyDTO dto);

    /**
     * 删除团队
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> teamRemove(TeamRemoveDTO dto);

    /**
     * 绑定团队管理员
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> teamManagerBind(TeamManagerBindDTO dto);

    /**
     * 解绑团队管理员
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> teamManagerUnbind(TeamManagerUnBindDTO dto);

    /**
     * 添加团队成员
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Long> teamMemberAdd(TeamMemberAddDTO dto);

    /**
     * 删除团队成员
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> teamMemberRemove(TeamMemberRemoveDTO dto);

    /**
     * 绑定团队成员职位
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> teamMemberRoleBind(TeamMemberRoleBindDTO dto);

    /**
     * 解绑团队成员职位
     *
     * @param dto 请求体
     * @return 执行结果
     */
    ResultDTO<Boolean> teamManagerRoleUnbind(TeamMemberRoleUnBindDTO dto);

    /**
     * 查询组织详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ResultDTO<OrganizationDTO> organizationQuery(OrganizationQuery query);

    /**
     * 分页查询组织
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果
     */
    PageResultDTO<List<OrganizationDTO>> organizationPageQuery(OrganizationPageQuery pageQuery);

    /**
     * 查询团队详情
     *
     * @param query 查询参数
     * @return 查询结果
     */
    ResultDTO<TeamDTO> teamQuery(TeamQuery query);

    /**
     * 分页查询团队
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果
     */
    PageResultDTO<List<TeamDTO>> teamPageQuery(TeamPageQuery pageQuery);

    /**
     * 分页查询团队成员
     *
     * @param pageQuery 分页查询参数
     * @return 查询结果
     */
    PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery);

}