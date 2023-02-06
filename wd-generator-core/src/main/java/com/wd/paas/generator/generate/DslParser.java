package com.wd.paas.generator.generate;

import com.wd.paas.generator.generate.element.CompositeElement;
import com.wd.paas.generator.generate.element.Element;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * DSL树解析器
 * <p>
 * 用于遍历元素数据结构，并调用对应的访问方法
 *
 * @author shimmer
 */
@Slf4j
public class DslParser {

    private final List<Element> elementList = new ArrayList<>();

    /**
     * 启动方法，控制执行顺序
     *
     * @param visitor 访问者实例
     */
    public void run(Visitor visitor) {
        // 预处理
        this.accept(visitor::preHandle);
        this.accept(visitor::generate);
    }

    public void accept(Consumer<Element> consumer) {
        elementList.forEach(element -> preorder(element, consumer));
    }

    /**
     * 访问element数据结构，并调用元素具体的访问方法。
     *
     * @param root 需要遍历的element节点
     */
    private static void preorder(Element root, Consumer<Element> consumer) {
        if (root == null) {
            return;
        }
        consumer.accept(root);
        if (root instanceof CompositeElement) {
            CompositeElement compositeElement = (CompositeElement) root;
            for (Element children : compositeElement.getElementList()) {
                preorder(children, consumer);
            }
        }
    }

    public void add(Element element) {
        this.elementList.add(element);
    }

    public void remove(Element element) {
        this.elementList.remove(element);
    }
}
