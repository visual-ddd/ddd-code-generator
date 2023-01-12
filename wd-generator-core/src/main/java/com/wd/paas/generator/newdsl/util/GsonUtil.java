package com.wd.paas.generator.newdsl.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * @author shimmer
 */
public class GsonUtil {

    static GsonBuilder gsonBuilder;

    static {
        gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static Gson getGson() {
        return gsonBuilder.create();
    }

    public static <T> T fromJson(String json, Class<T> cls) {
        return getGson().fromJson(json, cls);
    }

    public static <T> String toJson(T t) {
        return getGson().toJson(t);
    }

    public static <T> T fromJson(String json, Type type) {
        return getGson().fromJson(json, type);
    }

}
