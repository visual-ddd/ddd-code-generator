package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 删除团队
 */
@Data
@ApiModel(description = "删除团队")
public class TeamRemoveDTO {

    @NotNull(message = "团队 ID不能为空！")
    @ApiModelProperty(value = "团队 ID")
    private Long id;

}