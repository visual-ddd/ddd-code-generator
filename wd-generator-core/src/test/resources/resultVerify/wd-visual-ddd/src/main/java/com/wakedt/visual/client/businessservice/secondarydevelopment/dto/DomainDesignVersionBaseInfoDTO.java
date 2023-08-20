package com.wakedt.visual.client.businessservice.secondarydevelopment.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 业务域版本基本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域版本基本信息")
public class DomainDesignVersionBaseInfoDTO extends BaseDTO {

    @NotNull(message = "业务域版本的唯一标识不能为空！")
    @ApiModelProperty(value = "业务域版本的唯一标识" , required = true)
    private Long id;

    @NotNull(message = "起始版本号不能为空！")
    @ApiModelProperty(value = "起始版本号" , required = true)
    private String startVersion;

    @NotNull(message = "当前版本号不能为空！")
    @ApiModelProperty(value = "当前版本号" , required = true)
    private String currentVersion;

    @NotNull(message = "版本描述信息不能为空！")
    @ApiModelProperty(value = "版本描述信息" , required = true)
    private String description;

    @NotNull(message = "版本状态不能为空！")
    @ApiModelProperty(value = "版本状态" , required = true)
    private Integer state;

    @NotNull(message = "业务域信息不能为空！")
    @ApiModelProperty(value = "业务域信息" , required = true)
    private DomainDesignDTO domainDesignDTO;

}