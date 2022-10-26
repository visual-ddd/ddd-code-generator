package com.wd.paas.generator.web.client.codegen.project.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import java.util.List;

/**
 * 项目-查询对象
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@ApiModel(value = "项目查询对象")
public class ProjectQuery {

    @ApiModelProperty(value = "项目id")
    private Long id;

}