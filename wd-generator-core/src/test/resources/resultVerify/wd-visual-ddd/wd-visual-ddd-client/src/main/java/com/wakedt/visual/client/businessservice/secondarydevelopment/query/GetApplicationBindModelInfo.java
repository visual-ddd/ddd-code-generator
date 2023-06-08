package com.wakedt.visual.client.businessservice.secondarydevelopment.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.businessservice.secondarydevelopment.dto.*;

/**
 * 获取应用关联的模块信息
 */
@Data
@ApiModel(description = "获取应用关联的模块信息")
public class GetApplicationBindModelInfo {

    @ApiModelProperty(value = "应用的唯一标识")
    private Long applicationId;

}