package com.wd.paas.generator.generate.generator;

import lombok.Data;

/**
 * DDD项目生成信息
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/8/26
 */
@Data
public class ProjectInfo {

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目作者
     */
    private String author;

    /**
     * 项目生成时间
     */
    private String dateTime;

    /**
     * 项目全包名
     */
    private String group;

}
