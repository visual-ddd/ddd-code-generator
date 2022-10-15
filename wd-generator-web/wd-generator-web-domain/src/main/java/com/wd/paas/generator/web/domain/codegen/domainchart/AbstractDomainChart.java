package com.wd.paas.generator.web.domain.codegen.domainchart;

import lombok.Data;

/**
 * 领域图谱-聚合根
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 12:09:06
 * @since 1.0
 */
@Data
public abstract class AbstractDomainChart {

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