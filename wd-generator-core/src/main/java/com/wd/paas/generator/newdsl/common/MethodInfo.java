package com.wd.paas.generator.newdsl.common;

import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class MethodInfo {

    private String name;

    private String description;

    private List<SignatureInfo> signatureList;

    private String access;

    private Boolean isAbstract;

}
