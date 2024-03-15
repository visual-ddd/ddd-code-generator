package com.wd.paas.generator.common.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

/**
 * 文件生成器
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Slf4j
public class FileGenerator {

    private FileGenerator() {
    }

    /**
     * 根据 context 上下文生成文件
     *
     * @param context     VelocityContext 标签上下文 用于替换模板中的变量
     * @param templateMap key: 模板路径 value: 输出全路径
     */
    public static void run(VelocityContext context, Map<String, String> templateMap,
                           ZipOutputStream zipOutputStream, VelocityEngine velocityEngine) {
        if (Objects.isNull(templateMap)) {
            return;
        }
        for (Entry<String, String> entry : templateMap.entrySet()) {
            String templateUrl = entry.getKey();
            String outputUrl = entry.getValue();
            run(context, zipOutputStream,velocityEngine, templateUrl, outputUrl);
        }
    }

    public static void run(VelocityContext context, ZipOutputStream zipOutputStream, VelocityEngine velocityEngine, String templateUrl, String outputUrl) {
        Template tpl = getTemplate(templateUrl, velocityEngine);
        generateFile(context, outputUrl, tpl, zipOutputStream);
    }

    /**
     * 根据velocity上下文中的标签生成文件
     *
     * @param context         velocity上下文
     * @param outputUrl       输出路径
     * @param tpl             模版文件
     * @param zipOutputStream 压缩输出流
     */
    private static void generateFile(VelocityContext context, String outputUrl, Template tpl,
                                     ZipOutputStream zipOutputStream) {
        try (StringWriter sw = new StringWriter()) {
            // 获取输出流
            tpl.merge(context, sw);
            IOUtils.write(sw.toString(), getOutputStream(outputUrl, zipOutputStream), StandardCharsets.UTF_8);
            IOUtils.closeQuietly();
        } catch (ZipException e) {
            throw new IllegalStateException("压缩文件失败！" + e);
        } catch (Exception e) {
            log.error("Velocity模版合并失败！" + tpl);
            throw new IllegalStateException("Velocity模版合并失败！" + e);
        }
    }

    private static OutputStream getOutputStream(String outputUrl, ZipOutputStream zipOutputStream)
            throws IOException {
        OutputStream outputStream;
        if (zipOutputStream == null) {
            createFolder(outputUrl);
            File outFile = new File(outputUrl);
            outputStream = Files.newOutputStream(outFile.toPath());
        } else {
            zipOutputStream.putNextEntry(new ZipEntry(outputUrl));
            outputStream = zipOutputStream;
        }
        return outputStream;
    }

    private static Template getTemplate(String templateUrl, VelocityEngine velocityEngine) {
        Template tpl = new Template();

        try {
            // 获取模板(初始化templatePreUrl + templateUrl)
            tpl = velocityEngine.getTemplate("templates/" + templateUrl, "UTF-8");
        } catch (ResourceNotFoundException e) {
            log.error("模版文件资源找不到！");
        } catch (ParseErrorException e) {
            log.error("解析模版文件失败！");
        }
        return tpl;
    }

    /**
     * 创建文件夹
     *
     * @param outputUrl 输出路径
     */
    private static void createFolder(String outputUrl) {
        String dir = outputUrl.substring(0, outputUrl.lastIndexOf("/"));
        File folder = new File(dir);
        //判断文件夹是否存在,不存在则创建
        if (!folder.exists() && !folder.mkdirs()) {
            log.error("创建文件夹失败！");
        }
    }
}
