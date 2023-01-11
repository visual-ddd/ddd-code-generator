package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class EnumDsl implements Serializable {

    private String name;

    private String description;

    private String baseType;

    private List<EnumMember> memberList;

}
