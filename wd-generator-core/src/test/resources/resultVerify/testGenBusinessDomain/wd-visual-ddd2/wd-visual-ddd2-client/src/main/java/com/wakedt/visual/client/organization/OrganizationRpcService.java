
package com.wakedt.visual.client.organization;
import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
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
import java.util.List;

/**
 * 组织结构管理的领域-RPC能力接口
 */
public interface OrganizationRpcService {

    /** 新增组织 */
    ResultDTO<Long> create(OrganizationCreateDTO dto);

    /** 编辑组织 */
    ResultDTO<Boolean> modify(OrganizationModifyDTO dto);

    /** 删除组织 */
    ResultDTO<Boolean> remove(OrganizationRemoveDTO dto);

    /** 绑定组织管理员 */
    ResultDTO<Boolean> managerBind(OrganizationManagerBindDTO dto);

    /** 解绑组织管理员 */
    ResultDTO<Boolean> managerUnBind(OrganizationManagerUnbindDTO dto);

    /** 新增团队 */
    ResultDTO<Long> create(TeamCreateDTO dto);

    /** 编辑团队 */
    ResultDTO<Boolean> modify(TeamModifyDTO dto);

    /** 删除团队 */
    ResultDTO<Boolean> remove(TeamRemoveDTO dto);

    /** 绑定团队管理员 */
    ResultDTO<Boolean> managerBind(TeamManagerBindDTO dto);

    /** 解绑团队管理员 */
    ResultDTO<Boolean> managerUnBind(TeamManagerUnBindDTO dto);

    /** 添加团队成员 */
    ResultDTO<Boolean> memberAdd(TeamMemberAddDTO dto);

    /** 删除团队成员 */
    ResultDTO<Boolean> memberRemove(TeamMemberRemoveDTO dto);

    /** 绑定团队成员职位 */
    ResultDTO<Boolean> memberRoleBind(TeamMemberRoleBindDTO dto);

    /** 解绑团队成员职位 */
    ResultDTO<Boolean> managerRoleUnbind(TeamMemberRoleUnBindDTO dto);

    /** 查询组织详情 */
    ResultDTO<OrganizationDTO> organizationQuery(OrganizationQuery query);

    /** 分页查询组织 */
    PageResultDTO<List<OrganizationDTO>> organizationPageQuery(OrganizationPageQuery pageQuery);

    /** 根据用户查询关联的组织信息列表 */
    ResultDTO<OrganizationDTO> organizationInfoByAccountIdQuery(OrganizationInfoByAccountIdQuery query);

    /** 查询团队详情 */
    ResultDTO<TeamDTO> teamQuery(TeamQuery query);

    /** 分页查询团队 */
    PageResultDTO<List<TeamDTO>> teamPageQuery(TeamPageQuery pageQuery);

    /** 根据账号查询所属团队信息列表 */
    ResultDTO<TeamDTO> teamInfoByAccountIdQuery(TeamInfoByAccountIdQuery query);

    /** 分页查询团队成员 */
    PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery);

}