package com.wd.paas.generator.generate.element;

import com.wd.paas.common.MetaInfo;
import com.wd.paas.common.ObjectFieldMapper;
import com.wd.paas.common.ObjectReference;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.context.ThreadContextHelper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年02月01日 12:57:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ObjectMapperNode extends LeafElement {

    private ObjectReference source;

    private List<ObjectFieldMapper> convertList;

    private ObjectReference target;

    private String identity;

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        BusinessDomainNode businessDomain = (BusinessDomainNode) this.getParentNode();
        String outputPath = businessDomain.getOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.OBJECT_MAPPER_CONVERT_CLASS,
                ModelUrlConstant.OBJECT_MAPPER_REPOSITORY_CLASS,
                ModelUrlConstant.QUERY_RESULT_CONVERT_CLASS,
        };
        String[] replacementList = {
                name,
                ThreadContextHelper.obtainObjectMapper(ThreadContextHelper.ENTITY, target.getName()),
                name,
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
