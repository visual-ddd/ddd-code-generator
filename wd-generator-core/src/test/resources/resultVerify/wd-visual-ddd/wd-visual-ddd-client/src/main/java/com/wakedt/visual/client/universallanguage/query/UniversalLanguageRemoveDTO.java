package com.wakedt.visual.client.universallanguage.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除统一语言
 */
@Data
@ApiModel(value = "删除统一语言")
public class UniversalLanguageRemoveDTO {

    @ApiModelProperty(value = "统一语言 ID")
    public Long id;

}