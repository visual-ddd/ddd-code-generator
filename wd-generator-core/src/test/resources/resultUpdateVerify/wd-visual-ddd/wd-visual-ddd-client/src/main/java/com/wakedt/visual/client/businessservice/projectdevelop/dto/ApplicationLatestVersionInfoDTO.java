package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 应用最新版本信息
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用最新版本信息")
public class ApplicationLatestVersionInfoDTO extends BaseDTO {

    @NotNull(message = "应用的唯一标识不能为空！")
    @ApiModelProperty(value = "应用的唯一标识" , required = true)
    private Long id;

    @NotNull(message = "团队的唯一标识不能为空！")
    @ApiModelProperty(value = "团队的唯一标识" , required = true)
    private Long teamId;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称" , required = true)
    private String name;

    @NotNull(message = "标识符不能为空！")
    @ApiModelProperty(value = "标识符" , required = true)
    private String identity;

    @NotNull(message = "描述信息不能为空！")
    @ApiModelProperty(value = "描述信息" , required = true)
    private String description;

    @NotNull(message = "包名不能为空！")
    @ApiModelProperty(value = "包名" , required = true)
    private String packageName;

    @NotNull(message = "应用最新版本信息不能为空！")
    @ApiModelProperty(value = "应用最新版本信息" , required = true)
    private ApplicationVersionInfoDTO applicationLatestVersion;

}