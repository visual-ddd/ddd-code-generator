package com.wake.generator.application.generate.entity;

import java.util.Set;
import lombok.Data;

/**
 * 项目图谱实体类
 *
 * @author ZhuXueLiang
 * @date 2022/3/25 11:47
 * @since 1.0
 */
@Data
public class DomainChart {

    /**
     * 全局配置
     */
    private Global global;

    /**
     * 元素列表
     */
    private Set<DomainShape> domainShapeList;

}
