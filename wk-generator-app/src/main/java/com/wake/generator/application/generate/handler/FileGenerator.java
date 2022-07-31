package com.wake.generator.application.generate.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 文件生成器
 */
@Slf4j
class FileGenerator {

    private FileGenerator() {
    }

    /**
     * 根据 context 上下文生成文件
     *
     * @param context     VelocityContext 标签上下文 用于替换模板中的变量
     * @param templateMap key: 模板路径 value: 输出全路径
     */
    public static void run(VelocityContext context, Map<String, String> templateMap,
                                   ZipOutputStream zipOutputStream) {
        for (Entry<String, String> entry : templateMap.entrySet()) {
            String templateUrl = entry.getKey();
            String outputUrl = entry.getValue();
            Template tpl = getTemplate(templateUrl);
            generateFile(context, outputUrl, tpl, zipOutputStream);
        }
    }

    private static void generateFile(VelocityContext context, String outputUrl, Template tpl,
                                     ZipOutputStream zipOutputStream) {
        try (StringWriter sw = new StringWriter()) {
            // 获取输出流
            tpl.merge(context, sw);
            // 否则存到压缩流中
            zipOutputStream.putNextEntry(new ZipEntry(outputUrl));
            IOUtils.write(sw.toString(), zipOutputStream, StandardCharsets.UTF_8);
            IOUtils.closeQuietly();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Template getTemplate(String templateUrl) {
        Template tpl = new Template();
        try {
            // 获取模板(初始化templatePreUrl + templateUrl)
            tpl = Velocity.getTemplate(templateUrl, "UTF-8");
        } catch (ResourceNotFoundException | ParseErrorException e) {
            e.printStackTrace();
        }
        return tpl;
    }

    /**
     * 创建文件夹
     *
     * @param outputUrl
     */
    private static void createFolder(String outputUrl) {
        String dir = outputUrl.substring(0, outputUrl.lastIndexOf("\\"));
        File folder = new File(dir);
        //判断文件夹是否存在,不存在则创建
        if (!folder.exists() && !folder.mkdirs()) {
            log.error("创建文件夹失败！");
        }
    }

}
