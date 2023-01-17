package com.wd.paas.generator.common;

import lombok.Data;

/***
 * @author wangchensheng
 */
@Data
public class MethodInfo {

    private String name;

    private String description;

    private SignatureInfo signature;

    private String access;

    private Boolean isAbstract;

}
