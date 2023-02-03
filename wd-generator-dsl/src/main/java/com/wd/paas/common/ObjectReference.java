package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 对象关系映射
 *
 * @author Wangchensheng@wakedata.com
 * @date 2023年02月02日 10:34:56
 */
@Data
public class ObjectReference {

    /**
     * 对象名称
     */
    @SerializedName("name")
    private String name;

    /**
     * 所属聚合名称
     */
    @SerializedName("parent")
    private String parent;

    /**
     * 对象类型
     */
    @SerializedName("type")
    private String type;
}
