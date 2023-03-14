package com.wd.paas.generator.common.util;

import org.apache.commons.collections.ExtendedProperties;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.resource.Resource;
import org.apache.velocity.runtime.resource.loader.ResourceLoader;

import java.io.InputStream;

public class PluginResourceLoader extends ResourceLoader {

    private final ClassLoader classLoader;

    public PluginResourceLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    /**
     * 得到一个资源输入流
     */
    @Override
    public InputStream getResourceStream(String name) throws ResourceNotFoundException {
        if (name == null || name.length() == 0) {
            throw new ResourceNotFoundException("Need to specify a template name!");
        }
        return classLoader.getResourceAsStream(name);
    }

    @Override
    public long getLastModified(Resource arg0) {
        return 0;
    }

    @Override
    public void init(ExtendedProperties arg0) {
        if (log.isTraceEnabled()) {
            log.trace("TestResourceLoader : initialization complete.");
        }
    }

    /**
     * 检查资源是否被修改
     */
    @Override
    public boolean isSourceModified(Resource arg0) {
        return false;
    }

}