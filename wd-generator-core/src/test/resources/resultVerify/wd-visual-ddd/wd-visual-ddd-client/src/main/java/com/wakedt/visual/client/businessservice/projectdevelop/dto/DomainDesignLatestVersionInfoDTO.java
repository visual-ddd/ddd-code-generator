package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务域最新版本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域最新版本信息")
public class DomainDesignLatestVersionInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "业务域ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @ApiModelProperty(value = "标识符")
    private String identity;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "业务域最新版本信息")
    private DomainDesignVersionInfoDTO domainDesignLatestVersion;

}