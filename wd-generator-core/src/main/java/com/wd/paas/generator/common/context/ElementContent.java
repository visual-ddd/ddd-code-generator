package com.wd.paas.generator.common.context;

import com.wd.paas.generator.generate.element.ElementNode;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ElementContent {

    private ElementNode elementNode;

    private Map<String, String> classPackageMap;

    public ElementContent(ElementNode elementNode) {
        this.elementNode = elementNode;
        this.classPackageMap = new HashMap<>();
    }

    public void put(String className, String classPackage) {
        this.classPackageMap.put(className, classPackage);
    }

    public String get(String className) {
        return classPackageMap.get(className);
    }
}
