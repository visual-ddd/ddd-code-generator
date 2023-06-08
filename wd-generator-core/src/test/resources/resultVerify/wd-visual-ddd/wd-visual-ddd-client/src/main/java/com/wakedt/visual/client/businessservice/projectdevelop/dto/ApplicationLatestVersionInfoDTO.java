package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 应用最新版本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用最新版本信息")
public class ApplicationLatestVersionInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "应用的唯一标识")
    private Long id;

    @ApiModelProperty(value = "团队的唯一标识")
    private Long teamId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "标识符")
    private String identity;

    @ApiModelProperty(value = "描述信息")
    private String description;

    @ApiModelProperty(value = "包名")
    private String packageName;

    @ApiModelProperty(value = "应用最新版本信息")
    private ApplicationVersionInfoDTO applicationLatestVersion;

}