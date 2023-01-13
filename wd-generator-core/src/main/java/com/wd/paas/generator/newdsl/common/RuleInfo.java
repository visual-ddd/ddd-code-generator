package com.wd.paas.generator.newdsl.common;

import lombok.Builder;
import lombok.Data;

/***
 * @author wangchensheng
 */
@Data
@Builder
public class RuleInfo {

    private String name;

    private String description;

}
