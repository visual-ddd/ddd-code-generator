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

    @ApiModelProperty(value = "业务场景版本ID")
    private Long id;

    @ApiModelProperty(value = "业务场景ID")
    private Long businessSceneId;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "起始版本号")
    private String startVersion;

    @ApiModelProperty(value = "当前版本号")
    private String currentVersion;

    @ApiModelProperty(value = "业务场景DSL")
    private String businessSceneDsl;

    @ApiModelProperty(value = "图形DSL")
    private String graphDsl;

    @ApiModelProperty(value = "版本状态")
    private Integer versionState;

}