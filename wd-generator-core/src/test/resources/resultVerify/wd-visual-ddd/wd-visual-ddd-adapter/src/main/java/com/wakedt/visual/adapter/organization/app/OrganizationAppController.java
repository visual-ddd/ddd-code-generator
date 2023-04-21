
package com.wakedt.visual.adapter.organization.app;

import java.util.*;
import java.math.*;
import javax.annotation.Resource;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import com.wakedt.visual.client.organization.OrganizationRpcService;
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

/**
 * 组织域-C端
 */
@RestController
@RequestMapping("/app/organization")
@Api(value = "/app/organization", tags = "组织域-C端")
public class OrganizationAppController {

    @Resource
    private OrganizationRpcService organizationRpcService;

    @ApiOperation("新增组织")
    @PostMapping("/organization-create")
    public ResultDTO<Long> organizationCreate(@RequestBody @Valid OrganizationCreateDTO dto) {
        return organizationRpcService.organizationCreate(dto);
    }

    @ApiOperation("编辑组织")
    @PostMapping("/organization-modify")
    public ResultDTO<Boolean> organizationModify(@RequestBody @Valid OrganizationModifyDTO dto) {
        return organizationRpcService.organizationModify(dto);
    }

    @ApiOperation("删除组织")
    @PostMapping("/organization-remove")
    public ResultDTO<Boolean> organizationRemove(@RequestBody @Valid OrganizationRemoveDTO dto) {
        return organizationRpcService.organizationRemove(dto);
    }

    @ApiOperation("解绑组织管理员")
    @PostMapping("/organization-manager-unbind")
    public ResultDTO<Boolean> organizationManagerUnbind(@RequestBody @Valid OrganizationManagerUnbindDTO dto) {
        return organizationRpcService.organizationManagerUnbind(dto);
    }

    @ApiOperation("绑定组织管理员")
    @PostMapping("/organization-manager-bind")
    public ResultDTO<Boolean> organizationManagerBind(@RequestBody @Valid OrganizationManagerBindDTO dto) {
        return organizationRpcService.organizationManagerBind(dto);
    }

    @ApiOperation("新增团队")
    @PostMapping("/team-create")
    public ResultDTO<Long> teamCreate(@RequestBody @Valid TeamCreateDTO dto) {
        return organizationRpcService.teamCreate(dto);
    }

    @ApiOperation("编辑团队")
    @PostMapping("/team-modify")
    public ResultDTO<Boolean> teamModify(@RequestBody @Valid TeamModifyDTO dto) {
        return organizationRpcService.teamModify(dto);
    }

    @ApiOperation("删除团队")
    @PostMapping("/team-remove")
    public ResultDTO<Boolean> teamRemove(@RequestBody @Valid TeamRemoveDTO dto) {
        return organizationRpcService.teamRemove(dto);
    }

    @ApiOperation("绑定团队管理员")
    @PostMapping("/team-manager-bind")
    public ResultDTO<Boolean> teamManagerBind(@RequestBody @Valid TeamManagerBindDTO dto) {
        return organizationRpcService.teamManagerBind(dto);
    }

    @ApiOperation("解绑团队管理员")
    @PostMapping("/team-manager-unbind")
    public ResultDTO<Boolean> teamManagerUnbind(@RequestBody @Valid TeamManagerUnBindDTO dto) {
        return organizationRpcService.teamManagerUnbind(dto);
    }

    @ApiOperation("添加团队成员")
    @PostMapping("/team-member-add")
    public ResultDTO<Long> teamMemberAdd(@RequestBody @Valid TeamMemberAddDTO dto) {
        return organizationRpcService.teamMemberAdd(dto);
    }

    @ApiOperation("删除团队成员")
    @PostMapping("/team-member-remove")
    public ResultDTO<Boolean> teamMemberRemove(@RequestBody @Valid TeamMemberRemoveDTO dto) {
        return organizationRpcService.teamMemberRemove(dto);
    }

    @ApiOperation("绑定团队成员职位")
    @PostMapping("/team-member-role-bind")
    public ResultDTO<Boolean> teamMemberRoleBind(@RequestBody @Valid TeamMemberRoleBindDTO dto) {
        return organizationRpcService.teamMemberRoleBind(dto);
    }

    @ApiOperation("解绑团队成员职位")
    @PostMapping("/team-manager-role-unbind")
    public ResultDTO<Boolean> teamManagerRoleUnbind(@RequestBody @Valid TeamMemberRoleUnBindDTO dto) {
        return organizationRpcService.teamManagerRoleUnbind(dto);
    }

    @ApiOperation("组织详情查询对象")
    @GetMapping("/organization-query")
    public ResultDTO<OrganizationDTO> organizationQuery(OrganizationQuery query) {
        return organizationRpcService.organizationQuery(query);
    }

    @ApiOperation("组织分页查询对象")
    @GetMapping("/organization-page-query")
    public PageResultDTO<List<OrganizationDTO>> organizationPageQuery(OrganizationPageQuery pageQuery) {
        return organizationRpcService.organizationPageQuery(pageQuery);
    }

    @ApiOperation("团队详情查询对象")
    @GetMapping("/team-query")
    public ResultDTO<TeamDTO> teamQuery(TeamQuery query) {
        return organizationRpcService.teamQuery(query);
    }

    @ApiOperation("团队分页查询对象")
    @GetMapping("/team-page-query")
    public PageResultDTO<List<TeamDTO>> teamPageQuery(TeamPageQuery pageQuery) {
        return organizationRpcService.teamPageQuery(pageQuery);
    }

    @ApiOperation("查询团队下的成员信息")
    @GetMapping("/team-member-by-team-id-page-query")
    public PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery) {
        return organizationRpcService.teamMemberByTeamIdPageQuery(pageQuery);
    }
}