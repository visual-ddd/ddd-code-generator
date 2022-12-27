package com.wd.paas.generator.convert.project.domainchart.aggregation.cmd;

public class FormatUtil {

    static String formatPackage(String classPackage) {
        return classPackage;
    }

    static String formatClassName(String className, String classSuffix) {
        return String.format("%s%s", className, classSuffix);
    }
}