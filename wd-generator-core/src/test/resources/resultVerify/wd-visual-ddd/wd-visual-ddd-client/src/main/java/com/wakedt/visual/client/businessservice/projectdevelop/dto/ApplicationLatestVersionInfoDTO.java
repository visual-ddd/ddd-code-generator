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

    @NotNull
    @ApiModelProperty(value = "应用的唯一标识")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "团队的唯一标识")
    private Long teamId;

    @NotNull
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull
    @ApiModelProperty(value = "标识符")
    private String identity;

    @NotNull
    @ApiModelProperty(value = "描述信息")
    private String description;

    @NotNull
    @ApiModelProperty(value = "包名")
    private String packageName;

    @NotNull
    @ApiModelProperty(value = "应用最新版本信息")
    private ApplicationVersionInfoDTO applicationLatestVersion;

}