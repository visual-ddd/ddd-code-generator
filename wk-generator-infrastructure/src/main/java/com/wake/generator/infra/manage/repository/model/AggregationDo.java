package com.wake.generator.infra.manage.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 聚合
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
@Data
@TableName("aggregation")
public class AggregationDo {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 聚合颜色标识
     */
    private String color;

    /**
     * 描述
     */
    private String description;

    /**
     * 领域图谱id
     */
    private Long chartId;

}
