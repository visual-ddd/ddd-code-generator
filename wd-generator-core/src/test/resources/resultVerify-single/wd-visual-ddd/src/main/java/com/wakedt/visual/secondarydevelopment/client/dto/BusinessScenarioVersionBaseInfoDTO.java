package com.wakedt.visual.secondarydevelopment.client.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

/**
 * 业务场景版本基本信息
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景版本基本信息")
public class BusinessScenarioVersionBaseInfoDTO extends BaseDTO {

    @NotNull(message = "业务场景版本的唯一标识不能为空！")
    @ApiModelProperty(value = "业务场景版本的唯一标识" , required = true)
    private Long id;

    @NotNull(message = "起始版本号不能为空！")
    @ApiModelProperty(value = "起始版本号" , required = true)
    private String startVersion;

    @NotNull(message = "当前版本号不能为空！")
    @ApiModelProperty(value = "当前版本号" , required = true)
    private String currentVersion;

    @NotNull(message = "版本描述信息不能为空！")
    @ApiModelProperty(value = "版本描述信息" , required = true)
    private String description;

    @NotNull(message = "版本状态不能为空！")
    @ApiModelProperty(value = "版本状态" , required = true)
    private Integer state;

    @NotNull(message = "业务场景信息不能为空！")
    @ApiModelProperty(value = "业务场景信息" , required = true)
    private BusinessScenarioDTO businessScenarioDTO;

}