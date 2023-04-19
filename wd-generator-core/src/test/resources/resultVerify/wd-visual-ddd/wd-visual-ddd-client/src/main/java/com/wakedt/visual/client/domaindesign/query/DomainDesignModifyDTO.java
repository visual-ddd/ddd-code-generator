package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 编辑业务域
 */
@Data
@ApiModel(value = "编辑业务域")
public class DomainDesignModifyDTO {

    @ApiModelProperty(value = "业务域 ID")
    public Long id;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "描述信息")
    public String description;

}