package com.wd.paas.generator.newdsl.dsl;

import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class SignatureDsl {

    private String description;

    private List<ParameterDsl> parameterList;

    private ReturnDsl returnDsl;
}
