package com.wakedt.visual.client.businessscene.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;

/**
 * 用于业务场景版本的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于业务场景版本的数据传输对象")
public class BusinessSceneVersionDTO extends BaseDTO {

    @ApiModelProperty(value = "业务场景版本ID")
    private Long id;

    @ApiModelProperty(value = "业务场景的唯一标识")
    private Long businessSceneId;

    @ApiModelProperty(value = "描述信息")
    private String description;

    @ApiModelProperty(value = "第一次创建时，需要指定起始版本号")
    private String startVersion;

    @ApiModelProperty(value = "当前版本的唯一标识")
    private String currentVersion;

    @ApiModelProperty(value = "业务场景抽象文本描述语言")
    private String businessSceneDsl;

    @ApiModelProperty(value = "图形的抽象文本描述语言")
    private String graphDsl;

    @ApiModelProperty(value = "版本状态")
    private Integer versionState;

}