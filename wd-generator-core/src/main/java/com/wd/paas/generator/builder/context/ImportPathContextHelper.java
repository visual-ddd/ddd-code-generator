package com.wd.paas.generator.builder.context;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImportPathContextHelper {

    /**
     * 将类名和包路径存储到线程上下文中
     *
     * @param path 解析后的包路径
     */
    public static void store(String path) {
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

}
