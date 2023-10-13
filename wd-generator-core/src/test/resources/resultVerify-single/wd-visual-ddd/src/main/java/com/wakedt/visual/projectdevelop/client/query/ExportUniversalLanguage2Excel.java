package com.wakedt.visual.projectdevelop.client.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.projectdevelop.client.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 统一语言导出Excel文件
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
 */
@Data
@ApiModel(description = "统一语言导出Excel文件")
public class ExportUniversalLanguage2Excel {

    @NotNull(message = "http标准响应体不能为空！")
    @ApiModelProperty(value = "http标准响应体" , required = true)
    private String response;

    @NotNull(message = "概念不能为空！")
    @ApiModelProperty(value = "概念" , required = true)
    private String conception;

    @NotNull(message = "统一语言类型不能为空！")
    @ApiModelProperty(value = "统一语言类型" , required = true)
    private Integer languageType;

    @NotNull(message = "所属唯一标识不能为空！")
    @ApiModelProperty(value = "所属唯一标识" , required = true)
    private Long identity;

}