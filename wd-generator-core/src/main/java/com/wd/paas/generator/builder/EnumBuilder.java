package com.wd.paas.generator.builder;

import com.wd.paas.common.EnumMemberInfo;
import com.wd.paas.dsl.EnumDsl;
import com.wd.paas.generator.builder.convert.EnumDslConvert;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.EnumNode;
import org.apache.commons.lang3.StringUtils;

public class EnumBuilder {
    public static EnumNode build(EnumDsl enumDsl, AggregateNode astAggregate) {
        initMemberDesc(enumDsl);
        EnumNode astEnum = EnumDslConvert.INSTANCE.dto2Do(enumDsl);
        astEnum.setParentNode(astAggregate);
        return astEnum;
    }

    private static void initMemberDesc(EnumDsl enumDsl) {
        for (EnumMemberInfo enumMemberInfo : enumDsl.getMemberList()) {
            if (StringUtils.isBlank(enumMemberInfo.getDescription())) {
                enumMemberInfo.setDescription(enumMemberInfo.getTitle());
            }
        }
    }
}