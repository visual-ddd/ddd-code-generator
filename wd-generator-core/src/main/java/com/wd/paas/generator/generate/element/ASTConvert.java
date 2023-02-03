package com.wd.paas.generator.generate.element;

import com.wd.paas.common.MapperInfo;
import com.wd.paas.generator.generate.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ASTConvert extends LeafElement{

    private String name;

    private String description;

    private String source;

    private String target;

    private List<MapperInfo> mapperList;

    @Override
    public void accept(Visitor visitor) {
        visitor.generate(this);
    }
}
