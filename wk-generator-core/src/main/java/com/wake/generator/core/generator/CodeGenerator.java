package com.wake.generator.core.generator;


import com.wake.generator.core.constant.TemplateConstant;
import com.wake.generator.core.domain.Global;
import com.wake.generator.core.domain.Project;
import com.wake.generator.core.domain.file.AbstractGeneratorFile;
import com.wake.generator.core.domain.file.code.AbstractCodeFile;
import com.wake.generator.core.domain.file.code.ClassFile;
import com.wake.generator.core.domain.file.code.InterfaceFile;
import com.wake.generator.core.parser.ClassImportParser;
import com.wake.generator.core.parser.ClassPackagePathParser;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;

/**
 * <p>Title: CodeGenerator</p>
 * <p>Description: 通过Velocity模板引擎生成指定框架代码</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/1/12 16:36
 */
@Slf4j
public class CodeGenerator {

    /**
     * 文件列表
     */
    List<String> fileList = new ArrayList<>();

    /**
     * velocity上下文
     */
    VelocityContext velocityContext;

    /**
     * 代码生成器
     * <p>
     * 根据 data 中提供的标签 和 读取的模板文件 生成代码，支持多个模板输出
     * </p>
     */
    public void codeGenerate(Project project) {

        // 初始化标签上下文
        initTemplateContext();

        // 填充全局配置标签
        Global global = project.getGlobal();
        velocityContext.put("globalLabel", global);
        // 文件列表
        Set<AbstractGeneratorFile> generatorFiles = project.getGeneratorFiles();

        Set<AbstractCodeFile> codeFiles = new HashSet<>();
        for (AbstractGeneratorFile generatorFile : generatorFiles) {
            if (generatorFile instanceof AbstractCodeFile) {
                codeFiles.add((AbstractCodeFile) generatorFile);
            }
        }
        // 初始化代码文件
        initCodeFiles(codeFiles);

        for (AbstractCodeFile codeFile : codeFiles) {
            if (codeFile instanceof ClassFile) {
                ClassFile classFile = (ClassFile) codeFile;
                velocityContext.put("classFile", classFile);
            } else if (codeFile instanceof InterfaceFile) {
                InterfaceFile interfaceFile = (InterfaceFile) codeFile;
                velocityContext.put("interfaceFile", interfaceFile);
            }

            // 文件结构及代码生成
            FileGenerator fileGenerator = new FileGenerator();
            List<String> files = fileGenerator.run(velocityContext, codeFile.getTemplateMap());
            fileList.addAll(files);
        }
    }

    /**
     * 配置velocity上下文
     */
    public void initTemplateContext() {
        // 设置velocity资源加载器
        Properties prop = new Properties();
        // 设置模板加载位置
        prop.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, TemplateConstant.TEMPLATE_PRE_URL);
        Velocity.init(prop);
        this.velocityContext = new VelocityContext();
    }

    /**
     * 初始化类列表
     *
     * @param codeFiles 需要生成的文件列表
     */
    private void initCodeFiles(Set<AbstractCodeFile> codeFiles) {
        // 代码文件
        for (AbstractCodeFile codeFile : codeFiles) {
            String fullPath = codeFile.getOutputUrl();
            // 根据输出全路径解析包路径
            codeFile.setPackagePath(ClassPackagePathParser.parser(fullPath));
        }
        // 解析并设置导入列表
        ClassImportParser classImportParser = new ClassImportParser();
        classImportParser.parser(codeFiles);
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

