package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.Named;
import com.wd.paas.common.ObjectFieldMapper;
import com.wd.paas.common.ObjectReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 对象关系映射DSL
 *
 * @author Wangchensheng@wakedata.com
 * @date 2023年02月01日 12:52:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ObjectMapperDsl extends Named {

    /**
     * 原始对象
     */
    @SerializedName("source")
    private ObjectReference source;

    /**
     * 目标对象
     */
    @SerializedName("target")
    private ObjectReference target;

    /**
     * 定义 source 属性到 target 的映射规则
     */
    @SerializedName("mapper")
    private List<ObjectFieldMapper> convertList;

}
