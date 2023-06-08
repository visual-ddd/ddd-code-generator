package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 删除业务域
 */
@Data
@ApiModel(description = "删除业务域")
public class DomainDesignRemoveDTO {

    @ApiModelProperty(value = "业务域 ID")
    public Long id;

}