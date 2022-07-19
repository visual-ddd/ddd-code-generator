package com.wake.generator.client.cola.dto.test;

import lombok.Data;

/**
 * 事件
 *
 * @author ZhuXueLiang
 * @date 2022/7/18
 * @since 1.0
 */
@Data
public class Event extends Domain{

    /**
     * 所属聚合
     */
    private Aggregation parentAggregation;

}
