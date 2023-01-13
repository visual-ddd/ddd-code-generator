package com.wd.paas.generator.newdsl.common;

import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import lombok.Data;

/***
 * @author wangchensheng
 */
@Data
public class EnumMemberInfo {

    private String name;

    private String description;

    private Integer code;

}
