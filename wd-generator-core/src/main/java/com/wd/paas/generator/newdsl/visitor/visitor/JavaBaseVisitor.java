package com.wd.paas.generator.newdsl.visitor.visitor;

import com.wd.paas.generator.generate.constant.ModelUrlConstant;
import com.wd.paas.generator.generate.constant.VelocityLabel;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;

import java.util.Properties;

/***
 * @author wangchensheng
 */
public class JavaBaseVisitor {

    /**
     * 配置velocity上下文
     */
    protected static void initTemplateContext() {
        // 设置velocity资源加载器
        Properties properties = new Properties();
        // 加载classpath目录下的vm文件
        properties.setProperty("resource.loader.file.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 定义字符集
        properties.setProperty(RuntimeConstants.ENCODING_DEFAULT, "UTF-8");
        Velocity.init(properties);
    }

    protected String parseApplicationOutPath(String templateUrl, VelocityContext context, String preFixOutPath) {
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

    protected String parseBusinessDomainOutPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        String[] searchList = {
                ModelUrlConstant.FIELD
        };
        String[] replacementList = {
                (String) context.get(VelocityLabel.DOMAIN_NAME)
        };
        return StringUtils.replaceEach(parseApplicationOutPath(templateUrl, context, preFixOutPath), searchList, replacementList);
    }


}
