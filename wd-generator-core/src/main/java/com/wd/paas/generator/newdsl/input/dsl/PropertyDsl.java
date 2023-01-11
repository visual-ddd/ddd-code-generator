package com.wd.paas.generator.newdsl.input.dsl;

import lombok.Data;

import java.io.Serializable;

/***
 * @author wangchensheng
 */
@Data
public class PropertyDsl  implements Serializable {

    private String name;

    private String type;

    private String description;

}
