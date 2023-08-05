package com.wd.paas.generator.common.util;

import org.apache.commons.collections.ExtendedProperties;
import org.apache.commons.lang3.StringUtils;
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
     * Get a resource input stream
     *
     * @param resourceName the name of the resource
     * @return Optional of InputStream of the resource if found
     * @throws ResourceNotFoundException if the resource is not found
     */
    @Override
    public InputStream getResourceStream(String resourceName) throws ResourceNotFoundException {
        if (StringUtils.isEmpty(resourceName)) {
            log.error("Template name is not specified");
            throw new ResourceNotFoundException("Need to specify a template name!");
        }
        return classLoader.getResourceAsStream(resourceName);
    }

    @Override
    public long getLastModified(Resource resource) {
        return 0;
    }

    @Override
    public void init(ExtendedProperties properties) {
        if (log.isTraceEnabled()) {
            log.trace("TestResourceLoader : initialization complete.");
        }
    }

    /**
     * Checks if a resource has been modified
     *
     * @param resource the resource to check
     * @return false as resources cannot be modified in this implementation
     */
    @Override
    public boolean isSourceModified(Resource resource) {
        return false;
    }

}
