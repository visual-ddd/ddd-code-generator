package com.wd.paas.generator.newdsl.generate.visitor.visitor;

import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.newdsl.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.newdsl.generate.visitor.element.*;
import com.wd.paas.generator.newdsl.generate.visitor.element.Enum;
import com.wd.paas.generator.newdsl.util.FileGenerator;
import org.apache.velocity.VelocityContext;

import java.util.zip.ZipOutputStream;

/**
 * @author shimmer
 */
public class JavaTemplateVisitor extends JavaBaseVisitor implements Visitor {

    private final VelocityContext context = new VelocityContext();
    private final String preFixOutPath;
    private final ZipOutputStream zipOutputStream;
    private Boolean isGenerateProjectFrame = true;

    public JavaTemplateVisitor(String preFixOutPath, ZipOutputStream zipOutputStream) {
        this.preFixOutPath = preFixOutPath;
        this.zipOutputStream = zipOutputStream;
        initTemplateContext();
    }

    public void setGenerateProjectFrame(Boolean generateProjectFrame) {
        isGenerateProjectFrame = generateProjectFrame;
    }

    @Override
    public void visit(Application application) {
        context.put(VelocityLabel.PROJECT_NAME, application.getInfo().getName());
        context.put(VelocityLabel.PROJECT_PACKAGE, application.getPackageName());
        context.put(VelocityLabel.PROJECT_AUTHOR, "projectInfo.getAuthor()");
        context.put(VelocityLabel.PROJECT_DATE_TIME, "projectInfo.getDateTime()");
        context.put(VelocityLabel.PROJECT_SLASH_GROUP, "trans2Slash(projectInfo.getGroup())");

        if (!isGenerateProjectFrame) {
            return;
        }

        // 获取模版文件列表
        String[] templateUrls = GenerateElementTypeEnum.PROJECT.getTemplateUrls();
        for (String templateUrl : templateUrls) {
            String outputPath = parseApplicationOutPath(templateUrl, context, preFixOutPath);
            FileGenerator.run(context, zipOutputStream, templateUrl, outputPath);
        }
    }

    @Override
    public void visit(BusinessDomain businessDomain) {
        context.put(VelocityLabel.DOMAIN_NAME, businessDomain.getInfo().getName());
        context.put(VelocityLabel.DOMAIN_AUTHOR, "businessDomain.getAuthor()");
        context.put(VelocityLabel.DOMAIN_DATE_TIME, "businessDomain.getDateTime()");

        // 获取模版文件列表
        String[] templateUrls = GenerateElementTypeEnum.DOMAIN_CHART.getTemplateUrls();
        for (String templateUrl : templateUrls) {
            String outputPath = parseBusinessDomainOutPath(templateUrl, context, preFixOutPath);
            FileGenerator.run(context, zipOutputStream, templateUrl, outputPath);
        }
    }

    @Override
    public void visit(BusinessScenario businessScenario) {
        System.out.println(businessScenario.getInfo().getName());
    }

    @Override
    public void visit(DomainModel domainModel) {

    }

    @Override
    public void visit(Aggregate aggregate) {

    }

    @Override
    public void visit(AggregateRoot aggregateRoot) {

    }

    @Override
    public void visit(Entity entity) {

    }

    @Override
    public void visit(Enum anEnum) {

    }

    @Override
    public void visit(Command command) {

    }

    @Override
    public void visit(ValueObject valueObject) {

    }

    @Override
    public void visit(CommandParameter commandParameter) {

    }

    @Override
    public void visit(Event event) {

    }


}
