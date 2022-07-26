package com.wake.generator.client.generete.dto;

import lombok.Data;

/**
 * 动作
 *
 * @author ZhuXueLiang
 * @date 2022/7/26
 * @since 1.0
 */
@Data
public class ActionDto {

    private static final long serialVersionUID = 1L;

    /**
     * 包名
     */
    private String packageName;

    /**
     * 指令
     */
    private DomainDto cmd;

    /**
     * 事件
     */
    private DomainDto event;

}
