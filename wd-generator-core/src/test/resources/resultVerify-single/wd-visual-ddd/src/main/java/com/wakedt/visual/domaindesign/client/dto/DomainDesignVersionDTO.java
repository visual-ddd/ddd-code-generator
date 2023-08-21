package com.wakedt.visual.domaindesign.client.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务域版本数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域版本数据传输对象")
public class DomainDesignVersionDTO extends BaseDTO {

    @NotNull(message = "业务域版本ID不能为空！")
    @ApiModelProperty(value = "业务域版本ID" , required = true)
    private Long id;

    @NotNull(message = "业务域ID不能为空！")
    @ApiModelProperty(value = "业务域ID" , required = true)
    private Long domainDesignId;

    @NotNull(message = "起始版本号不能为空！")
    @ApiModelProperty(value = "起始版本号" , required = true)
    private String startVersion;

    @NotNull(message = "当前版本号不能为空！")
    @ApiModelProperty(value = "当前版本号" , required = true)
    private String currentVersion;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

    @NotNull(message = "业务域DSL不能为空！")
    @ApiModelProperty(value = "业务域DSL" , required = true)
    private String domainDesignDsl;

    @NotNull(message = "图形DSL不能为空！")
    @ApiModelProperty(value = "图形DSL" , required = true)
    private String graphDsl;

    @NotNull(message = "版本状态不能为空！")
    @ApiModelProperty(value = "版本状态" , required = true)
    private Integer versionState;

}