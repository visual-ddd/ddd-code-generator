package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.*;

/**
 * 批量删除统一语言
 */
@Data
@ApiModel(description = "批量删除统一语言")
public class UniversalLanguageBatchRemove {

    @ApiModelProperty(value = "统一语言的唯一标识列表")
    private List<Long> idList;

}