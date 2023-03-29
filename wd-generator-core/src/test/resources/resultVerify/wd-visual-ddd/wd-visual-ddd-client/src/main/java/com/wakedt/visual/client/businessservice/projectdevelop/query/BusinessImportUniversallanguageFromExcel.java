package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 不进行数据处理(由前端进行插入数据库)
 */
@Data
@ApiModel(value = "不进行数据处理(由前端进行插入数据库)")
public class BusinessImportUniversallanguageFromExcel {

    @ApiModelProperty(value = "Excel文件")
    private String file;

}