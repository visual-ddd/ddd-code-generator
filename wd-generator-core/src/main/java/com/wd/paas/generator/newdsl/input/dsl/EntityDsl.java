package com.wd.paas.generator.newdsl.input.dsl;

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

    private String name;

    private String description;

    private Boolean isAbstract;

    private PropertyInfo id;

    private List<PropertyInfo> propertyList;

    private List<MethodInfo> methodInfoList;

    @Override
    public Entity build(){
        return EntityDslConvert.INSTANCE.dto2Do(this);
    }
}
