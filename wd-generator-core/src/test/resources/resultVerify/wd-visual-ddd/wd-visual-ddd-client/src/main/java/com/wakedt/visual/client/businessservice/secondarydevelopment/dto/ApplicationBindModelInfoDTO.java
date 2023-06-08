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
 * 应用关联模块信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用关联模块信息")
public class ApplicationBindModelInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "应用版本的唯一标识")
    private Long id;

    @ApiModelProperty(value = "起始版本号")
    private String startVersion;

    @ApiModelProperty(value = "当前版本号")
    private String currentVersion;

    @ApiModelProperty(value = "版本描述信息")
    private String description;

    @ApiModelProperty(value = "版本状态")
    private Integer state;

    @ApiModelProperty(value = "应用信息")
    private ApplicationDTO applicationDTO;

    @ApiModelProperty(value = "关联业务域版本信息列表")
    private List<DomainDesignVersionBaseInfoDTO> domainDesignVersionInfos;

    @ApiModelProperty(value = "关联业务场景基本信息")
    private List<BusinessScenarioVersionBaseInfoDTO> businessScenarioVersionInfos;

}