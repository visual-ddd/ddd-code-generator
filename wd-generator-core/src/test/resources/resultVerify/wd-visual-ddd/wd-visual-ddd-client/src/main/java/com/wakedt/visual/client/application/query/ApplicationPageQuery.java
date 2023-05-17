package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应用分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "应用分页查询对象")
public class ApplicationPageQuery extends PageQuery {

    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @ApiModelProperty(value = "名称")
    private String name;

}