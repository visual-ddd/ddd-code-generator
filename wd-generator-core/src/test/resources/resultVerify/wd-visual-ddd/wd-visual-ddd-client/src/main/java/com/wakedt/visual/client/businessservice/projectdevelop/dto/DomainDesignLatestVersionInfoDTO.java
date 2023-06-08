package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

/**
 * 业务域最新版本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域最新版本信息")
public class DomainDesignLatestVersionInfoDTO extends BaseDTO {

    @NotNull(message = "业务域ID不能为空！")
    @ApiModelProperty(value = "业务域ID")
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @NotNull(message = "标识符不能为空！")
    @ApiModelProperty(value = "标识符")
    private String identity;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull(message = "业务域最新版本信息不能为空！")
    @ApiModelProperty(value = "业务域最新版本信息")
    private DomainDesignVersionInfoDTO domainDesignLatestVersion;

}