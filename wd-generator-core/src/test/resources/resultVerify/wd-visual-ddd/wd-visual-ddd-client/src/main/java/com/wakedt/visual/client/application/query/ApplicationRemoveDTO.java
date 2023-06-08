package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 删除应用
 */
@Data
@ApiModel(description = "删除应用")
public class ApplicationRemoveDTO {

    @NotNull
    @ApiModelProperty(value = "应用 ID")
    public Long id;

}