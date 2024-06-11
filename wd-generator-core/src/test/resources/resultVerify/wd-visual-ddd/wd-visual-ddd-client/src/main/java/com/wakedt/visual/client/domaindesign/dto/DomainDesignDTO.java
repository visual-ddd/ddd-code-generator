package com.wakedt.visual.client.domaindesign.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 业务域数据传输对象
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域数据传输对象")
public class DomainDesignDTO extends BaseDTO {

    @NotNull(message = "业务域 ID不能为空！")
    @ApiModelProperty(value = "业务域 ID", required = true)
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID", required = true)
    private Long teamId;

    @NotNull(message = "标识符不能为空！")
    @ApiModelProperty(value = "标识符", required = true)
    private String identity;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述", required = true)
    private String description;

}