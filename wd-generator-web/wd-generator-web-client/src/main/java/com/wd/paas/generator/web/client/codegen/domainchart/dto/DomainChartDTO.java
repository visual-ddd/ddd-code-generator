package com.wd.paas.generator.web.client.codegen.domainchart.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 领域图谱-查询结果集
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@ApiModel(value = "领域图谱-查询结果集")
public class DomainChartDTO {

    @ApiModelProperty(value="领域图谱id")
    private Long id;

    @ApiModelProperty(value="领域名")
    private String domainName;

    @ApiModelProperty(value="领域作者")
    private String domainAuthor;

    @ApiModelProperty(value="图谱xml存储URL地址")
    private String chartXmlUrl;

    @ApiModelProperty(value="领域描述")
    private String domainDesc;

}