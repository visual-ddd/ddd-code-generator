package com.wd.paas.generator.generate.visitor.velocitytemplate.strategy;

import com.wd.paas.generator.generate.element.ASTDataObjectReference;
import org.apache.velocity.VelocityContext;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月31日 17:22:50
 * describe TODO
 */
public class DataObjectReferenceStrategy extends AbstractElementStrategy {

    private final ASTDataObjectReference astDataObjectReference;

    public DataObjectReferenceStrategy(ASTDataObjectReference astDataObjectReference) {
        this.astDataObjectReference = astDataObjectReference;
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
