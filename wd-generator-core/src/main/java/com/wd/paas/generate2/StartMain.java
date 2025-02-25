package com.wd.paas.generate2;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class StartMain {

    public static void main(String[] args) {
        TemplateLoader templateLoader = new TemplateLoader();
        templateLoader.loadTemplates("newTemplates/template-config.yml");
        CodeGenerator codeGenerator = new CodeGenerator(templateLoader, new VariableResolver());

        DslElement element = new DslElement();
        element.setId(UUID.randomUUID().toString());
        element.setType("AGGREGATE");
        element.setName("Member");
        element.setParent(null);
        element.setRootPackage("com.wd.paas.domain");
        Map<Object, Object> filedMap = new HashMap<>();
        filedMap.put("type", "Long");
        filedMap.put("name", "id");
        HashMap<String, Object> variables = new HashMap<>();
        variables.put("package", "com.wd.paas.domain");
        variables.put("className", "Member");
        variables.put("fields", Collections.singletonList(filedMap));
        element.setVariables(variables);
        element.setChildren(Lists.newArrayList());
        element.setReferences(Lists.newArrayList());
        element.setModel(new DSLModel("model-1"));
        codeGenerator.generate(element);
    }

}
