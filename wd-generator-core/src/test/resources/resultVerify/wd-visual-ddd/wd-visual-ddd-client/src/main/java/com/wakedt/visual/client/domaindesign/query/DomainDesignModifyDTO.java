package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑业务域
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "编辑业务域")
public class DomainDesignModifyDTO {

    @NotNull(message = "业务域 ID不能为空！")
    @ApiModelProperty(value = "业务域 ID", required = true)
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述", required = true)
    private String description;

}