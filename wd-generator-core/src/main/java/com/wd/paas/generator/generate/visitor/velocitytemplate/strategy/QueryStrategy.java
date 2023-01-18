package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.generate.element.ASTQuery;
import org.apache.velocity.VelocityContext;

import java.util.List;

public class QueryStrategy extends AbstractElementStrategy {

    private ASTQuery query;

    public QueryStrategy(ASTQuery element) {
        this.query = element;
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
        return null;
    }
}
