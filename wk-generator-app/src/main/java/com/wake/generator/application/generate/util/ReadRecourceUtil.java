package com.wake.generator.application.generate.util;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * 读取recource目录下的配置文件工具类
 *
 * @author 佟蕊
 */
public class ReadRecourceUtil {

    /**
     * 获取资源文件字符串
     *
     * @param recourceFilePath 资源文件目录
     * @return InputStream 文件流
     * @throws IOException
     */
    public static String getResourceFileAsString(String recourceFilePath) throws IOException {
        InputStream is = getResourceFileAsInputStream(recourceFilePath);
        if (is != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            return (String) reader.lines().collect(Collectors.joining(System.lineSeparator()));
        } else {
            throw new RuntimeException("resource not found");
        }
    }

    /**
     * 获取资源文件流
     *
     * @param recourceFilePath 资源文件目录
     * @return InputStream 文件流
     * @throws IOException
     */
    public static InputStream getResourceFileAsInputStream(String recourceFilePath) throws IOException {
        Resource resource = new ClassPathResource(recourceFilePath);
        return resource.getInputStream();
    }

}
