package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.*;

/**
 * 获取最新业务域版本信息
 */
@Data
@ApiModel(description = "获取最新业务域版本信息")
public class GetLatestDomainDesignVersionInfo {

    @ApiModelProperty(value = "业务域的唯一标识")
    private Long id;

}