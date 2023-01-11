package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.io.Serializable;

/***
 * @author wangchensheng
 */
@Data
public class EnumMember implements Serializable {

    private String name;

    private String description;

    private Integer code;

}
