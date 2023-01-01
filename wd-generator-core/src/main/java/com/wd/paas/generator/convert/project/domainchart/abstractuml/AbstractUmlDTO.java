package com.wd.paas.generator.convert.project.domainchart.abstractuml;

import com.google.common.base.CaseFormat;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlConstant;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlField;
import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lombok.Data;

/**
 * 类信息
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
@Data
public abstract class AbstractUmlDTO {

    /**
     * id
     */
    public String id;

    /**
     * 类名
     */
    public String className;

    /**
     * 包名
     */
    public String classPackage;

    /**
     * 类描述信息
     */
    public String description;

    /**
     * 转化为类结构
     *
     * @param fields
     * @param methods
     * @return
     */
    public UmlClass trans2UmlClass(List<UmlFieldDTO> fields, List<UmlMethodDTO> methods) {
        List<UmlField> fieldList = new ArrayList<>();
        for (UmlFieldDTO umlFieldDTO : fields) {
            if (belongCurrentClass(umlFieldDTO.getClassId())) {
                UmlField umlField = new UmlField();
                umlField.setName(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, umlFieldDTO.getName()));
                umlField.setType(umlFieldDTO.getType());
                umlField.setModifier(umlFieldDTO.getModifier());
                umlField.setDescription(umlFieldDTO.getDescription());
                fieldList.add(umlField);
            }
        }
        List<UmlMethod> umlMethods = new ArrayList<>();
        for (UmlMethodDTO umlMethodDTO : methods) {
            if (belongCurrentClass(umlMethodDTO.getClassId())) {
                UmlMethod umlMethod = new UmlMethod();
                umlMethod.setName(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, umlMethodDTO.getName()));
                umlMethod.setModifier(umlMethodDTO.getModifier());
                umlMethod.setReturnType(umlMethodDTO.getReturnType());
                umlMethod.setAttributeLabel(umlMethodDTO.getAttributeLabel());
                umlMethod.setDescription(umlMethodDTO.getDescription());
                umlMethods.add(umlMethod);
            }
        }
        UmlClass umlClass = new UmlClass();
        umlClass.setClassName(className);
        umlClass.setFieldList(fieldList);
        umlClass.setMethodList(umlMethods);
        umlClass.setClassPackage(classPackage);
        umlClass.setClassDesc(description);
        return umlClass;
    }

    /**
     * 转化为枚举类结构
     *
     * @return 枚举类结构
     */
    public UmlClass trans2EnumUmlClass(List<UmlConstantDTO> constantDTOList) {
        List<UmlConstant> umlConstants = new ArrayList<>();
        for (UmlConstantDTO umlConstantDTO : constantDTOList) {
            if (belongCurrentClass(umlConstantDTO.getClassId())) {
                UmlConstant umlConstant = new UmlConstant();
                umlConstant.setName(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, umlConstantDTO.getName()));
                umlConstant.setCode(umlConstantDTO.getCode());
                umlConstant.setDesc(umlConstantDTO.getDesc());
                umlConstant.setNote(umlConstantDTO.getNote());
                umlConstants.add(umlConstant);
            }
        }

        UmlClass umlClass = new UmlClass();
        umlClass.setClassName(className);
        umlClass.setConstantList(umlConstants);
        umlClass.setClassPackage(classPackage);
        umlClass.setClassDesc(description);
        return umlClass;
    }

    private boolean belongCurrentClass(String id) {
        return Objects.equals(this.id, id);
    }
}
