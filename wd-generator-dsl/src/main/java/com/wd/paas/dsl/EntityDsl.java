package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.ClassInfo;
import com.wd.paas.common.PropertyInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;


/***
 * 实体DSL
 * 描述实体信息
 *
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EntityDsl extends ClassInfo {

    /**
     * 主键, 实体的唯一标识
     */
    @SerializedName("id")
    private PropertyInfo id;
}
