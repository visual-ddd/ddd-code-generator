package com.wd.paas.generator.generate.visitor.velocitytemplate;

import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.generate.visitor.velocitytemplate.strategy.ElementStrategy;
import org.apache.velocity.VelocityContext;

import java.util.List;

/**
 * Velocity模版引擎生成接口
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public interface VelocityTemplateGenerate extends ElementStrategy {

    /**
     * 处理逻辑(处理各个元素的单独逻辑)
     *
     * @param templateContext 上下文信息
     * @return true/false
     */
    Boolean process(TemplateContext templateContext);

    /**
     * 获取生成需要的模版路径列表
     *
     * @return 模版路径列表
     */
    List<String> getTemplatePathList(AbstractElementMapping projectTemplateType);

    /**
     * 填充当前元素标签到上下文中,用于进行变量映射
     *
     * @param context velocity上下文
     */
    void putVelocityContext(VelocityContext context);

    /**
     * 解析输出路径
     *
     * @param templateUrl   需要解析的模版路径
     * @param preFixOutPath 目标路径
     * @return 输出路径
     */
    String parseOutputPath(String templateUrl, String preFixOutPath);
}
