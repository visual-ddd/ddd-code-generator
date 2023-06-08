package com.wakedt.visual.client.domaindesign.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.domaindesign.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 业务域版本分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域版本分页查询对象")
public class DomainDesignVersionPageQuery extends PageQuery {

    @NotNull
    @ApiModelProperty(value = "业务域ID")
    private String domainDesignId;

}