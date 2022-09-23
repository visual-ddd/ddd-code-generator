package com.wd.paas.script;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 输入参数
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public class UserArgument {

    /**
     * 领域图谱
     */
    protected static String chartXmlPath = "./wd-generator-script/代码生成器-管理领域.drawio";
    protected static String outputPath = "./wd-generator-script/target";
    /**
     * 项目信息
     */
    protected static String projectName = "wd-generator-web";
    protected static String projectAuthor = "ZhuXueLiang";
    protected static String projectDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(
        new Date());
    protected static String group = "com.wd.paas.generator.web";
    /**
     * 领域信息
     */
    protected static String domainName = "codegen";
    protected static String description = "代码生成领域";
    protected static String domainAuthor = "GaoZhiYi, ZhuXueLiang";
    protected static String domainDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(
        new Date());
}