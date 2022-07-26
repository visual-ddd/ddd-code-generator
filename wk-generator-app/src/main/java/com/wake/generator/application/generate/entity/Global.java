package com.wake.generator.application.generate.entity;

import lombok.Data;

/**
 * 全局配置
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:41
 * @since 1.0
 */
@Data
public class Global {

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 作者
     */
    private String author;

    /**
     * 创建时间
     */
    private String dateTime;

    /**
     * 项目组包名
     */
    private String group;

    /**
     * 领域包名
     */
    private String filed;

}
