package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 新增业务域版本
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "新增业务域版本")
public class DomainDesignVersionCreateDTO {

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

}