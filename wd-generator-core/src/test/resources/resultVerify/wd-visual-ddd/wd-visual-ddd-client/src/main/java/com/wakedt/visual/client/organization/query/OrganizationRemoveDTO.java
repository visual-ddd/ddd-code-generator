package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 删除组织
 */
@Data
@ApiModel(description = "删除组织")
public class OrganizationRemoveDTO {

    @ApiModelProperty(value = "组织 ID")
    public Long id;

}