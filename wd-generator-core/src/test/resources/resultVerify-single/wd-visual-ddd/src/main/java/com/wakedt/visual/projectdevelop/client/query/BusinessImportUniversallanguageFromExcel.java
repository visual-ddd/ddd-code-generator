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
 * Excel导入统一语言(业务域)
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
 */
@Data
@ApiModel(description = "Excel导入统一语言(业务域)")
public class BusinessImportUniversallanguageFromExcel {

    @NotNull(message = "Excel文件不能为空！")
    @ApiModelProperty(value = "Excel文件" , required = true)
    private String file;

}