package com.wake.generator.application.entity;

import java.util.List;
import lombok.Data;

/**
 * <p>Title: LabelDTO</p>
 * <p>Description: 项目信息</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/11 10:06
 */
@Data
public class ProjectChart {

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 全局配置
     */
    private Global global;

    /**
     * 元素信息列表
     */
    private List<DomainElement> domainElementList;

    /**
     * Uml图形信息json
     */
    private String umlShapeInfo;

    /**
     * 线条信息json
     */
    private String lineInfo;

}
