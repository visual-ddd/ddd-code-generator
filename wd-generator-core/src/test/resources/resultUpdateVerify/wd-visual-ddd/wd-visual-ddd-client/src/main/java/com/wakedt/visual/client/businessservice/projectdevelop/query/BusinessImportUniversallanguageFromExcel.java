package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Excel导入统一语言(业务域)
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "Excel导入统一语言(业务域)")
public class BusinessImportUniversallanguageFromExcel {

    @NotNull(message = "Excel文件不能为空！")
    @ApiModelProperty(value = "Excel文件" , required = true)
    private String file;

}