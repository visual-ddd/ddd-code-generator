package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 业务域版本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域版本信息")
public class DomainDesignVersionInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "业务域版本ID")
    private Long id;

    @ApiModelProperty(value = "业务域ID")
    private Long domainDesignId;

    @ApiModelProperty(value = "起始版本号")
    private String startVersion;

    @ApiModelProperty(value = "当前版本号")
    private String currentVersion;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "业务域DSL")
    private String domainDesignDsl;

    @ApiModelProperty(value = "图形DSL")
    private String graphDsl;

    @ApiModelProperty(value = "版本状态")
    private Integer versionState;

}