package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.google.common.base.CaseFormat;
import com.wd.paas.common.DataIndexInfo;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import com.wd.paas.generator.common.constant.VelocityLabel;
import com.wd.paas.generator.common.enums.AbstractElementMapping;
import com.wd.paas.generator.common.enums.ProjectTemplateType;
import com.wd.paas.generator.common.util.TypeConvertor;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.DataObjectNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月31日 10:26:28
 * describe 数据模对象处理器
 */
public class DataObjectStrategy extends AbstractElementStrategy {

    private final DataObjectNode dataObject;

    public DataObjectStrategy(DataObjectNode astDataObject) {
        super(astDataObject);
        this.dataObject = astDataObject;
    }

    @Override
    public void initProperties() {
        super.initProperties();
        dataObject.setPrimaryKey(getPrimaryKey());
        initClassName(dataObject.getName());
        initTableName();
        dataObject.setDataObjectMapperName(dataObject.getDataObjectNoSuffixName().concat(ModelUrlConstant.DATA_MAPPER_CLASS_SUFFIX));
        dataObject.getDataPropertyList().forEach(dataPropertyInfo ->
                dataPropertyInfo.setDataType(TypeConvertor.convertFileType(dataPropertyInfo.getDataType())));
    }

    @Override
    public Set<String> getTemplatePathList(AbstractElementMapping projectTemplateType) {
        return new HashSet<>(Arrays.asList(projectTemplateType.dataModel()));
    }

    @Override
    public void putVelocityContext(VelocityContext context) {
        context.put(VelocityLabel.DATA_OBJECT_ID, dataObject.getIdentity());
        context.put(VelocityLabel.DATA_OBJECT_CLASS_NAME, dataObject.getName());
        context.put(VelocityLabel.DATA_OBJECT_CLASS_DESCRIPTION, dataObject.getDescription());
        context.put(VelocityLabel.DATA_OBJECT_CLASS_TITLE, dataObject.getTitle());
        context.put(VelocityLabel.DATA_OBJECT_CLASS_FIELDS, dataObject.getDataPropertyList());
        context.put(VelocityLabel.DATA_OBJECT_CLASS_PRIMARY_KEY, dataObject.getPrimaryKey());
        context.put(VelocityLabel.DATA_TABLE_NAME, dataObject.getTableName());
        context.put(VelocityLabel.DATA_MAPPER_CLASS_NAME, dataObject.getDataObjectMapperName());
    }

    @Override
    public String parseOutputPath(String templateUrl, String preFixOutPath, ProjectTemplateType projectTemplateType) {
        BusinessDomainNode parentNode = (BusinessDomainNode) dataObject.getParentNode();
        BusinessDomainStrategy businessDomainStrategy = new BusinessDomainStrategy(parentNode);
        String outputPath = businessDomainStrategy.parseOutputPath(templateUrl, preFixOutPath, projectTemplateType);

        String[] searchList = {
                ModelUrlConstant.DATA_DO_CLASS,
                ModelUrlConstant.DATA_MAPPER_CLASS,
        };
        String[] replacementList = {
                dataObject.getName(),
                dataObject.getDataObjectNoSuffixName()
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }

    public String getPrimaryKey() {
        String primaryKey = null;
        for (DataIndexInfo dataIndexInfo : dataObject.getDataIndexInfos()) {
            if (Objects.equals(dataIndexInfo.getIndexTypeEnum(), "Primary")) {
                primaryKey = dataIndexInfo.getProperties().get(0);
            }
        }
        return primaryKey;
    }

    private void initClassName(String oldName) {
        if (oldName.endsWith(ModelUrlConstant.DATA_CLASS_SUFFIX)) {
            dataObject.setName(oldName);
            dataObject.setDataObjectNoSuffixName(oldName.substring(0, oldName.lastIndexOf(ModelUrlConstant.DATA_CLASS_SUFFIX)));
        } else {
            dataObject.setName(oldName.concat(ModelUrlConstant.DATA_CLASS_SUFFIX));
            dataObject.setDataObjectNoSuffixName(oldName);
        }
    }

    private void initTableName() {
        if (dataObject.getTableName() != null) {
            return;
        }
        String notDOName = dataObject.getDataObjectNoSuffixName();
        dataObject.setTableName(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, notDOName));
    }

}
