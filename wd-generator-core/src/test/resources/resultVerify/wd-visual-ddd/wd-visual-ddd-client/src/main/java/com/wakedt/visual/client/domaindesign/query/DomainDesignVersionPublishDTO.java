package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 发布业务域版本
 */
@Data
@ApiModel(description = "发布业务域版本")
public class DomainDesignVersionPublishDTO {

    @NotNull
    @ApiModelProperty(value = "业务域场景ID")
    public Long id;

}