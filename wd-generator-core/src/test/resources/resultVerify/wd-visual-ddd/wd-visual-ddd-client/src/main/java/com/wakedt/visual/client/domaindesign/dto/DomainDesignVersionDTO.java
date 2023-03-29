package com.wakedt.visual.client.domaindesign.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 用于业务域版本的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于业务域版本的数据传输对象")
public class DomainDesignVersionDTO extends BaseDTO {

    @ApiModelProperty(value = "业务域版本ID")
    private Long id;

    @ApiModelProperty(value = "业务域的唯一标识")
    private Long domainDesignId;

    @ApiModelProperty(value = "第一次创建时，需要指定起始版本号")
    private String startVersion;

    @ApiModelProperty(value = "当前版本的唯一标识")
    private String currentVersion;

    @ApiModelProperty(value = "描述信息")
    private String description;

    @ApiModelProperty(value = "业务域抽象文本描述语言")
    private String domainDesignDsl;

    @ApiModelProperty(value = "图形的抽象文本描述语言")
    private String graphDsl;

    @ApiModelProperty(value = "版本状态")
    private Integer versionState;

}