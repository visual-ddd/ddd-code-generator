package com.wakedt.visual.projectdevelop.client.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 批量删除统一语言
 */
@Data
@ApiModel(description = "批量删除统一语言")
public class UniversalLanguageBatchRemove {

    @NotNull(message = "统一语言的唯一标识列表不能为空！")
    @ApiModelProperty(value = "统一语言的唯一标识列表" , required = true)
    private List<Long> idList;

}