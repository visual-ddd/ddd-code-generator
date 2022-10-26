package com.wd.paas.generator.web.client.codegen.domainchart.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 领域图谱-查询结果集
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@ApiModel(value = "领域图谱-查询结果集")
public class DomainChartDTO {

    @ApiModelProperty(value = "领域图谱id")
    private Long id;

    @ApiModelProperty(value = "领域名")
    private String domainName;

    @ApiModelProperty(value = "领域作者")
    private String domainAuthor;

    @ApiModelProperty(value = "图谱xml文件内容")
    private String chartXml;

    @ApiModelProperty(value = "领域描述")
    private String domainDesc;

    @ApiModelProperty(value = "更新时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
}