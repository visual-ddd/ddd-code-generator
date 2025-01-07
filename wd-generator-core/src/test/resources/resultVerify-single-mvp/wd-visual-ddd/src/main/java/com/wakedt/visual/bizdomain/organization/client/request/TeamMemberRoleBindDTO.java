package com.wakedt.visual.bizdomain.organization.client.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 绑定团队成员职位
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@ApiModel(description = "绑定团队成员职位")
public class TeamMemberRoleBindDTO {

    @NotNull(message = "团队成员ID不能为空！")
    @ApiModelProperty(value = "团队成员ID", required = true)
    private Long id;

    @NotNull(message = "成员类型标签不能为空！")
    @ApiModelProperty(value = "成员类型标签", required = true)
    private List<Integer> memberTypeList;

}