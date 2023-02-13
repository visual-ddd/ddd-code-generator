package com.wd.paas.generator.generate.element;

import com.google.common.base.CaseFormat;
import com.wd.paas.common.DataIndexInfo;
import com.wd.paas.common.DataPropertyInfo;
import com.wd.paas.common.MetaInfo;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.context.ThreadContextHelper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月31日 15:25:55
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class DataObjectNode extends LeafElement {

    private String identity;

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    private String tableName;

    private List<DataPropertyInfo> dataPropertyList;

    private List<DataIndexInfo> dataIndexInfos;


    public void initProperties() {
        String originalName = name;
        name = originalName.concat(ModelUrlConstant.DATA_CLASS_SUFFIX);
        tableName = Optional.ofNullable(tableName).orElse(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, originalName));
    }

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        BusinessDomainNode parentNode = (BusinessDomainNode) this.getParentNode();
        String outputPath = parentNode.getOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.DATA_DO_CLASS,
                ModelUrlConstant.DATA_MAPPER_CLASS,
        };
        String[] replacementList = {
                name,
                ThreadContextHelper.obtainObjectMapper(ThreadContextHelper.ENTITY, name),
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
