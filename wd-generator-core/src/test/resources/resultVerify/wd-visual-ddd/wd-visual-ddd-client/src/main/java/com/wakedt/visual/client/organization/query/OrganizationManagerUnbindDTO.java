package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 解绑组织管理员
 */
@Data
@ApiModel(description = "解绑组织管理员")
public class OrganizationManagerUnbindDTO {

    @NotNull
    @ApiModelProperty(value = "组织 ID")
    public Long id;

}