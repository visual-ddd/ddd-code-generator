package com.wd.paas.generator.newdsl.input.util;

import com.wd.paas.generator.newdsl.util.GsonUtil;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 指定元素类型进行解析
 */
public class Dsl2JsonUtil {

    public static <T> T getDslElement(String path, Class<T> cls) throws IOException {
        String json = IOUtils.toString(Files.newInputStream(Paths.get(path)), StandardCharsets.UTF_8);
        T dslElemnt = GsonUtil.fromJson(json, cls);
        System.out.println(GsonUtil.toJson(dslElemnt));
        return dslElemnt;
    }
}