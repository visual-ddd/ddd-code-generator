package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class MethodDsl implements Serializable {

    private String name;

    private String description;

    private List<SignatureDsl> signatureList;

    private String access;

    private Boolean isAbstract;

}
