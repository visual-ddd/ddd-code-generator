package com.wakedt.visual.client.organization;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.client.organization.dto.OrganizationDTO;
import com.wakedt.visual.client.organization.dto.TeamDTO;
import com.wakedt.visual.client.organization.dto.TeamMemberDTO;
import com.wakedt.visual.client.organization.query.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

/**
 * 组织域-RPC能力接口
 *
 * @author shimmer
 * @since 1.0
 */
@FeignClient(name = "wd-visual-ddd", path = "/wd-visual-ddd/rpc/organization")
@Api(tags = "[RPC] 组织域")
public interface OrganizationRpcService {

    @ApiOperation("新增组织")
    @PostMapping("/organization-create")
    ResultDTO<Long> organizationCreate(@RequestBody @Valid OrganizationCreateDTO dto);

    @ApiOperation("编辑组织")
    @PostMapping("/organization-modify")
    ResultDTO<Boolean> organizationModify(@RequestBody @Valid OrganizationModifyDTO dto);

    @ApiOperation("删除组织")
    @PostMapping("/organization-remove")
    ResultDTO<Boolean> organizationRemove(@RequestBody @Valid OrganizationRemoveDTO dto);

    @ApiOperation("解绑组织管理员")
    @PostMapping("/organization-manager-unbind")
    ResultDTO<Boolean> organizationManagerUnbind(@RequestBody @Valid OrganizationManagerUnbindDTO dto);

    @ApiOperation("绑定组织管理员")
    @PostMapping("/organization-manager-bind")
    ResultDTO<Boolean> organizationManagerBind(@RequestBody @Valid OrganizationManagerBindDTO dto);

    @ApiOperation("新增团队")
    @PostMapping("/team-create")
    ResultDTO<Long> teamCreate(@RequestBody @Valid TeamCreateDTO dto);

    @ApiOperation("编辑团队")
    @PostMapping("/team-modify")
    ResultDTO<Boolean> teamModify(@RequestBody @Valid TeamModifyDTO dto);

    @ApiOperation("删除团队")
    @PostMapping("/team-remove")
    ResultDTO<Boolean> teamRemove(@RequestBody @Valid TeamRemoveDTO dto);

    @ApiOperation("绑定团队管理员")
    @PostMapping("/team-manager-bind")
    ResultDTO<Boolean> teamManagerBind(@RequestBody @Valid TeamManagerBindDTO dto);

    @ApiOperation("解绑团队管理员")
    @PostMapping("/team-manager-unbind")
    ResultDTO<Boolean> teamManagerUnbind(@RequestBody @Valid TeamManagerUnBindDTO dto);

    @ApiOperation("添加团队成员")
    @PostMapping("/team-member-add")
    ResultDTO<Long> teamMemberAdd(@RequestBody @Valid TeamMemberAddDTO dto);

    @ApiOperation("删除团队成员")
    @PostMapping("/team-member-remove")
    ResultDTO<Boolean> teamMemberRemove(@RequestBody @Valid TeamMemberRemoveDTO dto);

    @ApiOperation("绑定团队成员职位")
    @PostMapping("/team-member-role-bind")
    ResultDTO<Boolean> teamMemberRoleBind(@RequestBody @Valid TeamMemberRoleBindDTO dto);

    @ApiOperation("解绑团队成员职位")
    @PostMapping("/team-manager-role-unbind")
    ResultDTO<Boolean> teamManagerRoleUnbind(@RequestBody @Valid TeamMemberRoleUnBindDTO dto);

    @ApiOperation("组织详情查询对象")
    @PostMapping("/organization-query")
    ResultDTO<OrganizationDTO> organizationQuery(@RequestBody @Valid OrganizationQuery query);

    @ApiOperation("组织分页查询对象")
    @PostMapping("/organization-page-query")
    PageResultDTO<List<OrganizationDTO>> organizationPageQuery(@RequestBody @Valid OrganizationPageQuery pageQuery);

    @ApiOperation("团队详情查询对象")
    @PostMapping("/team-query")
    ResultDTO<TeamDTO> teamQuery(@RequestBody @Valid TeamQuery query);

    @ApiOperation("团队分页查询对象")
    @PostMapping("/team-page-query")
    PageResultDTO<List<TeamDTO>> teamPageQuery(@RequestBody @Valid TeamPageQuery pageQuery);

    @ApiOperation("查询团队下的成员信息")
    @PostMapping("/team-member-by-team-id-page-query")
    PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(@RequestBody @Valid TeamMemberByTeamIdPageQuery pageQuery);

}