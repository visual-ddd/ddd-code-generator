package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 批量删除统一语言
 */
@Data
@ApiModel(value = "批量删除统一语言")
public class UniversalLanguageBatchRemove {

    @ApiModelProperty(value = "统一语言的唯一标识列表")
    private List<Long> idList;

}