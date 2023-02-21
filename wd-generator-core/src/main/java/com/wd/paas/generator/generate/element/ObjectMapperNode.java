package com.wd.paas.generator.generate.element;

import com.wd.paas.common.ObjectFieldMapper;
import com.wd.paas.common.ObjectReference;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;

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


    @Override
    public void initProperties() {
        super.initProperties();
        if (Objects.equals(target.getType(), "dataObject") &&
                !target.getName().endsWith(ModelUrlConstant.DATA_CLASS_SUFFIX)) {
            target.setName(target.getName().concat(ModelUrlConstant.DATA_CLASS_SUFFIX));
        }
        if (Objects.equals(source.getType(), "dto") &&
                !source.getName().endsWith(ModelUrlConstant.QUERY_RESULT_SUFFIX)) {
            source.setName(source.getName().concat(ModelUrlConstant.QUERY_RESULT_SUFFIX));
        }
    }

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        BusinessDomainNode businessDomain = (BusinessDomainNode) this.getParentNode();
        String outputPath = businessDomain.getOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.OBJECT_MAPPER_CONVERT_CLASS,
                ModelUrlConstant.OBJECT_MAPPER_REPOSITORY_CLASS,
                ModelUrlConstant.QUERY_RESULT_CONVERT_CLASS,
        };
        String[] replacementList = {
                getEntity2DOConvertName(),
                source.getName(),
                getQueryResultConvertName(),
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    public String getEntity2DOConvertName() {
        if (!Objects.equals(source.getType(), "entity")) {
            return StringUtils.EMPTY;
        }
        return source.getName().concat("2").concat(target.getName()).concat("Convert");
    }

    public String getQueryResultConvertName() {
        if (!Objects.equals(source.getType(), "dto")) {
            return StringUtils.EMPTY;
        }
        return source.getName().concat("2").concat(target.getName()).concat("Convert");
    }

    public String excludeDOSuffix() {
        String name = target.getName();
        return name.substring(0, name.lastIndexOf(ModelUrlConstant.DATA_CLASS_SUFFIX));
    }
}
