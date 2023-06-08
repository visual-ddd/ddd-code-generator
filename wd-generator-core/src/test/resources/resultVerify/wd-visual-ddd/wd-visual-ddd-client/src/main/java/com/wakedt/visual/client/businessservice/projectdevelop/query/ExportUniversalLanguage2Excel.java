package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 统一语言导出Excel文件
 */
@Data
@ApiModel(description = "统一语言导出Excel文件")
public class ExportUniversalLanguage2Excel {

    @NotNull
    @ApiModelProperty(value = "http标准响应体")
    private String response;

    @NotNull
    @ApiModelProperty(value = "概念")
    private String conception;

    @NotNull
    @ApiModelProperty(value = "统一语言类型")
    private Integer languageType;

    @NotNull
    @ApiModelProperty(value = "所属唯一标识")
    private Long identity;

}