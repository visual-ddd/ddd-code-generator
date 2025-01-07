package com.wakedt.visual.bizdomain.businessscene.client.request;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.businessscene.client.response.*;
import javax.validation.constraints.NotNull;

/**
 * 业务场景版本分页查询对象
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景版本分页查询对象")
public class BusinessSceneVersionPageQuery extends PageQuery {

    @NotNull(message = "业务场景ID不能为空！")
    @ApiModelProperty(value = "业务场景ID", required = true)
    private String businessSceneId;

}