package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 删除业务域版本
 */
@Data
@ApiModel(value = "删除业务域版本")
public class DomainDesignVersionRemoveDTO {

    @ApiModelProperty(value = "业务域场景ID")
    public Long id;

}