package com.wd.paas.generator.generate.element;

import com.wd.paas.common.*;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class QueryNode extends LeafElement {

    private String identity;

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    private List<SourceInfo> querySourceList;

    /**
     * 查询的参数实体
     */
    private List<PropertyInfo> propertyList;

    /**
     * 分页返回
     */
    private Boolean pagination;

    /**
     * 执行器, 默认为 ·查询名称 + Exe· 连接起来的类， 有固定的实现逻辑
     */
    private ClassInfo handler;

    /**
     * 规则
     */
    private List<RuleInfo> ruleList;

    /**
     * 查询返回值
     */
    private ReturnInfo returnInfo;

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        QueryModelNode queryModel = (QueryModelNode)this.getParentNode();
        BusinessDomainNode astBusinessDomain = (BusinessDomainNode) queryModel.getParentNode();

        String outputPath = astBusinessDomain.getOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                ModelUrlConstant.QUERY_CLASS,
        };
        String[] replacementList = {
                name,
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
