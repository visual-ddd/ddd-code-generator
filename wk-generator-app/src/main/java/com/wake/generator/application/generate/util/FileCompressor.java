package com.wake.generator.application.generate.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 文件压缩工具
 *
 * @author xmfang
 */
public class FileCompressor {
    private FileCompressor() {
    }

    private static final int BUFFER_SIZE = 1024;

    public static void zipFile(String baseDir, String fileName) throws IOException {
        List<File> fileList = getSubFiles(new File(baseDir));
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(Paths.get(fileName)));

        ) {
            ZipEntry zipEntry;
            byte[] buf = new byte[BUFFER_SIZE];
            int readLen = 0;

            for (File file : fileList) {
                zipEntry = new ZipEntry(getAbsFileName(baseDir, file));
                BasicFileAttributes fileAttributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                zipEntry.setSize(fileAttributes.size());
                zipEntry.setTime(fileAttributes.lastModifiedTime().toMillis());
                zipOutputStream.putNextEntry(zipEntry);

                try (InputStream is = new BufferedInputStream(Files.newInputStream(file.toPath()))) {
                    while ((readLen = is.read(buf, 0, BUFFER_SIZE)) != -1) {
                        zipOutputStream.write(buf, 0, readLen);
                    }
                }
            }
        }
    }

    private static String getAbsFileName(String baseDir, File file) {
        File tempFile = file;
        File base = new File(baseDir);
        StringBuilder result = new StringBuilder(tempFile.getName());
        while (true) {
            tempFile = tempFile.getParentFile();
            if (tempFile == null || tempFile.equals(base)) {
                break;
            }
            result.insert(0, tempFile.getName() + "/");
        }
        return result.toString();
    }

    private static List<File> getSubFiles(File baseDir) {
        List<File> results = new ArrayList<>();
        File[] tempFiles = baseDir.listFiles();
        assert tempFiles != null;
        for (File file : tempFiles) {
            if (file.isFile()) {
                results.add(file);
            } else if (file.isDirectory()) {
                results.addAll(getSubFiles(file));
            }
        }
        return results;
    }
}
