package com.wd.paas.generator.web.domain.codegen.project;

import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChart;
import lombok.Data;

import java.util.List;

/**
 * 项目-聚合根
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/22 12:43:01
 * @since 1.0
 */
@Data
public abstract class AbstractProject {

    /** 项目id */
    private Long id;

    /** 所属用户 */
    private Long userId;

    /** 项目名 */
    private String projectName;

    /** 项目描述 */
    private String projectDesc;

    /** 项目版本号 */
    private String projectVersion;

    /** 项目作者 */
    private String projectAuthor;

    /** 包路径 */
    private String packagePath;

    /** 过滤领域图谱信息 */
    public abstract List<DomainChart> filterDomainChartList(List<Long> domainIds);

}