package com.wd.paas.generator.web.infrastructure.codegen.repository.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 领域图谱实体类
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Data
@TableName("$AggregationLowerUnderscoreName")
public class DomainChartDO {

    /** 项目id */
    private Long projectId;

    /** 领域图谱id */
    private Long id;

    /** 领域名 */
    private String domainName;

    /** 领域描述 */
    private String domainDesc;

    /** 图谱xml存储URL地址 */
    private String chartXmlUrl;

    /** 领域作者 */
    private String domainAuthor;

}
