package com.wd.paas.generator.generate.element;

import com.wd.paas.common.MapperInfo;
import com.wd.paas.common.MetaInfo;
import com.wd.paas.common.ObjectReferenceInfo;
import com.wd.paas.generator.generate.Visitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年02月01日 12:57:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ASTObjectMapper extends LeafElement {

    private ObjectReferenceInfo source;

    private List<MapperInfo> convertList;

    private ObjectReferenceInfo target;

    private String identity;

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;


    @Override
    public void accept(Visitor visitor) {
        visitor.generate(this);
    }

}
