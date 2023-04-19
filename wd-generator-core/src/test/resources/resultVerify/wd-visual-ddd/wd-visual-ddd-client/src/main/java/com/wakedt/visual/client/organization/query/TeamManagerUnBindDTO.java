package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 解绑团队管理员
 */
@Data
@ApiModel(value = "解绑团队管理员")
public class TeamManagerUnBindDTO {

    @ApiModelProperty(value = "主键")
    public Long id;

}