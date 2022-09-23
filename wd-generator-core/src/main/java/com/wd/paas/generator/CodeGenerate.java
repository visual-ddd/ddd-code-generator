package com.wd.paas.generator;

import com.wd.paas.generator.generate.GenerateContext;
import org.apache.velocity.VelocityContext;

/**
 * 可以进行代码生成
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/26
 */
public interface CodeGenerate {

    /**
     * 生成代码
     *
     * @param generateContext 生成上下文
     */
    void generate(GenerateContext generateContext);

    /**
     * 填充当前元素标签到上下文中,用于进行变量映射
     *
     * @param context velocity上下文
     */
    void putVelocityContext(VelocityContext context);

    /**
     * 获取生成模版列表
     *
     * @return 模版列表
     */
    String[] getElementTypeUrl();

    /**
     * 解析输出路径
     *
     * @param templateUrl 需要解析的模版路径
     * @param context     变量上下文
     * @param targetPath  目标路径
     * @return 输出路径
     */
    String parseOutputPath(String templateUrl, VelocityContext context, String targetPath);
}
