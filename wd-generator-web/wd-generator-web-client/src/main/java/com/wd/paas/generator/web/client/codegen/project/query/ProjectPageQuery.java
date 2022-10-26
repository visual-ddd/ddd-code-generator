package com.wd.paas.generator.web.client.codegen.project.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import java.util.List;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.dto.PageQuery;
import lombok.EqualsAndHashCode;

/**
 * 项目-分页查询对象
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "项目分页查询对象")
public class ProjectPageQuery extends PageQuery {

    @ApiModelProperty(value = "项目名称")
    private String projectName;

}