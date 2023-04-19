package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 业务域最新版本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "业务域最新版本信息")
public class DomainDesignLatestVersionInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "业务域ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "团队的唯一标识")
    private Long teamId;

    @ApiModelProperty(value = "唯一标识，此处使用大驼峰命名")
    private String identity;

    @ApiModelProperty(value = "描述信息")
    private String description;

    @ApiModelProperty(value = "业务域最新版本信息")
    private DomainDesignVersionInfoDTO domainDesignLatestVersion;

}