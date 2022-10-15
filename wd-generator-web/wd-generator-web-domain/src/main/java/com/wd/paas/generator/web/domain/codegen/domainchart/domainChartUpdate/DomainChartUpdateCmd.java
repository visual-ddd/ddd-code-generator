package com.wd.paas.generator.web.domain.codegen.domainchart.domainChartUpdate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 更新领域图谱-指令
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@ApiModel(value = "更新领域图谱指令")
public class DomainChartUpdateCmd {

    @ApiModelProperty(value="项目id")
    private Long projectId;

    @ApiModelProperty(value="领域图谱id")
    private Long id;

    @ApiModelProperty(value="领域作者")
    private String domainAuthor;

    @ApiModelProperty(value="领域名")
    private String domainName;

    @ApiModelProperty(value="领域描述")
    private String domainDesc;

    @ApiModelProperty(value="图谱xml存储URL地址")
    private String chartXmlUrl;

}