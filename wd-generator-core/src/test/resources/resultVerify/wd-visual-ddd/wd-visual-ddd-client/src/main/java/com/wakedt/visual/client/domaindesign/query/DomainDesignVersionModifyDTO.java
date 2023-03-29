package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 编辑业务域版本
 */
@Data
@ApiModel(value = "编辑业务域版本")
public class DomainDesignVersionModifyDTO {

    @ApiModelProperty(value = "业务域场景ID")
    public Long id;

    @ApiModelProperty(value = "描述信息")
    public String description;

}