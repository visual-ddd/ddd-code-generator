package com.wake.generator.client.manage.dto;

import lombok.Data;

/**
 * 规则
 *
 * @author ZhuXueLiang
 * @date 2022/7/18
 * @since 1.0
 */
@Data
public class RuleDto {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 描述
     */
    private String description;

    /**
     * 聚合颜色标识
     */
    private String color;

    /**
     * 所属聚合
     */
    private Long aggregationId;

}
