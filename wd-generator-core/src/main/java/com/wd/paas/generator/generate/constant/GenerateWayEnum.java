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
public enum GenerateWayEnum {

    /**
     * 全局生成, 第一次构建代码
     */
    OVERALL(0, "全量生成"),

    /**
     * 局部生成, 更新局部代码
     */
    PART(1, "局部生成")
    ;

    private final Integer value;
    private final String desc;

     GenerateWayEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
