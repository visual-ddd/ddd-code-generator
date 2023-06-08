package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.businessscene.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 业务场景分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景分页查询对象")
public class BusinessScenePageQuery extends PageQuery {

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称")
    private String name;

}