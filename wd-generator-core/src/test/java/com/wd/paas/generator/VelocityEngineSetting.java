package com.wd.paas.generator;

import com.wd.paas.generator.common.util.FileGenerator;
import com.wd.paas.generator.common.util.PluginResourceLoader;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;

public class VelocityEngineSetting {

    public static VelocityEngine getVelocityEngine() {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(RuntimeConstants.INPUT_ENCODING, "UTF-8");
        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADERS, "plugin");
        velocityEngine.setProperty("resource.loader.plugin.class", PluginResourceLoader.class.getName());
        velocityEngine.setProperty("resource.loader.plugin.instance", new PluginResourceLoader(FileGenerator.class.getClassLoader()));
        velocityEngine.init();
        return velocityEngine;
    }

}
