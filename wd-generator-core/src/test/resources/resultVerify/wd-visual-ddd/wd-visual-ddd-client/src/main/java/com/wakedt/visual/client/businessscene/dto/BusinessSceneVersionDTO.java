package com.wakedt.visual.client.businessscene.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务场景版本数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景版本数据传输对象")
public class BusinessSceneVersionDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "业务场景版本ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "业务场景ID")
    private Long businessSceneId;

    @NotNull
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull
    @ApiModelProperty(value = "起始版本号")
    private String startVersion;

    @NotNull
    @ApiModelProperty(value = "当前版本号")
    private String currentVersion;

    @NotNull
    @ApiModelProperty(value = "业务场景DSL")
    private String businessSceneDsl;

    @NotNull
    @ApiModelProperty(value = "图形DSL")
    private String graphDsl;

    @NotNull
    @ApiModelProperty(value = "版本状态")
    private Integer versionState;

}