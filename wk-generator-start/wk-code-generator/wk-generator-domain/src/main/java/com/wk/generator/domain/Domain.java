package com.wk.generator.domain;

import java.util.List;

/**
 * 聚合类
 *
 * @author shimmer
 * @date 2022-03-10 at 15:56:13 SGT
 */
@Data
@Entity
public class Domain extends SuperClass implements interfaceClass2, interfaceClass1 {

    /**
     * 注解列表
     */
    @NotBlank
    @TableField
    private List<String> annotations;

    /**
     * 主方法
     */
    @Api
    @Method
    public static void main(String[] args) {
        // Do something...
    }

}
