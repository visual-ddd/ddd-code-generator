package com.wd.paas.generator.common.context;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreadContextHelper {

    private static final String PRE_OBJECT_MAPPER = "mapper::";

    /**
     * 将类名和包路径存储到线程上下文中
     *
     * @param path 解析后的包路径
     */
    public static void storePath(String path) {
        String pattern = "src/main/java/(.*)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(path);
        while (m.find()) {
            String classPackagePath = m.group(1);
            String className = classPackagePath.substring(classPackagePath.lastIndexOf("/") + 1,
                    classPackagePath.lastIndexOf("."));
            String packagePath = classPackagePath.substring(0, classPackagePath.lastIndexOf("/"))
                    .replace("/", ".");
            ThreadLocalUtil.set(className, packagePath);
        }
    }

    /**
     * 对象映射关系存储到线程上下文
     *
     * @param sourceClass 源头
     * @param targetClass 目标
     */
    public static void storeObjectMapper(String sourceClass, String targetClass){
        ThreadLocalUtil.set(PRE_OBJECT_MAPPER.concat(sourceClass), targetClass);
    }

    /**
     * 从线程上下文获取对象映射关系
     *
     * @param className 类名
     * @return 映射的类
     */
    public static String obtainObjectMapper(String className){
        return (String) ThreadLocalUtil.getThreadLocal().get(PRE_OBJECT_MAPPER.concat(className));
    }

}
