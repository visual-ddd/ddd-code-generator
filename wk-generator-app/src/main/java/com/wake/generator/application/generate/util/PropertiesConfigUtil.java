package com.wake.generator.application.generate.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * 实现对配置文件中数据的缓存和访问。
 *
 * @author : ZhuXueLiang
 * @date : 2022/3/24 17:13
 * @since : 1.0
 */
public class PropertiesConfigUtil {

    /**
     * 配置文件路径
     */
    private static final String RESOURCE_URL = "/generator.properties";

    /**
     * 用于缓存配置文件的 key 和 value
     */
    private static final Map<String, Object> PROPERTIES_MAP = new HashMap<>();

    /**
     * 禁止创建实例
     */
    private PropertiesConfigUtil() {
    }

    static {
        // 静态初始化 配置映射表PROPERTIES_MAP
        initProperties();
    }

    /**
     * 加载配置文件，并转为map集合
     */
    private static void initProperties() {
        Properties properties = new Properties();
        InputStream resourceAsStream = PropertiesConfigUtil.class.getResourceAsStream(RESOURCE_URL);
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Entry<Object, Object> entry : properties.entrySet()) {
            PROPERTIES_MAP.put((String) entry.getKey(), entry.getValue());
        }
    }

    /**
     * 获取配置map
     *
     * @return 配置map
     */
    public static Map<String, Object> getPropertiesMap() {
        return PROPERTIES_MAP;
    }

}


