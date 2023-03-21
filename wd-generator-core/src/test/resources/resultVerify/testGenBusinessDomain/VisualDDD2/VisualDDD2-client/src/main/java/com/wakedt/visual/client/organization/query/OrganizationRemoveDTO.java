package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 删除组织
 */
@Data
@ApiModel(value = "删除组织")
public class OrganizationRemoveDTO {

    @ApiModelProperty(value = "组织 ID")
    public Long id;
}