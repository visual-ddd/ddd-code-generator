package com.wd.paas.generator.newdsl.input.util;

import com.wd.paas.generator.util.GsonUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 指定元素类型进行解析
 */
public class Dsl2JsonUtil {

    public static <T> T getDslElement(String path, Class<T> cls) throws IOException {
        T dslElemnt = GsonUtil.fromJson(new FileReader(path), cls);
        System.out.println(GsonUtil.toJson(dslElemnt));
        return dslElemnt;
    }

    public static <T> T getDslElement(String path, Type type) throws FileNotFoundException {
        T dslElemnt = GsonUtil.fromJson(new FileReader(path), type);
        System.out.println(GsonUtil.toJson(dslElemnt));
        return dslElemnt;
    }
}