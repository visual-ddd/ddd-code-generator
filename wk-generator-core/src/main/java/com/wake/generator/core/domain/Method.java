package com.wake.generator.core.domain;

import java.util.List;
import lombok.Data;

/**
 * <p>Title: MethodDTO</p>
 * <p>Description: 方法信息</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/2/22 11:00
 */
@Data
public class Method {

    /**
     * 方法名称
     */
    private String name;

    /**
     * 修饰符
     */
    private String modifier;

    /**
     * 方法返回值类型
     */
    private String returnType;

    /**
     * 方法参数
     */
    private String attributeLabel;

    /**
     * 注释
     */
    private String description;

    /**
     * 注解列表
     */
    private List<String> annotations;

}
