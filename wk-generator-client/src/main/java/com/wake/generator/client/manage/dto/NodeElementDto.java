package com.wake.generator.client.manage.dto;

import com.wake.generator.client.manage.common.NodeElementTypeEnum;
import lombok.Data;

import java.util.List;

/**
 * 节点元素
 *
 * @author ZhuXueLiang
 * @date 2022/7/20
 * @since 1.0
 */
@Data
public class NodeElementDto {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
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
     * 参数列表
     */
    private List<FieldDto> fieldList;

    /**
     * 方法列表
     */
    private List<MethodDto> methodList;

    /**
     * 所属聚合
     */
    private Long aggregationId;

    /**
     * 所属节点
     */
    private Long nodeId;

}
