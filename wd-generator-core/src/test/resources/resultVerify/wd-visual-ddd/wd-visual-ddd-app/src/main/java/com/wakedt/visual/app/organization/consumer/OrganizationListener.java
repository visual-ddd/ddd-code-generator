package com.wakedt.visual.app.organization.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.domain.organization.organization.organizationcreate.OrganizationCreateCmdHandler;
import com.wakedt.visual.domain.organization.organization.organizationmodify.OrganizationModifyCmdHandler;
import com.wakedt.visual.domain.organization.organization.organizationremove.OrganizationRemoveCmdHandler;
import com.wakedt.visual.domain.organization.organization.organizationmanagerunbind.OrganizationManagerUnbindCmdHandler;
import com.wakedt.visual.domain.organization.organization.organizationmanagerbind.OrganizationManagerBindCmdHandler;
import com.wakedt.visual.domain.organization.team.teamcreate.TeamCreateCmdHandler;
import com.wakedt.visual.domain.organization.team.teammodify.TeamModifyCmdHandler;
import com.wakedt.visual.domain.organization.team.teamremove.TeamRemoveCmdHandler;
import com.wakedt.visual.domain.organization.team.teammanagerbind.TeamManagerBindCmdHandler;
import com.wakedt.visual.domain.organization.team.teammanagerunbind.TeamManagerUnBindCmdHandler;
import com.wakedt.visual.domain.organization.teammember.teammemberadd.TeamMemberAddCmdHandler;
import com.wakedt.visual.domain.organization.teammember.teammemberremove.TeamMemberRemoveCmdHandler;
import com.wakedt.visual.domain.organization.teammember.teammemberrolebind.TeamMemberRoleBindCmdHandler;
import com.wakedt.visual.domain.organization.teammember.teammanagerroleunbind.TeamMemberRoleUnBindCmdHandler;

import javax.annotation.Resource;

/**
 * Organization-事件订阅
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class OrganizationListener {

}