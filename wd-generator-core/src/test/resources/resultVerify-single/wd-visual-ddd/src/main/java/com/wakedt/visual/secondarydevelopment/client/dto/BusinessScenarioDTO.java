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
 * 业务场景信息
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:57
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景信息")
public class BusinessScenarioDTO extends BaseDTO {

    @NotNull(message = "业务场景的唯一标识不能为空！")
    @ApiModelProperty(value = "业务场景的唯一标识" , required = true)
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称" , required = true)
    private String name;

    @NotNull(message = "标识符不能为空！")
    @ApiModelProperty(value = "标识符" , required = true)
    private String identity;

    @NotNull(message = "描述信息不能为空！")
    @ApiModelProperty(value = "描述信息" , required = true)
    private String description;

}