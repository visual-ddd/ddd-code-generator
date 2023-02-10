package com.wd.paas.generator.generate.element;

import com.wd.paas.common.*;
import com.wd.paas.generator.common.constant.ModelUrlConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ASTDto extends LeafElement {

    private String identity;

    private String title;

    private String name;

    private String description;

    private MetaInfo meta;

    /**
     * 继承
     */
    private ClassInfo extendsClass;

    /**
     * 扩展的接口列表
     */
    private List<InterfaceInfo> interfaceList;

    /**
     * 抽象类，默认为false
     */
    private Boolean isAbstract;

    /**
     * 类实例属性
     */
    private List<PropertyInfo> propertyList;

    /**
     * 类实例方法, 支持方法重载
     */
    private List<MethodInfo> methodList;

    /**
     * 类静态属性
     */
    private List<PropertyInfo> classPropertyList;

    /**
     * 类实例方法, 支持方法重载
     */
    private List<MethodInfo> classMethodList;

    public String getOutputPath(String templateUrl, String preFixOutPath) {
        ASTQueryModel queryModel = (ASTQueryModel) this.getParentNode();
        ASTBusinessDomain astBusinessDomain = (ASTBusinessDomain) queryModel.getParentNode();

        String outputPath = astBusinessDomain.getOutputPath(templateUrl, preFixOutPath);
        String[] searchList = {
                ModelUrlConstant.QUERY_RESULT_CLASS
        };

        String[] replacementList = {
                name
        };

        return StringUtils.replaceEach(outputPath, searchList, replacementList);
    }
}
