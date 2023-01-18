package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.generate.element.ASTObjectMapperModel;
import org.apache.velocity.VelocityContext;

import java.util.List;

public class ObjectMapperModelStrategy extends AbstractElementStrategy{

    private final ASTObjectMapperModel astObjectMapperModel;

    public ObjectMapperModelStrategy(ASTObjectMapperModel astObjectMapperModel){
        this.astObjectMapperModel = astObjectMapperModel;
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
