package com.wakedt.visual.client.application.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 应用版本数据传输对象
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用版本数据传输对象")
public class ApplicationVersionDTO extends BaseDTO {

    @NotNull(message = "应用版本ID不能为空！")
    @ApiModelProperty(value = "应用版本ID" , required = true)
    private Long id;

    @NotNull(message = "应用ID不能为空！")
    @ApiModelProperty(value = "应用ID" , required = true)
    private Long applicationId;

    @NotNull(message = "起始版本号不能为空！")
    @ApiModelProperty(value = "起始版本号" , required = true)
    private String startVersion;

    @NotNull(message = "当前版本号不能为空！")
    @ApiModelProperty(value = "当前版本号" , required = true)
    private String currentVersion;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

    @NotNull(message = "关联业务域列表不能为空！")
    @ApiModelProperty(value = "关联业务域列表" , required = true)
    private Set<Long> domainDesignVersionIds;

    @NotNull(message = "关联业务场景列表不能为空！")
    @ApiModelProperty(value = "关联业务场景列表" , required = true)
    private Set<Long> businessSceneVersionIds;

    @NotNull(message = "版本状态不能为空！")
    @ApiModelProperty(value = "版本状态" , required = true)
    private Integer versionState;

}