package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 删除团队
 */
@Data
@ApiModel(value = "删除团队")
public class TeamRemoveDTO {

    @ApiModelProperty(value = "团队 ID")
    public Long id;

}