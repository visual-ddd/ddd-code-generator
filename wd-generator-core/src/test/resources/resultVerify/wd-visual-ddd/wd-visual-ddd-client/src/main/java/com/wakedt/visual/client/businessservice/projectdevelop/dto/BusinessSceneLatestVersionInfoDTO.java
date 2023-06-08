package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 业务场景最新版本信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景最新版本信息")
public class BusinessSceneLatestVersionInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "业务场景ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @ApiModelProperty(value = "标识符")
    private String identity;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "业务场景最新版本信息")
    private BusinessSceneVersionInfoDTO businessSceneLatestVersion;

}