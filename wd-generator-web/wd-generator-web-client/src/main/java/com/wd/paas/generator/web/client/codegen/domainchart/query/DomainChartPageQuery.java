package com.wd.paas.generator.web.client.codegen.domainchart.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 领域图谱-分页查询对象
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "领域图谱分页查询对象")
public class DomainChartPageQuery  extends PageQuery {

}