package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 删除团队
 */
@Data
@ApiModel(description = "删除团队")
public class TeamRemoveDTO {

    @ApiModelProperty(value = "团队 ID")
    public Long id;

}