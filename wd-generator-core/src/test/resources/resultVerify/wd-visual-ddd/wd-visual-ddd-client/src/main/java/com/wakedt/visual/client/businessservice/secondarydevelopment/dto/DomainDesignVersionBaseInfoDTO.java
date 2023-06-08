package com.wakedt.visual.client.businessservice.secondarydevelopment.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 业务域版本基本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域版本基本信息")
public class DomainDesignVersionBaseInfoDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "业务域版本的唯一标识")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "起始版本号")
    private String startVersion;

    @NotNull
    @ApiModelProperty(value = "当前版本号")
    private String currentVersion;

    @NotNull
    @ApiModelProperty(value = "版本描述信息")
    private String description;

    @NotNull
    @ApiModelProperty(value = "版本状态")
    private Integer state;

    @NotNull
    @ApiModelProperty(value = "业务域信息")
    private DomainDesignDTO domainDesignDTO;

}