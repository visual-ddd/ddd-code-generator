package com.wd.paas.generator.generate.element;

import com.wd.paas.common.DataIndexInfo;
import com.wd.paas.common.DataPropertyInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

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

    private String primaryKey;

    private String dataObjectNoSuffixName;

    private String dataObjectMapperName;
}
