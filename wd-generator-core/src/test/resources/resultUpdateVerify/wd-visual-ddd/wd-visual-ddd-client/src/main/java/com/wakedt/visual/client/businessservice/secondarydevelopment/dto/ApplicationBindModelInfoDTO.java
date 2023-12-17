package com.wakedt.visual.client.businessservice.secondarydevelopment.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 应用关联模块信息
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用关联模块信息")
public class ApplicationBindModelInfoDTO extends BaseDTO {

    @NotNull(message = "应用版本的唯一标识不能为空！")
    @ApiModelProperty(value = "应用版本的唯一标识" , required = true)
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

    @NotNull(message = "应用信息不能为空！")
    @ApiModelProperty(value = "应用信息" , required = true)
    private ApplicationDTO applicationDTO;

    @NotNull(message = "关联业务域版本信息列表不能为空！")
    @ApiModelProperty(value = "关联业务域版本信息列表" , required = true)
    private List<DomainDesignVersionBaseInfoDTO> domainDesignVersionInfos;

    @NotNull(message = "关联业务场景基本信息不能为空！")
    @ApiModelProperty(value = "关联业务场景基本信息" , required = true)
    private List<BusinessScenarioVersionBaseInfoDTO> businessScenarioVersionInfos;

}