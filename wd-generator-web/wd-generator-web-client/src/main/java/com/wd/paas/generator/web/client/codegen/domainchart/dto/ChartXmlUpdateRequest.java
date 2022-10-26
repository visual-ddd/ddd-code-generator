package com.wd.paas.generator.web.client.codegen.domainchart.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 更新图谱云文件-请求参数
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@ApiModel(value = "更新图谱云文件请求")
public class ChartXmlUpdateRequest {

    @ApiModelProperty(value = "图谱xml文件内容")
    private String xml;

}