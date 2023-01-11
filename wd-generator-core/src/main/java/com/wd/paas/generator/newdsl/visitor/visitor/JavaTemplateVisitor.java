package com.wd.paas.generator.newdsl.visitor.visitor;

import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import com.wd.paas.generator.newdsl.constant.GenerateElementTypeEnum;
import com.wd.paas.generator.newdsl.util.FileGenerator;
import com.wd.paas.generator.newdsl.visitor.element.Application;
import com.wd.paas.generator.newdsl.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.visitor.element.BusinessScenario;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;

import java.util.Properties;
import java.util.zip.ZipOutputStream;

/**
 * @author shimmer
 */
public class JavaTemplateVisitor extends Visitor {

    private final VelocityContext context = new VelocityContext();
    private String preFixOutPath;
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
            String outputPath = parseApplicationOutPath(templateUrl);
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
            String outputPath = parseBusinessDomainOutPath(templateUrl);
            FileGenerator.run(context, zipOutputStream, templateUrl, outputPath);
        }
    }

    @Override
    public void visit(BusinessScenario businessScenario) {
        System.out.println(businessScenario.getInfo().getName());
    }

    private String parseApplicationOutPath(String templateUrl) {
        String[] searchList = {
                ModelUrlConstant.PROJECT_NAME,
                ModelUrlConstant.GROUP,
                ModelUrlConstant.VM
        };

        String[] replacementList = {
                (String) context.get(VelocityLabel.PROJECT_NAME),
                (String) context.get(VelocityLabel.PROJECT_SLASH_GROUP),
                ModelUrlConstant.EMPTY
        };

        String outputUrl = StringUtils.replaceEach(templateUrl, searchList, replacementList);
        if (StringUtils.isNotBlank(preFixOutPath)) {
            outputUrl = outputUrl.replace(ModelUrlConstant.OUTPUT_PATH, preFixOutPath);
        }
        return outputUrl;
    }

    private String parseBusinessDomainOutPath(String templateUrl) {
        String[] searchList = {
                ModelUrlConstant.FIELD
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.DOMAIN_NAME)
        };
        return StringUtils.replaceEach(parseApplicationOutPath(templateUrl), searchList, replacementList);
    }

    /**
     * 配置velocity上下文
     */
    private static void initTemplateContext() {
        // 设置velocity资源加载器
        Properties properties = new Properties();
        // 加载classpath目录下的vm文件
        properties.setProperty("resource.loader.file.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 定义字符集
        properties.setProperty(RuntimeConstants.ENCODING_DEFAULT, "UTF-8");
        Velocity.init(properties);
    }
}
