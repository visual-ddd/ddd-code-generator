package com.wakedt.visual.organization.app.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.wakedt.visual.organization.app.cmd.organizationcreate.OrganizationCreateCmdHandler;
import com.wakedt.visual.organization.app.cmd.organizationmodify.OrganizationModifyCmdHandler;
import com.wakedt.visual.organization.app.cmd.organizationremove.OrganizationRemoveCmdHandler;
import com.wakedt.visual.organization.app.cmd.organizationmanagerunbind.OrganizationManagerUnbindCmdHandler;
import com.wakedt.visual.organization.app.cmd.organizationmanagerbind.OrganizationManagerBindCmdHandler;
import com.wakedt.visual.organization.app.cmd.teamcreate.TeamCreateCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammodify.TeamModifyCmdHandler;
import com.wakedt.visual.organization.app.cmd.teamremove.TeamRemoveCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammanagerbind.TeamManagerBindCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammanagerunbind.TeamManagerUnBindCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammemberadd.TeamMemberAddCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammemberremove.TeamMemberRemoveCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammemberrolebind.TeamMemberRoleBindCmdHandler;
import com.wakedt.visual.organization.app.cmd.teammanagerroleunbind.TeamMemberRoleUnBindCmdHandler;
import javax.annotation.Resource;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Organization - 定时任务
 */
@Slf4j
@Component
public class OrganizationTask {

}