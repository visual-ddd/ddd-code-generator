package com.wake.generator.core.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>Title: ClassPackagePathParser</p>
 * <p>Description: 包路径提取工具</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/2/24 21:27
 */
@Slf4j
public class ClassPackagePathParser {

    private ClassPackagePathParser() {}

    private static final String REGULAR_EXPRESSION = ".*?\\\\src\\\\main\\\\java\\\\(.*)\\\\.*";

    /**
     * 从全路径中截取包路径
     *
     * @param fullPath 类全路径
     * @return 包路径
     */
    public static String parser(String fullPath) {
        Pattern pattern = Pattern.compile(REGULAR_EXPRESSION);
        Matcher matcher = pattern.matcher(fullPath);
        if (matcher.find()) {
            String path = matcher.group(1);
            log.info(path);
            return path.replace("\\", ".");
        }
        log.warn("packagePath pattern error！");
        return null;
    }

}
