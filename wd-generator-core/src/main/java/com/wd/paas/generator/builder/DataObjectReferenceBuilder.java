package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DataObjectReferenceDsl;
import com.wd.paas.generator.builder.convert.DataObjectReferenceDslConvert;
import com.wd.paas.generator.generate.element.ASTDataObjectReference;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月31日 15:29:59
 */
public class DataObjectReferenceBuilder {
    static ASTDataObjectReference build(DataObjectReferenceDsl dataObjectReferenceDsl) {
        return DataObjectReferenceDslConvert.INSTANCE.dto2Do(dataObjectReferenceDsl);
    }
}
