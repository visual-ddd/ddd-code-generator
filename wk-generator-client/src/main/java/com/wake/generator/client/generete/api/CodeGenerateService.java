package com.wake.generator.client.generete.api;

import java.util.zip.ZipOutputStream;

/**
 * 代码生成器服务接口
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:35
 * @since 1.0
 */
public interface CodeGenerateService {

    /**
     * 生成对应的项目结构
     */
    void generateCodeByChartXml(Long chartId, ZipOutputStream zipOutputStream);

}
