package com.wd.paas.generator.convert.project.domainchart.aggregation.cmd;

import com.google.common.base.CaseFormat;

public class FormatUtil {

    static String formatPackage(String classPackage) {
        return classPackage;
    }

    static String formatClassName(String className, String classSuffix) {
        String upperName = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, className);
        return String.format("%s%s", upperName, classSuffix);
    }
}