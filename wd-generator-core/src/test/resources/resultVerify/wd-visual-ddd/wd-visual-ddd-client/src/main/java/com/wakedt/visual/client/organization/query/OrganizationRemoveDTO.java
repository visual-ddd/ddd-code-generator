package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除组织
 */
@Data
@ApiModel(description = "删除组织")
public class OrganizationRemoveDTO {

    @ApiModelProperty(value = "组织 ID")
    public Long id;

}