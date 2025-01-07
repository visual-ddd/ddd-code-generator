package com.wakedt.visual.bizservice.projectdevelop.client.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizservice.projectdevelop.client.response.*;

import javax.validation.constraints.NotNull;

/**
 * 批量删除统一语言
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@ApiModel(description = "批量删除统一语言")
public class UniversalLanguageBatchRemove {

    @NotNull(message = "统一语言的唯一标识列表不能为空！")
    @ApiModelProperty(value = "统一语言的唯一标识列表", required = true)
    private List<Long> idList;

}