package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务场景版本分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景版本分页查询对象")
public class BusinessSceneVersionPageQuery extends PageQuery {

    @ApiModelProperty(value = "业务场景ID")
    private String businessSceneId;

}