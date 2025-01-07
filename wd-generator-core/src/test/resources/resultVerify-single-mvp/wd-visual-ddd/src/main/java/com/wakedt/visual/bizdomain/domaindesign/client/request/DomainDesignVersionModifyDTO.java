package com.wakedt.visual.bizdomain.domaindesign.client.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑业务域版本
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@ApiModel(description = "编辑业务域版本")
public class DomainDesignVersionModifyDTO {

    @NotNull(message = "业务域场景ID不能为空！")
    @ApiModelProperty(value = "业务域场景ID", required = true)
    private Long id;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述", required = true)
    private String description;

}