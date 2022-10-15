package com.wd.paas.generator.web.client.codegen.project.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 项目-分页查询对象
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "项目分页查询对象")
public class ProjectPageQuery  extends PageQuery {

    @ApiModelProperty(value="项目id")
    private Long id;

}