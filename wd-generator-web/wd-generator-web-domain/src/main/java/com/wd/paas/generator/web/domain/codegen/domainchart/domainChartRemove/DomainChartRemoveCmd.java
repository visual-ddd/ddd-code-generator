package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartRemove;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除领域图及云端文件-指令
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@ApiModel(value = "删除领域图及云端文件指令")
public class DomainChartRemoveCmd {

    @ApiModelProperty(value="领域图谱id")
    private Long id;

}