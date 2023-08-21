package com.wakedt.visual.organization.app.cmd.organizationcreate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新增组织-指令
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationCreateCmd {

    /** 名称 */
    private String name;

    /** 描述 */
    private String description;

    /** 组织管理员 */
    private Long organizationManagerId;

}