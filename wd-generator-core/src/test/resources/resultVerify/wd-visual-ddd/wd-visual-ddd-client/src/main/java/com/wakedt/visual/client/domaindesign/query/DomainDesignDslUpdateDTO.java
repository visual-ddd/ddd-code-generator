package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 更新业务域DSL
 */
@Data
@ApiModel(description = "更新业务域DSL")
public class DomainDesignDslUpdateDTO {

    @NotNull
    @ApiModelProperty(value = "业务域场景ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "业务域DSL")
    public String domainDesignDsl;

    @NotNull
    @ApiModelProperty(value = "图形DSL")
    public String graphDsl;

}