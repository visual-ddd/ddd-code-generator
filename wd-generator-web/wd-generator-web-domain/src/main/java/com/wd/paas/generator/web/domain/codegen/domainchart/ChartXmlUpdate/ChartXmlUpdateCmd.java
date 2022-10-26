package com.wd.paas.generator.web.domain.codegen.domainchart.ChartXmlUpdate;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 更新图谱云文件-指令
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@ApiModel(value = "更新图谱云文件指令")
public class ChartXmlUpdateCmd {

    @ApiModelProperty(value = "领域图谱id")
    private Long id;

    @ApiModelProperty(value = "图谱xml文件内容")
    private String chartXml;

}