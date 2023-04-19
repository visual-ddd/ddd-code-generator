package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 用于应用版本的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于应用版本的数据传输对象")
public class ApplicationVersionInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "应用版本ID")
    private Long id;

    @ApiModelProperty(value = "应用的唯一标识")
    private Long applicationId;

    @ApiModelProperty(value = "第一次创建时，需要指定起始版本号")
    private String startVersion;

    @ApiModelProperty(value = "当前版本的唯一标识")
    private String currentVersion;

    @ApiModelProperty(value = "描述信息")
    private String description;

    @ApiModelProperty(value = "版本状态")
    private Integer versionState;

    @ApiModelProperty(value = "当前应用关联的业务域版本ID列表")
    private Set<Long> domainDesignVersionIds;

    @ApiModelProperty(value = "当前应用关联的业务场景版本ID列表")
    private Set<Long> businessSceneVersionIds;

}