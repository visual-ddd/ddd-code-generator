package com.wd.paas.script;

import lombok.Getter;

/**
 * 离开状态码
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Getter
public enum ExitStatus {

    /**/
    SYSTEM_EXCEPT(101, "系统异常!"),
    ARGUMENT_EXCEPTION(102, "参数异常!"),
    ;

    private final int value;
    private final String desc;

    ExitStatus(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
