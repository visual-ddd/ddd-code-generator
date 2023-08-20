package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 业务场景列表查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景列表查询对象")
public class BusinessSceneListQuery extends PageQuery {

    @NotNull(message = "业务场景的唯一标识列表不能为空！")
    @ApiModelProperty(value = "业务场景的唯一标识列表" , required = true)
    private List<Long> idList;

}