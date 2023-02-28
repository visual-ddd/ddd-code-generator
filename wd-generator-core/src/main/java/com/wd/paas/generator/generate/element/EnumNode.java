package com.wd.paas.generator.generate.element;


import com.wd.paas.common.EnumMemberInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EnumNode extends LeafElement {

    private String baseType;

    private List<EnumMemberInfo> memberList;
}
