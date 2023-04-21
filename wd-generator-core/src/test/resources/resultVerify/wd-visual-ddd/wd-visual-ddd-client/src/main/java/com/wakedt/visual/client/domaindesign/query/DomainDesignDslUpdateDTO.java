package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 更新业务域DSL
 */
@Data
@ApiModel(value = "更新业务域DSL")
public class DomainDesignDslUpdateDTO {

    @ApiModelProperty(value = "业务域场景ID")
    public Long id;

    @ApiModelProperty(value = "业务域DSL")
    public String domainDesignDsl;

    @ApiModelProperty(value = "图形DSL")
    public String graphDsl;

}