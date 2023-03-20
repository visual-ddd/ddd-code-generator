package com.wd.paas.generator;

import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.common.util.GsonUtil;
import com.wd.paas.generator.generate.ElementParser;
import com.wd.paas.generator.generate.Visitor;
import com.wd.paas.generator.generate.element.ApplicationNode;

import java.util.Collections;

/**
 * 代码生成服务入口
 *
 * @author shimmer
 */
public class CodeGenerateService {

    /**
     * 元素解析器
     */
    private final ElementParser elementParser;

    public CodeGenerateService(String applicationDSLJson) {
        ApplicationDsl applicationDsl = GsonUtil.fromJson(applicationDSLJson, ApplicationDsl.class);
        ApplicationNode applicationNode = ApplicationBuilder.build(applicationDsl);
        this.elementParser = new ElementParser(Collections.singletonList(applicationNode));
    }

    public CodeGenerateService(ApplicationDsl applicationDsl) {
        ApplicationNode applicationNode = ApplicationBuilder.build(applicationDsl);
        this.elementParser = new ElementParser(Collections.singletonList(applicationNode));
    }

    public CodeGenerateService(ApplicationNode applicationNode) {
        this.elementParser = new ElementParser(Collections.singletonList(applicationNode));
    }

    /**
     * 启动方法，控制访问者方法执行顺序
     *
     * @param visitor 访问者实例
     */
    public void run(Visitor visitor) {
        elementParser.accept(visitor::preHandle);
        elementParser.accept(visitor::generate);
        visitor.globalAfterHandle();
    }
}
