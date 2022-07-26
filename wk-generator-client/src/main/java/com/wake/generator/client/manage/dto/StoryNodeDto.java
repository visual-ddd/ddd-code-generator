package com.wake.generator.client.manage.dto;

import lombok.Data;

import java.util.List;

/**
 * 故事节点
 *
 * @author ZhuXueLiang
 * @date 2022/7/18
 * @since 1.0
 */
@Data
public class StoryNodeDto {

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
     * 包名
     */
    private String packageName;

    /**
     * 节点元素集合
     */
    private List<NodeElementDto> nodeElements;

    /**
     * 规则集合
     */
    private List<RuleDto> rules;

}
