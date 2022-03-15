package com.wake.generator.application.handler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

/**
 * 文件生成器
 */
@Slf4j
class FileGenerator {

    /**
     * 根据 context 上下文生成文件
     *
     * @param context     VelocityContext 标签上下文 用于替换模板中的变量
     * @param templateMap key: 模板路径 value: 输出全路径
     * @return 生成的文件列表
     */
    public List<String> run(VelocityContext context, Map<String, String> templateMap) {
        List<String> fileNames = new ArrayList<>();

        for (Entry<String, String> entry : templateMap.entrySet()) {
            String templateUrl = entry.getKey();
            String outputUrl = entry.getValue();
            Template tpl;
            try {
                // 获取模板(初始化templatePreUrl + templateUrl)
                tpl = Velocity. getTemplate(templateUrl, "UTF-8");
            } catch (ResourceNotFoundException | ParseErrorException e) {
                e.printStackTrace();
                return fileNames;
            }
            String dir = outputUrl.substring(0, outputUrl.lastIndexOf("\\"));
            File folder = new File(dir);
            //判断文件夹是否存在,不存在则创建
            if (!folder.exists() && !folder.mkdirs()) {
                log.error("创建文件夹失败！");
            }

            try (StringWriter sw = new StringWriter();
                FileOutputStream outputStream = new FileOutputStream(outputUrl)) {
                // 获取输出流
                tpl.merge(context, sw);
                // 创建文件
                IOUtils.write(sw.toString(), outputStream, StandardCharsets.UTF_8);
                fileNames.add(outputUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileNames;
    }

}
