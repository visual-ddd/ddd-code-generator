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

/**
 * 业务场景分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景分页查询对象")
public class BusinessScenePageQuery extends PageQuery {

    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @ApiModelProperty(value = "名称")
    private String name;

}