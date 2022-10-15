package com.wd.paas.generator.web.client.codegen.project.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 项目-查询结果集
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@ApiModel(value = "项目-查询结果集")
public class ProjectDTO {

    @ApiModelProperty(value="项目id")
    private Long id;

    @ApiModelProperty(value="包路径")
    private String packagePath;

    @ApiModelProperty(value="项目作者")
    private String projectAuthor;

    @ApiModelProperty(value="项目版本号")
    private String projectVersion;

    @ApiModelProperty(value="项目描述")
    private String projectDesc;

    @ApiModelProperty(value="项目名")
    private String projectName;

}