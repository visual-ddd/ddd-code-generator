package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.generate.element.ASTQueryModel;
import org.apache.velocity.VelocityContext;

import java.util.List;

public class QueryModelStrategy extends AbstractElementStrategy {

    private ASTQueryModel queryModel;

    public QueryModelStrategy(ASTQueryModel element) {
        this.queryModel = element;
    }

    @Override
    public List<String> getTemplatePathList() {
        return null;
    }

    @Override
    public void putVelocityContext(VelocityContext context) {

    }

    @Override
    public String parseOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        return getOutputPath(templateUrl, context, preFixOutPath);
    }

    public static String getOutputPath(String templateUrl, VelocityContext context, String preFixOutPath) {
        return null;
    }
}
