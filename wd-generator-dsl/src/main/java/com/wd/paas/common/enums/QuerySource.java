package com.wd.paas.common.enums;

import java.util.Optional;

/**
 * 查询触发源类型
 *
 * @author shimmer
 */
public enum QuerySource {

    HTTP(1, "http"),
    RPC(2, "rpc"),
    ;

    QuerySource(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    private final Integer code;
    private final String name;

    public Integer getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    /**
     * 根据code码获取枚举
     */
    public static Optional<QuerySource> of(Integer code) {
        for (QuerySource t : QuerySource.class.getEnumConstants()) {
            if (t.getCode().intValue() == code.intValue()) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

}