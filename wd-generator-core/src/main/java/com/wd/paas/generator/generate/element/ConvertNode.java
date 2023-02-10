package com.wd.paas.generator.generate.element;

import com.wd.paas.common.ObjectFieldMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConvertNode extends LeafElement {

    private String name;

    private String description;

    private String source;

    private String target;

    private List<ObjectFieldMapper> mapperList;

}
