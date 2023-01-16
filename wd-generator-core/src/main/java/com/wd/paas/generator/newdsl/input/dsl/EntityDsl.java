package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.MethodInfo;
import com.wd.paas.generator.newdsl.common.PropertyInfo;
import com.wd.paas.generator.newdsl.generate.visitor.element.Entity;
import com.wd.paas.generator.newdsl.input.dsl.convert.EntityDslConvert;
import lombok.Data;

import java.util.List;


/***
 * @author wangchensheng
 */
@Data
public class EntityDsl implements ElementBuildable {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("isAbstract")
    private Boolean isAbstract;

    @SerializedName("id")
    private PropertyInfo id;

    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    @SerializedName("methodInfos")
    private List<MethodInfo> methodInfoList;

    @Override
    public Entity build(){
        return EntityDslConvert.INSTANCE.dto2Do(this);
    }
}
