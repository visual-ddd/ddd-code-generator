package com.wake.generator.infra.manage.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 规则
 *
 * @author ZhuXueLiang
 * @date 2022/7/18
 * @since 1.0
 */
@Data
public class RuleDO {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
