package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 应用版本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "应用版本信息")
public class ApplicationVersionInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "应用版本ID")
    private Long id;

    @ApiModelProperty(value = "应用ID")
    private Long applicationId;

    @ApiModelProperty(value = "起始版本号")
    private String startVersion;

    @ApiModelProperty(value = "当前版本号")
    private String currentVersion;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "版本状态")
    private Integer versionState;

    @ApiModelProperty(value = "关联业务域列表")
    private Set<Long> domainDesignVersionIds;

    @ApiModelProperty(value = "关联业务场景列表")
    private Set<Long> businessSceneVersionIds;

}