package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 新增业务域
 */
@Data
@ApiModel(description = "新增业务域")
public class DomainDesignCreateDTO {

    @NotNull
    @ApiModelProperty(value = "名称")
    public String name;

    @NotNull
    @ApiModelProperty(value = "团队ID")
    public Long teamId;

    @NotNull
    @ApiModelProperty(value = "标识符")
    public String identity;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

    @NotNull
    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

}