package com.wd.paas.generator;

import com.wd.paas.generator.generate.ElementParser;
import com.wd.paas.generator.generate.Visitor;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.Collections;
import java.util.List;

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

    public CodeGenerateService() {
        this.elementParser = new ElementParser();
    }

    public CodeGenerateService(ElementNode elementNode) {
        this.elementParser = new ElementParser(Collections.singletonList(elementNode));
    }

    public CodeGenerateService(List<ElementNode> elementNodeList) {
        this.elementParser = new ElementParser(elementNodeList);
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

    public void addElement(ElementNode element) {
        elementParser.add(element);
    }

    public void removeElement(ElementNode element) {
        elementParser.remove(element);
    }
}
