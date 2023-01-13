package com.wd.paas.generator.newdsl.common;

import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class SignatureInfo {

    private List<ParameterInfo> parameterList;

    private ReturnInfo returnInfo;
}
