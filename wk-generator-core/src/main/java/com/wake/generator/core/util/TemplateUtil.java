package com.wake.generator.core.util;

import com.wake.generator.core.constant.TemplateConstant;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

/**
 * <p>Title: </p>
 * <p>Description: 模板操作工具类</p>
 *
 * @author : ZhuXueLiang
 * @date : 2022/2/23 11:57
 */
public class TemplateUtil {

    /**
     * 获取模板
     *
     * @return 模板配置
     */
    public static Set<String> getTemplates() {
        Set<String> templates = new HashSet<>();
        readTemplateFolder(templates, TemplateConstant.TEMPLATE_PRE_URL);
        return templates;
    }

    /**
     * 递归获取模板文件结构
     *
     * @param path 模板起始位置
     */
    private static void readTemplateFolder(Set<String> templates, String path) {
        // 获得指定文件对象
        File file = new File(path);
        // 获得该文件夹内的所有文件
        File[] files = file.listFiles();
        if (ArrayUtils.isEmpty(files)) {
            return;
        }
        assert files != null;
        for (File f : files) {
            String filePath = f.getPath();
            String fileName = f.getName();
            if (f.isDirectory()) {
                readTemplateFolder(templates, filePath);
            } else if (f.isFile() && isModelFile(fileName)) {
                // 保存模板位置信息
                // TODO: 判断是否去掉路径前缀

                templates.add(filePath.replace(TemplateConstant.TEMPLATE_PRE_URL, ""));
            }
        }
    }

    private static boolean isModelFile(String fileName) {
        int index = fileName.lastIndexOf(".");
        if (index < 0) {
            return false;
        }
        return ".vm".equals(fileName.substring(index));
    }
}
