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
 * Excel导入统一语言
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "Excel导入统一语言")
public class ImportUniversalLanguageFromExcel {

    @NotNull(message = "Excel文件不能为空！")
    @ApiModelProperty(value = "Excel文件", required = true)
    private String file;

    @NotNull(message = "统一语言类型不能为空！")
    @ApiModelProperty(value = "统一语言类型", required = true)
    private Integer languageType;

    @NotNull(message = "所属唯一标识不能为空！")
    @ApiModelProperty(value = "所属唯一标识", required = true)
    private Long identity;

}