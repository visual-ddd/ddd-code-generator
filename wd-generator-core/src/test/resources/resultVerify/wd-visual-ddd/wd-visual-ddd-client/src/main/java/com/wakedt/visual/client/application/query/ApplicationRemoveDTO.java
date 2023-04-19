package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 删除应用
 */
@Data
@ApiModel(value = "删除应用")
public class ApplicationRemoveDTO {

    @ApiModelProperty(value = "应用 ID")
    public Long id;

}