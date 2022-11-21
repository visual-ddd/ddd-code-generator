package com.wd.paas.generator.generate.constant;

import lombok.Getter;

/**
 * 代码生成方式
 *
 * @author ZhuXueLiang
 * @version 1.0
 * @date 2022/10/15 09:12
 */
@Getter
public enum CmdTypeEnum {

    /**/
    DEFAULT(0, "默认指令"),
    ADD(1, "创建指令"),
    UPDATE(2, "更新指令"),
    DELETE(3, "删除指令");

    private final Integer value;
    private final String desc;

    CmdTypeEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
