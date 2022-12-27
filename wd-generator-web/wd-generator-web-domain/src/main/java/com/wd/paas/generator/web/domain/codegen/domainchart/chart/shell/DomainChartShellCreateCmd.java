package com.wd.paas.generator.web.domain.codegen.domainchart.chart.shell;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.zip.ZipOutputStream;

/**
 * 创建领域图谱脚本-指令
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@ApiModel(value = "创建领域图谱脚本指令")
public class DomainChartShellCreateCmd {

    @ApiModelProperty(value = "领域图谱id")
    private Long id;

    private ZipOutputStream zipOutputStream;

}