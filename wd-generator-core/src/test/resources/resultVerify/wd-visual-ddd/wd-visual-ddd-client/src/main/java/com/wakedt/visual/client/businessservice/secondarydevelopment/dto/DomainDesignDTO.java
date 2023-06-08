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

    @ApiModelProperty(value = "业务域的唯一标识")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "标识符")
    private String identity;

    @ApiModelProperty(value = "描述信息")
    private String description;

}