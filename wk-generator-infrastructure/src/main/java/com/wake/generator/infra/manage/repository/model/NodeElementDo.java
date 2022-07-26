package com.wake.generator.infra.manage.repository.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wake.generator.client.manage.common.NodeElementTypeEnum;
import lombok.Data;

/**
 * 节点元素
 *
 * @author ZhuXueLiang
 * @date 2022/7/20
 * @since 1.0
 */
@Data
public class NodeElementDo {

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
     * 类型
     *
     * @see NodeElementTypeEnum
     */
    private NodeElementTypeEnum type;

    /**
     * 聚合颜色标识
     */
    private String color;

    /**
     * 描述
     */
    private String description;

    /**
     * 所属聚合
     */
    private Long aggregationId;

    /**
     * 所属节点
     */
    private Long nodeId;

}