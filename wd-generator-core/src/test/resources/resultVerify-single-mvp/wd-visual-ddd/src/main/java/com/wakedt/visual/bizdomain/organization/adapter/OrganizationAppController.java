package com.wakedt.visual.bizdomain.organization.adapter;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.annotation.Resource;

import com.wakedata.common.core.dto.PageResultDTO;
import com.wakedata.common.core.dto.ResultDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import com.wakedt.visual.bizdomain.organization.app.OrganizationApplication;
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

/**
 * [APP] 组织域
 *
 * @author visual-ddd
 * @since 1.0
 */
@RestController
@RequestMapping("/app/organization")
@Api(value = "/app/organization", tags = "[APP] 组织域")
public class OrganizationAppController {

    @Resource
    private OrganizationApplication organizationApplication;

    @ApiOperation("新增组织")
    @PostMapping("/organization-create")
    public ResultDTO<Long> organizationCreate(@RequestBody @Valid OrganizationCreateDTO dto) {
        return organizationApplication.organizationCreate(dto);
    }

    @ApiOperation("编辑组织")
    @PostMapping("/organization-modify")
    public ResultDTO<Boolean> organizationModify(@RequestBody @Valid OrganizationModifyDTO dto) {
        return organizationApplication.organizationModify(dto);
    }

    @ApiOperation("删除组织")
    @PostMapping("/organization-remove")
    public ResultDTO<Boolean> organizationRemove(@RequestBody @Valid OrganizationRemoveDTO dto) {
        return organizationApplication.organizationRemove(dto);
    }

    @ApiOperation("解绑组织管理员")
    @PostMapping("/organization-manager-unbind")
    public ResultDTO<Boolean> organizationManagerUnbind(@RequestBody @Valid OrganizationManagerUnbindDTO dto) {
        return organizationApplication.organizationManagerUnbind(dto);
    }

    @ApiOperation("绑定组织管理员")
    @PostMapping("/organization-manager-bind")
    public ResultDTO<Boolean> organizationManagerBind(@RequestBody @Valid OrganizationManagerBindDTO dto) {
        return organizationApplication.organizationManagerBind(dto);
    }

    @ApiOperation("新增团队")
    @PostMapping("/team-create")
    public ResultDTO<Long> teamCreate(@RequestBody @Valid TeamCreateDTO dto) {
        return organizationApplication.teamCreate(dto);
    }

    @ApiOperation("编辑团队")
    @PostMapping("/team-modify")
    public ResultDTO<Boolean> teamModify(@RequestBody @Valid TeamModifyDTO dto) {
        return organizationApplication.teamModify(dto);
    }

    @ApiOperation("删除团队")
    @PostMapping("/team-remove")
    public ResultDTO<Boolean> teamRemove(@RequestBody @Valid TeamRemoveDTO dto) {
        return organizationApplication.teamRemove(dto);
    }

    @ApiOperation("绑定团队管理员")
    @PostMapping("/team-manager-bind")
    public ResultDTO<Boolean> teamManagerBind(@RequestBody @Valid TeamManagerBindDTO dto) {
        return organizationApplication.teamManagerBind(dto);
    }

    @ApiOperation("解绑团队管理员")
    @PostMapping("/team-manager-unbind")
    public ResultDTO<Boolean> teamManagerUnbind(@RequestBody @Valid TeamManagerUnBindDTO dto) {
        return organizationApplication.teamManagerUnbind(dto);
    }

    @ApiOperation("添加团队成员")
    @PostMapping("/team-member-add")
    public ResultDTO<Long> teamMemberAdd(@RequestBody @Valid TeamMemberAddDTO dto) {
        return organizationApplication.teamMemberAdd(dto);
    }

    @ApiOperation("删除团队成员")
    @PostMapping("/team-member-remove")
    public ResultDTO<Boolean> teamMemberRemove(@RequestBody @Valid TeamMemberRemoveDTO dto) {
        return organizationApplication.teamMemberRemove(dto);
    }

    @ApiOperation("绑定团队成员职位")
    @PostMapping("/team-member-role-bind")
    public ResultDTO<Boolean> teamMemberRoleBind(@RequestBody @Valid TeamMemberRoleBindDTO dto) {
        return organizationApplication.teamMemberRoleBind(dto);
    }

    @ApiOperation("解绑团队成员职位")
    @PostMapping("/team-manager-role-unbind")
    public ResultDTO<Boolean> teamManagerRoleUnbind(@RequestBody @Valid TeamMemberRoleUnBindDTO dto) {
        return organizationApplication.teamManagerRoleUnbind(dto);
    }

    @ApiOperation("组织详情查询对象")
    @PostMapping("/organization-query")
    public ResultDTO<OrganizationDTO> organizationQuery(@RequestBody @Valid OrganizationQuery query) {
        return organizationApplication.organizationQuery(query);
    }

    @ApiOperation("组织分页查询对象")
    @PostMapping("/organization-page-query")
    public PageResultDTO<List<OrganizationDTO>> organizationPageQuery(@RequestBody @Valid OrganizationPageQuery pageQuery) {
        return organizationApplication.organizationPageQuery(pageQuery);
    }

    @ApiOperation("团队详情查询对象")
    @PostMapping("/team-query")
    public ResultDTO<TeamDTO> teamQuery(@RequestBody @Valid TeamQuery query) {
        return organizationApplication.teamQuery(query);
    }

    @ApiOperation("团队分页查询对象")
    @PostMapping("/team-page-query")
    public PageResultDTO<List<TeamDTO>> teamPageQuery(@RequestBody @Valid TeamPageQuery pageQuery) {
        return organizationApplication.teamPageQuery(pageQuery);
    }

    @ApiOperation("查询团队下的成员信息")
    @PostMapping("/team-member-by-team-id-page-query")
    public PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(@RequestBody @Valid TeamMemberByTeamIdPageQuery pageQuery) {
        return organizationApplication.teamMemberByTeamIdPageQuery(pageQuery);
    }
}