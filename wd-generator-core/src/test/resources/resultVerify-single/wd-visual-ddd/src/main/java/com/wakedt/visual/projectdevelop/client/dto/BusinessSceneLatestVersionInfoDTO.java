package com.wakedt.visual.projectdevelop.client.dto;

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
 * 业务场景最新版本信息
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:57
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景最新版本信息")
public class BusinessSceneLatestVersionInfoDTO extends BaseDTO {

    @NotNull(message = "业务场景ID不能为空！")
    @ApiModelProperty(value = "业务场景ID" , required = true)
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称" , required = true)
    private String name;

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID" , required = true)
    private Long teamId;

    @NotNull(message = "标识符不能为空！")
    @ApiModelProperty(value = "标识符" , required = true)
    private String identity;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

    @NotNull(message = "业务场景最新版本信息不能为空！")
    @ApiModelProperty(value = "业务场景最新版本信息" , required = true)
    private BusinessSceneVersionInfoDTO businessSceneLatestVersion;

}