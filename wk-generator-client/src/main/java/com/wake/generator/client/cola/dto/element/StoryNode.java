package com.wake.generator.client.cola.dto.element;

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
public class StoryNode {

    /**
     * 名称
     */
    private String name;

    /**
     * 包名
     */
    private String packageName;

    /**
     * 事件集合
     */
    private List<Domain> events;

    /**
     * 指令集合
     */
    private List<Domain> cmdList;

    /**
     * 规则集合
     */
    private List<Rule> rules;

}
