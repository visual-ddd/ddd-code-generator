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
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@ApiModel(description = "删除统一语言")
public class UniversalLanguageRemoveDTO {

    @NotNull(message = "统一语言 ID不能为空！")
    @ApiModelProperty(value = "统一语言 ID" , required = true)
    private Long id;

}