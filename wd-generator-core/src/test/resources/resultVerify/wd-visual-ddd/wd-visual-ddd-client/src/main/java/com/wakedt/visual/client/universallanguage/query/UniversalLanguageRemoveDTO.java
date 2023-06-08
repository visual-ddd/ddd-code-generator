package com.wakedt.visual.client.universallanguage.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 删除统一语言
 */
@Data
@ApiModel(description = "删除统一语言")
public class UniversalLanguageRemoveDTO {

    @ApiModelProperty(value = "统一语言 ID")
    public Long id;

}