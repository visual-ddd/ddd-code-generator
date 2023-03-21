
package com.wakedt.visual.adapter.organization.app;

import java.util.List;
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

/**
 * 组织结构管理的领域-app-controller
 */
@RestController
@RequestMapping("/app/organization")
@Api(value = "/app/organization", tags = "C端-组织结构管理的领域")
public class OrganizationAppController {

    @Resource
    private OrganizationRpcService organizationRpcService;

    @ApiOperation("新增组织")
    @PostMapping("/create")
    public ResultDTO<Long> create(@RequestBody @Valid OrganizationCreateDTO dto) {
        return organizationRpcService.create(dto);
    }

    @ApiOperation("编辑组织")
    @PostMapping("/modify")
    public ResultDTO<Boolean> modify(@RequestBody @Valid OrganizationModifyDTO dto) {
        return organizationRpcService.modify(dto);
    }

    @ApiOperation("删除组织")
    @PostMapping("/remove")
    public ResultDTO<Boolean> remove(@RequestBody @Valid OrganizationRemoveDTO dto) {
        return organizationRpcService.remove(dto);
    }

    @ApiOperation("绑定组织管理员")
    @PostMapping("/manager-bind")
    public ResultDTO<Boolean> managerBind(@RequestBody @Valid OrganizationManagerBindDTO dto) {
        return organizationRpcService.managerBind(dto);
    }

    @ApiOperation("解绑组织管理员")
    @PostMapping("/manager-un-bind")
    public ResultDTO<Boolean> managerUnBind(@RequestBody @Valid OrganizationManagerUnbindDTO dto) {
        return organizationRpcService.managerUnBind(dto);
    }

    @ApiOperation("新增团队")
    @PostMapping("/create")
    public ResultDTO<Long> create(@RequestBody @Valid TeamCreateDTO dto) {
        return organizationRpcService.create(dto);
    }

    @ApiOperation("编辑团队")
    @PostMapping("/modify")
    public ResultDTO<Boolean> modify(@RequestBody @Valid TeamModifyDTO dto) {
        return organizationRpcService.modify(dto);
    }

    @ApiOperation("删除团队")
    @PostMapping("/remove")
    public ResultDTO<Boolean> remove(@RequestBody @Valid TeamRemoveDTO dto) {
        return organizationRpcService.remove(dto);
    }

    @ApiOperation("绑定团队管理员")
    @PostMapping("/manager-bind")
    public ResultDTO<Boolean> managerBind(@RequestBody @Valid TeamManagerBindDTO dto) {
        return organizationRpcService.managerBind(dto);
    }

    @ApiOperation("解绑团队管理员")
    @PostMapping("/manager-un-bind")
    public ResultDTO<Boolean> managerUnBind(@RequestBody @Valid TeamManagerUnBindDTO dto) {
        return organizationRpcService.managerUnBind(dto);
    }

    @ApiOperation("添加团队成员")
    @PostMapping("/member-add")
    public ResultDTO<Boolean> memberAdd(@RequestBody @Valid TeamMemberAddDTO dto) {
        return organizationRpcService.memberAdd(dto);
    }

    @ApiOperation("删除团队成员")
    @PostMapping("/member-remove")
    public ResultDTO<Boolean> memberRemove(@RequestBody @Valid TeamMemberRemoveDTO dto) {
        return organizationRpcService.memberRemove(dto);
    }

    @ApiOperation("绑定团队成员职位")
    @PostMapping("/member-role-bind")
    public ResultDTO<Boolean> memberRoleBind(@RequestBody @Valid TeamMemberRoleBindDTO dto) {
        return organizationRpcService.memberRoleBind(dto);
    }

    @ApiOperation("解绑团队成员职位")
    @PostMapping("/manager-role-unbind")
    public ResultDTO<Boolean> managerRoleUnbind(@RequestBody @Valid TeamMemberRoleUnBindDTO dto) {
        return organizationRpcService.managerRoleUnbind(dto);
    }

    @ApiOperation("查询组织详情")
    @GetMapping("/organization-query")
    public ResultDTO<OrganizationDTO> organizationQuery(OrganizationQuery query) {
        return organizationRpcService.organizationQuery(query);
    }

    @ApiOperation("分页查询组织")
    @GetMapping("/organization-page-query")
    public PageResultDTO<List<OrganizationDTO>> organizationPageQuery(OrganizationPageQuery pageQuery) {
        return organizationRpcService.organizationPageQuery(pageQuery);
    }

    @ApiOperation("根据用户查询关联的组织信息列表")
    @GetMapping("/organization-info-by-account-id-query")
    public ResultDTO<OrganizationDTO> organizationInfoByAccountIdQuery(OrganizationInfoByAccountIdQuery query) {
        return organizationRpcService.organizationInfoByAccountIdQuery(query);
    }

    @ApiOperation("查询团队详情")
    @GetMapping("/team-query")
    public ResultDTO<TeamDTO> teamQuery(TeamQuery query) {
        return organizationRpcService.teamQuery(query);
    }

    @ApiOperation("分页查询团队")
    @GetMapping("/team-page-query")
    public PageResultDTO<List<TeamDTO>> teamPageQuery(TeamPageQuery pageQuery) {
        return organizationRpcService.teamPageQuery(pageQuery);
    }

    @ApiOperation("根据账号查询所属团队信息列表")
    @GetMapping("/team-info-by-account-id-query")
    public ResultDTO<TeamDTO> teamInfoByAccountIdQuery(TeamInfoByAccountIdQuery query) {
        return organizationRpcService.teamInfoByAccountIdQuery(query);
    }

    @ApiOperation("分页查询团队成员")
    @GetMapping("/team-member-by-team-id-page-query")
    public PageResultDTO<List<TeamMemberDTO>> teamMemberByTeamIdPageQuery(TeamMemberByTeamIdPageQuery pageQuery) {
        return organizationRpcService.teamMemberByTeamIdPageQuery(pageQuery);
    }
}