package com.wd.paas.generator.common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
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

    public static <T> T fromJson(Reader reader, Type type) {
        return getGson().fromJson(reader, type);
    }

    public static <T> String toJson(T t) {
        return getGson().toJson(t);
    }

}
