package com.wakedt.visual.client.universallanguage.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 删除统一语言
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "删除统一语言")
public class UniversalLanguageRemoveDTO {

    @NotNull(message = "统一语言 ID不能为空！")
    @ApiModelProperty(value = "统一语言 ID" , required = true)
    private Long id;

}