package com.wd.paas.generator.generate.element;

import com.wd.paas.common.MetaInfo;
import com.wd.paas.common.ObjectTableReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月31日 15:31:49
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class ASTDataObjectReference extends LeafElement {

    private String identity;

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    private String source;

    private List<ObjectTableReference> targets;

}
