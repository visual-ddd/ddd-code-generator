package com.wd.paas.generator.generate.element;

import com.wd.paas.common.PropertyInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 业务场景接口结构化对象节点
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessDTONode extends LeafElement {

    private List<PropertyInfo> propertyList;

    private String dtoNoSuffixName;
}
