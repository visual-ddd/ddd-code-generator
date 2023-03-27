package com.wakedt.visual.client.businessservice.secondarydevelopment.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 免鉴权获取业务域版本信息
 */
@Data
@ApiModel(value = "免鉴权获取业务域版本信息")
public class GetDomainDesignVersionNoAuth {

    @ApiModelProperty(value = "业务域版本的唯一标识")
    private Long id;

}