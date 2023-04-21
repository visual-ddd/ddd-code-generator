package com.wakedt.visual.client.domaindesign.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;

/**
 * 业务域数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "业务域数据传输对象")
public class DomainDesignDTO extends BaseDTO {

    @ApiModelProperty(value = "业务域 ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @ApiModelProperty(value = "标识符")
    private String identity;

    @ApiModelProperty(value = "描述")
    private String description;

}