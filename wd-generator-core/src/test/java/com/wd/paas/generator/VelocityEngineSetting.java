package com.wd.paas.generator;

import com.wd.paas.generator.common.util.FileGenerator;
import com.wd.paas.generator.common.util.PluginResourceLoaderV2;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class VelocityEngineSetting {

    public static VelocityEngine getVelocityEngine() {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(RuntimeConstants.INPUT_ENCODING, "UTF-8");
//        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADERS, "plugin");
//        velocityEngine.setProperty("resource.loader.plugin.class", PluginResourceLoaderV2.class.getName());
//        velocityEngine.setProperty("resource.loader.plugin.instance", new PluginResourceLoaderV2(FileGenerator.class.getClassLoader()));
        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        velocityEngine.init();
        return velocityEngine;
    }

}
