package com.wd.paas.generator.generate.element;

import com.google.common.base.CaseFormat;
import com.wd.paas.common.DataIndexInfo;
import com.wd.paas.common.DataPropertyInfo;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月31日 15:25:55
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class DataObjectNode extends LeafElement {

    private String tableName;

    private List<DataPropertyInfo> dataPropertyList;

    private List<DataIndexInfo> dataIndexInfos;


    @Override
    public void initProperties() {
        super.initProperties();
        String oldName = this.getName();
        initClassName(oldName);
        initTableName(oldName);
    }

    private void initClassName(String oldName) {
        if (oldName.endsWith(ModelUrlConstant.DATA_CLASS_SUFFIX)) {
            return;
        }
        this.setName(oldName.concat(ModelUrlConstant.DATA_CLASS_SUFFIX));
    }

    private void initTableName(String oldName) {
        if (tableName != null) {
            return;
        }
        String notDOName = oldName.endsWith(ModelUrlConstant.DATA_CLASS_SUFFIX) ? excludeDOSuffix() : oldName;
        tableName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, notDOName);
    }

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        BusinessDomainNode parentNode = (BusinessDomainNode) this.getParentNode();
        String outputPath = parentNode.getOutputPath(templateUrl, preFixOutPath);

        String[] searchList = {
                ModelUrlConstant.DATA_DO_CLASS,
                ModelUrlConstant.DATA_MAPPER_CLASS,
        };
        String[] replacementList = {
                this.getName(),
                this.excludeDOSuffix()
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    public String excludeDOSuffix() {
        String name = this.getName();
        return name.substring(0, name.lastIndexOf(ModelUrlConstant.DATA_CLASS_SUFFIX));
    }

    public String getPrimaryKey() {
        String primaryKey = null;
        for (DataIndexInfo dataIndexInfo : dataIndexInfos) {
            if (Objects.equals(dataIndexInfo.getIndexTypeEnum(), "Primary")) {
                primaryKey = dataIndexInfo.getProperties().get(0);
            }
        }
        return primaryKey;
    }
}
