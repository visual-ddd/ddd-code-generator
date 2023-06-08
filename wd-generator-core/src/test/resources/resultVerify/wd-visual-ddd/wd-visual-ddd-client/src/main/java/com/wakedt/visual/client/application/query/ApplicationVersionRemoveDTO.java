package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 删除应用版本
 */
@Data
@ApiModel(description = "删除应用版本")
public class ApplicationVersionRemoveDTO {

    @ApiModelProperty(value = "应用版本ID")
    public Long id;

}