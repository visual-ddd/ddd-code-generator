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
 */
@Data
@ApiModel(description = "Excel导入统一语言")
public class ImportUniversalLanguageFromExcel {

    @NotNull
    @ApiModelProperty(value = "Excel文件")
    private String file;

    @NotNull
    @ApiModelProperty(value = "统一语言类型")
    private Integer languageType;

    @NotNull
    @ApiModelProperty(value = "所属唯一标识")
    private Long identity;

}