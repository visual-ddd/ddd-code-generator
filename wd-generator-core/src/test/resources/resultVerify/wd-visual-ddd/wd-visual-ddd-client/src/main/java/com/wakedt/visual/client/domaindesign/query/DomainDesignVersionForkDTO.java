package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * Fork业务域版本
 */
@Data
@ApiModel(description = "Fork业务域版本")
public class DomainDesignVersionForkDTO {

    @ApiModelProperty(value = "基版本的唯一标识")
    public Long startVersionId;

    @ApiModelProperty(value = "当前版本号")
    public String currentVersion;

    @ApiModelProperty(value = "描述")
    public String description;

}