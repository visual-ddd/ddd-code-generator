package com.wd.paas.generator.generate;

import com.wd.paas.generator.generate.constant.GenerateWayEnum;
import lombok.Data;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.util.Properties;
import java.util.zip.ZipOutputStream;

/**
 * 生成上下文信息
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public class GenerateContext {

    private VelocityContext context;
    private String outputPath;
    private ZipOutputStream zipOutputStream;

    /**
     * 生成方式
     */
    private GenerateWayEnum generateWay;

    public GenerateContext(VelocityContext context, String outputPath,
                           ZipOutputStream zipOutputStream, GenerateWayEnum generateWay) {
        this.context = context;
        this.outputPath = outputPath;
        this.zipOutputStream = zipOutputStream;
        this.generateWay = generateWay;
        initTemplateContext();
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
        properties.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
        Velocity.init(properties);
    }
}
