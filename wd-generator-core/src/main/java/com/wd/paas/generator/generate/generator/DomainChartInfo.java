package com.wd.paas.generator.generate.generator;

import lombok.Data;

/**
 * DDD领域图谱生成信息
 *
 * @author ZhuXueLiang
 * @version 1.1
 * @date 2022/8/23
 */
@Data
public class DomainChartInfo {

    /**
     * 领域名
     */
    private String name;

    /**
     * 领域描述
     */
    private String description;

    /**
     * 领域作者
     */
    private String author;

    /**
     * 领域生成时间
     */
    private String dateTime;

}
