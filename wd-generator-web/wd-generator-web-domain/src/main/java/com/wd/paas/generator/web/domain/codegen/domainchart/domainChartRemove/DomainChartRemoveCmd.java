package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartRemove;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 删除领域图及云端文件-指令
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@ApiModel(value = "删除领域图及云端文件指令")
public class DomainChartRemoveCmd {

    @ApiModelProperty(value = "领域图谱id")
    private Long id;

}