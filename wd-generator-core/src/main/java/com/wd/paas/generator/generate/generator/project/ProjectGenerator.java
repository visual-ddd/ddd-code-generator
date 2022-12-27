package com.wd.paas.generator.generate.generator.project;

import com.wd.paas.generator.generate.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.generate.generator.AbstractGenerator;
import com.wd.paas.generator.generate.generator.ProjectInfo;
import com.wd.paas.generator.generate.generator.project.domainchart.DomainChartGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.velocity.VelocityContext;

import java.util.List;

/**
 * DDD项目生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProjectGenerator extends AbstractGenerator {

    /**
     * 项目信息
     */
    private ProjectInfo projectInfo;
    /**
     * 领域图谱列表
     */
    private List<DomainChartGenerator> domainChartList;

    @Override
    public void generate(GenerateContext generateContext) {
        Boolean isGenerateProjectFrame = generateContext.getIsGenerateProjectFrame();
        if (Boolean.TRUE.equals(isGenerateProjectFrame)) {
            super.generate(generateContext);
        }
        domainChartList.forEach(domainChart -> domainChart.run(generateContext));
    }

    @Override
    public GenerateElementTypeEnum getElementTypeUrl() {
        return GenerateElementTypeEnum.PROJECT;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.PROJECT_NAME, projectInfo.getName());
        context.put(VelocityLabel.PROJECT_PACKAGE, projectInfo.getGroup());
        context.put(VelocityLabel.PROJECT_AUTHOR, projectInfo.getAuthor());
        context.put(VelocityLabel.PROJECT_DATE_TIME, projectInfo.getDateTime());
        context.put(VelocityLabel.PROJECT_SLASH_GROUP, trans2Slash(projectInfo.getGroup()));
    }

    private String trans2Slash(String target) {
        return target.replace(ModelUrlConstant.POINT, ModelUrlConstant.SLASH);
    }
}
