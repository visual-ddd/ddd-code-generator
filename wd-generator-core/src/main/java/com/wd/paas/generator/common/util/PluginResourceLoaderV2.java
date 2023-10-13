package com.wd.paas.generator.common.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.resource.Resource;
import org.apache.velocity.runtime.resource.loader.ResourceLoader;
import org.apache.velocity.util.ExtProperties;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/**
 * 插件资源加载器
 * 支持Velocity 2.3版本
 */
public class PluginResourceLoaderV2 extends ResourceLoader {

    private final ClassLoader classLoader;

    public PluginResourceLoaderV2(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public Reader getResourceReader(String source, String encoding) throws ResourceNotFoundException {
        if (StringUtils.isEmpty(source)) {
            throw new ResourceNotFoundException("Need to specify a template name!");
        }
        InputStream inputStream = classLoader.getResourceAsStream(source);
        if (inputStream == null) {
            throw new ResourceNotFoundException("Template not found: " + source);
        }
        try {
            return new InputStreamReader(inputStream, encoding);
        } catch (UnsupportedEncodingException e) {
            throw new ResourceNotFoundException("Unsupported encoding: " + encoding, e);
        }
    }

    @Override
    public long getLastModified(Resource resource) {
        return 0;
    }

    @Override
    public void init(ExtProperties configuration) {
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
