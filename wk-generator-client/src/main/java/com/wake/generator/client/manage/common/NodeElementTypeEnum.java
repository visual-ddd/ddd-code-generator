package com.wake.generator.client.manage.common;

/**
 * 故事节点类型
 *
 * @author ZhuXueLiang
 * @date 2022/7/21
 * @since 1.0
 */
public enum NodeElementTypeEnum {

    /**
     * 指令
     */
    CMD(1, "指令"),

    /**
     * 事件
     */
    EVENT(2, "事件")
    ;

    private final int code;

    private final String name;

    NodeElementTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
