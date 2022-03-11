package com.wake.generator.application.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * @description: 加载配置文件
 * @date: 2022/1/13 14:15
 * @author: ZhuXueLiang
 */
public class PropertiesConfig {

    private PropertiesConfig() { }

    private static final Map<String, Object> propertiesMap = new HashMap<>();

    static {
        initProperties();
    }

    /**
     * 自动加载配置文件，并转为map集合
     */
    private static void initProperties() {
        Properties properties = new Properties();
        InputStream resourceAsStream = PropertiesConfig.class.getResourceAsStream("/generator.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Entry<Object, Object> entry : properties.entrySet()) {
            propertiesMap.put((String) entry.getKey(), entry.getValue());
        }
    }

    /**
     * 获取配置map
     *
     * @return 配置map
     */
    public static Map<String, Object> getPropertiesMap() {
        return propertiesMap;
    }

}


