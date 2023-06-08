package com.wakedt.visual.client.businessservice.secondarydevelopment.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 业务域信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域信息")
public class DomainDesignDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "业务域的唯一标识")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull
    @ApiModelProperty(value = "标识符")
    private String identity;

    @NotNull
    @ApiModelProperty(value = "描述信息")
    private String description;

}