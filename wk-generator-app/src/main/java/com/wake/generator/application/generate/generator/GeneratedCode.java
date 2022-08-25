package com.wake.generator.application.generate.generator;

import java.util.zip.ZipOutputStream;

/**
 * 定义代码生成接口
 *
 * @author ZhuXueLiang
 * @version v1.0
 * @date 2022/8/7
 */
public interface GeneratedCode {


    /**
     * 执行代码生成 将生成的代码输出到输出流
     *
     * @param zipOutputStream 压缩流
     */
    void run(ZipOutputStream zipOutputStream);

}
