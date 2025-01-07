package com.wakedt.visual.bizdomain.organization.client.request;

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
 * @author visual-ddd
 * @since 1.0
 */
@Data
@ApiModel(description = "删除团队成员")
public class TeamMemberRemoveDTO {

    @NotNull(message = "团队成员ID不能为空！")
    @ApiModelProperty(value = "团队成员ID", required = true)
    private Long id;

}