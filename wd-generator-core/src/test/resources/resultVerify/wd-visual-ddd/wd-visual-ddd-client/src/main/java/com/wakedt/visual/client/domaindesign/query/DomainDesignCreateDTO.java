package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 新增业务域
 */
@Data
@ApiModel(value = "新增业务域")
public class DomainDesignCreateDTO {

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "团队ID")
    public Long teamId;

    @ApiModelProperty(value = "标识符")
    public String identity;

    @ApiModelProperty(value = "描述")
    public String description;

    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

}