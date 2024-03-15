package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.GenerateOperationTypeEnum;
import com.wd.paas.generator.common.enums.ProjectTemplateType;
import lombok.Data;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipOutputStream;

/**
 * 配置模版生成上下文信息
 *
 * @author shimmer
 */
@Data
public class TemplateContext {

    /**
     * Velocity上下文
     */
    private Map<String, Object> context = new HashMap<>();
    /**
     * 输出文件路径集合
     */
    private Set<String> outputFileSet = new HashSet<>();
    /**
     * 输出文件路径前缀
     */
    private String preFixOutPath;
    /**
     * 压缩输出流（可选）
     */
    private ZipOutputStream zipOutputStream;

    /**
     * 生成配置选项
     */
    private Boolean isGenerateProjectFrame = Boolean.TRUE;
    private ProjectTemplateType projectTemplateType = ProjectTemplateType.COLA;
    private GenerateOperationTypeEnum operationTypeEnum = GenerateOperationTypeEnum.INIT_CODE;
    private String authorName = "visual-ddd";
    private VelocityEngine velocityEngine;

    /**
     * 公共文件
     */
    private static Set<String> publicFiles;

    static {
        publicFiles = new HashSet<>();
        // domain
        publicFiles.add("BaseRepository.java");
        publicFiles.add("BaseJpaAggregate.java");
        publicFiles.add("BaseConvert.java");
        publicFiles.add("BaseJsonConvertor.java");
    }

    public TemplateContext() {
    }

    public TemplateContext(String preFixOutPath) {
        this();
        this.preFixOutPath = preFixOutPath;
    }

    public TemplateContext(ZipOutputStream zipOutputStream) {
        this();
        this.zipOutputStream = zipOutputStream;
    }

    /**
     * 初始化velocity上下文
     */
    public VelocityContext initTemplateContext() {
        VelocityContext velocityContext = new VelocityContext(context);
        velocityContext.put(VelocityLabel.DOMAIN_AUTHOR, authorName);
        return velocityContext;
    }

    /**
     * 添加输出文件路径
     *
     * @param outputFileUrl 输出文件路径
     * @return 是否添加成功
     */
    public boolean addOutputFileUrl(String outputFileUrl) {
        boolean success = outputFileSet.add(outputFileUrl);
        if (success) {
            return true;
        }
        String fileName = new File(outputFileUrl).getAbsoluteFile().getName();

        if (publicFiles.contains(fileName)) {
            return false;
        }
        throw new RuntimeException("文件已存在, 请检查文件名是否重复: " + outputFileUrl);
    }

    /**
     * 根据配置, 创建一个velocity引擎
     *
     * @return velocity引擎
     */
    public VelocityEngine newVelocityEngine() {
        if (velocityEngine != null) return velocityEngine;
        return defaultEngine();
    }

    /**
     * 默认为 Velocity 2.3 版本的引擎配置
     *
     * @return 兼容Velocity 2.3版本的引擎
     */
    private VelocityEngine defaultEngine() {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(RuntimeConstants.INPUT_ENCODING, "UTF-8");
        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        velocityEngine.init();
        this.velocityEngine = velocityEngine;
        return velocityEngine;
    }

}