package com.wakedt.visual.client.businessscene.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务场景版本数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "业务场景版本数据传输对象")
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