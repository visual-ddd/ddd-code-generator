package com.wd.paas.generator.web.domain.codegen.project.projectRemove;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 删除项目及项目下的领域图谱-指令
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@ApiModel(value = "删除项目及项目下的领域图谱指令")
public class ProjectRemoveCmd {

    @ApiModelProperty(value = "项目id")
    private Long id;

}