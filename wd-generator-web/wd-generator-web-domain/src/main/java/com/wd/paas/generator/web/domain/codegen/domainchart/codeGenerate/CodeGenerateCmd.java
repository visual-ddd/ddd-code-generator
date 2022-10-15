package com.wd.paas.generator.web.domain.codegen.domainchart.codeGenerate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

/**
 * 生成代码-指令
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@ApiModel(value = "生成代码指令")
public class CodeGenerateCmd {

    @ApiModelProperty(value="项目id")
    private Long projectId;

    @ApiModelProperty(value="需要生成的领域图谱ID")
    private List<Long> domainChartIdList;

}