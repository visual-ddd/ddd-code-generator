package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 删除团队成员
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Data
@ApiModel(description = "删除团队成员")
public class TeamMemberRemoveDTO {

    @NotNull(message = "团队成员ID不能为空！")
    @ApiModelProperty(value = "团队成员ID" , required = true)
    private Long id;

}