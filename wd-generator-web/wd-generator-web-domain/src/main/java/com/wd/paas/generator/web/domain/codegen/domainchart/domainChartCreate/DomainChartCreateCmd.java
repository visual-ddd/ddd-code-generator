package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartCreate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 创建领域图谱-指令
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@ApiModel(value = "创建领域图谱指令")
public class DomainChartCreateCmd {

    @ApiModelProperty(value="项目id")
    private Long projectId;

    @ApiModelProperty(value="领域作者")
    private String domainAuthor;

    @ApiModelProperty(value="图谱xml存储URL地址")
    private String chartXmlUrl;

    @ApiModelProperty(value="领域描述")
    private String domainDesc;

    @ApiModelProperty(value="领域名")
    private String domainName;

}