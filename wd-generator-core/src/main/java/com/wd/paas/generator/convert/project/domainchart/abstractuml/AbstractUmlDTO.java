package com.wd.paas.generator.convert.project.domainchart.abstractuml;

import com.wd.paas.generator.generate.generator.project.domainchart.abstractuml.UmlClass;
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
        String classId = this.id;
        List<UmlField> fieldList = new ArrayList<>();
        for (UmlFieldDTO umlFieldDTO : fields) {
            if (Objects.equals(classId, umlFieldDTO.getClassId())) {
                UmlField umlField = new UmlField();
                umlField.setName(umlFieldDTO.getName());
                umlField.setType(umlFieldDTO.getType());
                umlField.setModifier(umlFieldDTO.getModifier());
                umlField.setDescription(umlFieldDTO.getDescription());
                fieldList.add(umlField);
            }
        }
        List<UmlMethod> umlMethods = new ArrayList<>();
        for (UmlMethodDTO umlMethodDTO : methods) {
            if (Objects.equals(classId, umlMethodDTO.getClassId())) {
                UmlMethod umlMethod = new UmlMethod();
                umlMethod.setName(umlMethodDTO.getName());
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
}
