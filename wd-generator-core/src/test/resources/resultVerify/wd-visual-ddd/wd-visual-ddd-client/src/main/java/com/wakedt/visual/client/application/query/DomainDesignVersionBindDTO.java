package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 关联业务域版本
 */
@Data
@ApiModel(value = "关联业务域版本")
public class DomainDesignVersionBindDTO {

    @ApiModelProperty(value = "应用版本ID")
    public Long id;

    @ApiModelProperty(value = "关联业务域列表")
    public Set<Long> domainDesignVersionIds;

}