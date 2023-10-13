package com.wakedt.visual.app.organization.consumer;

import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
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
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Slf4j
@Component
public class OrganizationListener {

}