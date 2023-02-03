package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.Info;
import com.wd.paas.common.PropertyInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 领域事件DSL
 *
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DomainEventDsl extends Info {

    /**
     * 拓展属性，除指令属性外事件需要添加的属性
     */
    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

}
