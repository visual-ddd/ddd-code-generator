package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 新增业务域版本
 */
@Data
@ApiModel(description = "新增业务域版本")
public class DomainDesignVersionCreateDTO {

    @ApiModelProperty(value = "业务域ID")
    public Long domainDesignId;

    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

    @ApiModelProperty(value = "当前版本号")
    public String currentVersion;

    @ApiModelProperty(value = "描述")
    public String description;

}