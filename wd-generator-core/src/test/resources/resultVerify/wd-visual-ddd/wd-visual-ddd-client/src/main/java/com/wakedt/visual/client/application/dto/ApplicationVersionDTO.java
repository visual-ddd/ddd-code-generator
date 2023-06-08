package com.wakedt.visual.client.application.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 应用版本数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用版本数据传输对象")
public class ApplicationVersionDTO extends BaseDTO {

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

    @ApiModelProperty(value = "关联业务域列表")
    private Set<Long> domainDesignVersionIds;

    @ApiModelProperty(value = "关联业务场景列表")
    private Set<Long> businessSceneVersionIds;

    @ApiModelProperty(value = "版本状态")
    private Integer versionState;

}