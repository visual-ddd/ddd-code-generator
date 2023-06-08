package com.wakedt.visual.client.domaindesign.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务域数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域数据传输对象")
public class DomainDesignDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "业务域 ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @NotNull
    @ApiModelProperty(value = "标识符")
    private String identity;

    @NotNull
    @ApiModelProperty(value = "描述")
    private String description;

}