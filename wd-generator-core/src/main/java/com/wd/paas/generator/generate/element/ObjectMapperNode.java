package com.wd.paas.generator.generate.element;

import com.wd.paas.common.ObjectFieldMapper;
import com.wd.paas.common.ObjectReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年02月01日 12:57:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ObjectMapperNode extends LeafElement {

    private ObjectReference source;

    private ObjectReference target;

    private List<ObjectFieldMapper> convertList;

    private String entity2DOConvertName;

    private String queryResultConvertName;

}
