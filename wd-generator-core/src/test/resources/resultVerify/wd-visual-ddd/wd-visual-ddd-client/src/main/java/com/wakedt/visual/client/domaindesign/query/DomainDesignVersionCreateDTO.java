package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 新增业务域版本
 */
@Data
@ApiModel(value = "新增业务域版本")
public class DomainDesignVersionCreateDTO {

    @ApiModelProperty(value = "业务域的唯一标识")
    public Long domainDesignId;

    @ApiModelProperty(value = "第一次创建时，需要指定起始版本号")
    public String startVersion;

    @ApiModelProperty(value = "当前版本的唯一标识")
    public String currentVersion;

    @ApiModelProperty(value = "描述信息")
    public String description;

}