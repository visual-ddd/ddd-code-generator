package com.wd.paas.generator.web.infrastructure.codegen.repository.util;

import com.wd.paas.generator.common.config.VelocityConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.RuntimeConstants;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Objects;
import java.util.Properties;

/**
 * Velocity单模版文件生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Slf4j
public class SingleVelocityFileGenerator {

    private SingleVelocityFileGenerator() {
    }

    /**
     * 根据 context 上下文生成文件
     *
     * @param context     VelocityContext 标签上下文 用于替换模板中的变量
     * @param templateUrl 模板路径
     */
    public static InputStream run(VelocityContext context, String templateUrl) {
        if (Objects.isNull(templateUrl)) {
            return null;
        }
        initTemplateContext();
        Template tpl = getTemplate(templateUrl);
        return generateFile(context, tpl);
    }

    /**
     * 根据velocity上下文中的标签生成文件
     *
     * @param context      velocity上下文
     * @param tpl          模版文件
     */
    private static InputStream generateFile(VelocityContext context, Template tpl) {
        try (StringWriter sw = new StringWriter()) {
            // 获取输出流
            tpl.merge(context, sw);
            return new ByteArrayInputStream(sw.toString().getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Template getTemplate(String templateUrl) {
        Template tpl = new Template();
        try {
            // 获取模板(初始化templatePreUrl + templateUrl)
            tpl = Velocity.getTemplate(VelocityConfig.TEMPLATE_PRE_URL + templateUrl, "UTF-8");
        } catch (ResourceNotFoundException e) {
            log.error("模版文件资源找不到！");
        } catch (ParseErrorException e) {
            log.error("解析模版文件失败！");
        }
        return tpl;
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
