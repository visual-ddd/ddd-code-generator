package com.wd.paas.generator.convert.project;

import com.wd.paas.generator.convert.project.domainchart.DomainChartGeneratorDTO;
import com.wd.paas.generator.generate.generator.ProjectInfo;
import com.wd.paas.generator.generate.generator.project.domainchart.DomainChartGenerator;
import com.wd.paas.generator.generate.generator.project.ProjectGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;

/**
 * DDD项目生成信息
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/26
 */
@Data
public class ProjectGeneratorDTO {

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目作者
     */
    private String author;

    /**
     * 项目生成时间
     */
    private String dateTime;

    /**
     * 项目全包名
     */
    private String group;

    /**
     * 领域图谱列表
     */
    private List<DomainChartGeneratorDTO> domainChartList;

    /**
     * 转换为项目生成器
     *
     * @return 项目生成器
     */
    public ProjectGenerator trans2ProjectGenerator() {
        ProjectGenerator projectGenerator = new ProjectGenerator();
        projectGenerator.setProjectInfo(trans2ProjectInfo());
        projectGenerator.setDomainChartList(trans2DomainCharts(domainChartList));
        return projectGenerator;
    }

    private List<DomainChartGenerator> trans2DomainCharts(
        List<DomainChartGeneratorDTO> domainChartList) {
        return domainChartList.stream()
            .map(DomainChartGeneratorDTO::trans2DomainChart)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    private ProjectInfo trans2ProjectInfo() {
        ProjectInfo projectInfo = new ProjectInfo();
        projectInfo.setName(name);
        projectInfo.setAuthor(author);
        projectInfo.setDateTime(dateTime);
        projectInfo.setGroup(group);
        return projectInfo;
    }
}
