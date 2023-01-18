package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.generate.element.ASTDto;
import org.apache.velocity.VelocityContext;

import java.util.List;

public class DTOStrategy extends AbstractElementStrategy {

    private ASTDto dto;

    public DTOStrategy(ASTDto element) {
        this.dto = element;
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
