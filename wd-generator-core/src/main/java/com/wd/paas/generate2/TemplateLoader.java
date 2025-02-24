package com.wd.paas.generate2;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 基于YAML配置的模板加载器
 */
public class TemplateLoader {

    private static final Logger LOG = LoggerFactory.getLogger(TemplateLoader.class);

    // 模板缓存（type → TemplateMeta）
    private final Map<String, TemplateMeta> templateCache = new ConcurrentHashMap<>();

    public void loadTemplates(String configPath) {
        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("newTemplates/template-config.yml");
            if (input == null) {
                System.out.println("Current working directory: " + System.getProperty("user.dir"));
                throw new FileNotFoundException("Config file not found: " + configPath);
            }
            Yaml yaml = new Yaml();
            TemplateConfig config = yaml.loadAs(input, TemplateConfig.class);

            config.getTemplates().forEach(t -> {
                processTemplate(t);
                templateCache.put(t.getType(), t);
            });
        } catch (Exception e) {
            LOG.error("Failed to load template config", e);
        }

    }

    private void processTemplate(TemplateMeta template) {
        // 处理嵌套模板
        if (template.getSubTemplates() != null) {
            template.getSubTemplates().forEach(this::processTemplate);
        }

        // 路径校验逻辑
        if (!template.getTemplatePath().startsWith("/newTemplates/")) {
            throw new IllegalStateException("Invalid template path: " + template.getTemplatePath());
        }
    }

    public TemplateMeta getTemplate(String type) {
        return templateCache.get(type);
    }
}

// 支持YAML反序列化的包装类
@Data
class TemplateConfig {
    public List<TemplateMeta> templates;
}