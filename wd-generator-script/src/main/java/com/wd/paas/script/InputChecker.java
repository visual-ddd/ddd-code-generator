package com.wd.paas.script;

import java.io.File;

/**
 * 校验用户输入
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public class InputChecker {

    /**
     * 校验非法输入路径
     *
     * @param chartXmlPath 领域图谱路径
     * @return 合法的路径
     */
    protected static String validInputPath(String chartXmlPath) {
        File chartXml = new File(chartXmlPath);
        if (!chartXml.exists()) {
            System.out.println("参数错误❌ :领域图谱文件不存在!");
            System.exit(ExitStatus.ARGUMENT_EXCEPTION.getValue());
        } else if (!chartXml.isFile()) {
            System.out.println("参数错误❌ :不是一个文件!!");
            System.exit(ExitStatus.ARGUMENT_EXCEPTION.getValue());
        }
        return chartXmlPath;
    }

}
