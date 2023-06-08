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

    @NotNull
    @ApiModelProperty(value = "应用版本ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "应用ID")
    private Long applicationId;

    @NotNull
    @ApiModelProperty(value = "起始版本号")
    private String startVersion;

    @NotNull
    @ApiModelProperty(value = "当前版本号")
    private String currentVersion;

    @NotNull
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull
    @ApiModelProperty(value = "关联业务域列表")
    private Set<Long> domainDesignVersionIds;

    @NotNull
    @ApiModelProperty(value = "关联业务场景列表")
    private Set<Long> businessSceneVersionIds;

    @NotNull
    @ApiModelProperty(value = "版本状态")
    private Integer versionState;

}