package com.wake.generator.application.domain;

import lombok.Data;

/**
 * <p>Title: Global</p>
 * <p>Description: 全局配置</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 11:14
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

}
