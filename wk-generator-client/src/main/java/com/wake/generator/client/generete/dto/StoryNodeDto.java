package com.wake.generator.client.generete.dto;

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
     * 名称
     */
    private String name;

    /**
     * 事件集合
     */
    private List<ActionDto> actions;

}
