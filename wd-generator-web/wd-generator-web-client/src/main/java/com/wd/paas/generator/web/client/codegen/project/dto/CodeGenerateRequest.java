package com.wd.paas.generator.web.client.codegen.project.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 代码生成请求
 *
 * @author ZhuXueLiang
 * @date 2022/10/19 12:32
 * @version 1.0
 */
@Data
@ApiModel(value = "代码生成请求")
public class CodeGenerateRequest {

    /**
     * 需要生成的项目ID
     */
    @ApiModelProperty(value="项目id")
    private Long projectId;

}
