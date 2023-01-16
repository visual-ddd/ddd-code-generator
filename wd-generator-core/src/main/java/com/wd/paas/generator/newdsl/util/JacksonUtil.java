package com.wd.paas.generator.newdsl.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JacksonUtil {
    public static ObjectMapper objectMapper;

    public JacksonUtil() {
    }

    public static ObjectMapper getObjectMapper() {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }

        return objectMapper;
    }

    public static <T> T readValue(String jsonStr, Class<T> valueType) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }

        try {
            return objectMapper.readValue(jsonStr, valueType);
        } catch (Exception var3) {
            return null;
        }
    }

    public static <T> T readValue(byte[] jsonBytes, Class<T> valueType) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }

        try {
            return objectMapper.readValue(jsonBytes, valueType);
        } catch (Exception var3) {
            return null;
        }
    }

    public static <T> T readValue(String jsonStr, TypeReference<T> valueTypeRef) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }

        try {
            return objectMapper.readValue(jsonStr, valueTypeRef);
        } catch (Exception var3) {
            return null;
        }
    }

    public static <T> T readValue(String jsonStr, Class<T> valueType, Class<?>... tClasses) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }

        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(valueType, tClasses);

        try {
            return objectMapper.readValue(jsonStr, javaType);
        } catch (Exception var5) {
            return null;
        }
    }

    public static <T> T readValue(String json, Type type) throws JsonProcessingException {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }

        TypeFactory typeFactory = objectMapper.getTypeFactory();
        JavaType javaType = typeFactory.constructType(type);
        return objectMapper.readValue(json, javaType);
    }

    public static String toJSon(Object object) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }

        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public static <T> T convertValue(Object object, Class<T> valueType) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }

        try {
            return objectMapper.convertValue(object, valueType);
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static <T> List<T> convertListToOtherList(List list, Class<?> parametrized) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }

        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, new Class[]{parametrized});
            return (List)objectMapper.readValue(toJSon(list), javaType);
        } catch (Exception var3) {
            var3.printStackTrace();
            return new ArrayList();
        }
    }
}