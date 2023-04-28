package com.wd.paas.generator.v2.util;

import java.io.File;
import java.io.IOException;

/**
 * 提供文件基本操作的工具类
 */
public class FileBaseUtil {

    // 增加文件
    public static boolean addFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    // 删除文件
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    // 修改文件名
    public static boolean renameFile(String filePath, String newName) {
        File file = new File(filePath);
        if (file.exists()) {
            String parentPath = file.getParent();
            File newFile = new File(parentPath + File.separator + newName);
            return file.renameTo(newFile);
        }
        return false;
    }

    // 移动文件
    public static boolean moveFile(String filePath, String newFilePath) {
        File file = new File(filePath);
        if (file.exists()) {
            File newFile = new File(newFilePath);
            if (!newFile.exists()) {
                newFile.mkdirs();
            }
            return file.renameTo(new File(newFilePath + File.separator + file.getName()));
        }
        return false;
    }
}