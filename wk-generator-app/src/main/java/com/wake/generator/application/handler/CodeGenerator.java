package com.wake.generator.application.handler;

import com.wake.generator.application.domain.DomainElement;
import com.wake.generator.application.domain.Project;
import com.wake.generator.application.constant.TemplateConstant;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;

/**
 * <p>Title: CodeGenerator</p>
 * <p>Description: 通过Velocity模板引擎生成指定框架代码</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 11:05
 */
@Slf4j
public class CodeGenerator {

    /**
     * 文件列表
     */
    List<String> fileList = new ArrayList<>();

    /**
     * 代码生成器
     * <p>
     * 根据 data 中提供的标签 和 读取的模板文件 生成代码，支持多个模板输出
     * </p>
     */
    public void codeGenerate(Project project) {

        // 加载配置文件标签
        Map<String, Object> tags = new HashMap<>();

        // 初始化标签上下文
        VelocityContext velocityContext = initTemplateContext(tags);

        // 填充全局配置标签
        velocityContext.put("globalLabel", project.getGlobal());

        List<DomainElement> domainElementList = project.getDomainElementList();
        // 初始化
        initClassDTOList(domainElementList);
        for (DomainElement domainElement : domainElementList) {
            // 设置标签
            velocityContext.put("classLabel", domainElement);
            velocityContext.put("fieldLabels", domainElement.getFieldList());
            velocityContext.put("methodLabels", domainElement.getMethodList());

            // 文件结构及代码生成
            FileGenerator fileGenerator = new FileGenerator();
            List<String> files = fileGenerator.run(velocityContext, domainElement.getTemplateMap());
            fileList.addAll(files);
        }
    }

    /**
     * 配置velocity上下文
     *
     * @param templateMap 封装的模板数据
     */
    public VelocityContext initTemplateContext(Map<String, Object> templateMap) {
        // 设置velocity资源加载器
        Properties prop = new Properties();
        // 设置模板加载位置
        prop.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, TemplateConstant.TEMPLATE_PRE_URL);
        Velocity.init(prop);

        // 初始化配置
        //templateMap.put("globalLabel", new GlobalDTO());
        templateMap.put("datetime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return new VelocityContext(templateMap);
    }

    /**
     * 初始化类列表
     *
     * @param DomainElementList 需要生成的类列表
     */
    private void initClassDTOList(List<DomainElement> DomainElementList) {
        for (DomainElement DomainElement : DomainElementList) {
            String fullPath = DomainElement.getOutputDir();
            DomainElement.setPackagePath(ClassPackagePathParser.getPackagePath(fullPath));
        }
        ClassImportParser classImportParser = new ClassImportParser();
        classImportParser.run(DomainElementList);
    }

    /**
     * 保存文件列表
     */
    public void storeFileNames() {
        File file = new File("fileNameList.txt");
        try (FileWriter fw = new FileWriter(file)) {
            for (String s : fileList) {
                s = "" + s.replace("..", "");
                fw.write(s + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

