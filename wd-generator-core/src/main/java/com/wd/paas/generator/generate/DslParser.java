package com.wd.paas.generator.generate;

import com.wd.paas.generator.generate.element.CompositeElement;
import com.wd.paas.generator.generate.element.Element;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

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

    public void accept(Visitor visitor) {
        elementList.forEach(element -> preorder(element, visitor));
    }

    /**
     * 访问element数据结构，并执行元素具体的访问方法。
     *
     * @param root    需要遍历的element节点
     * @param visitor 访问者
     */
    private static void preorder(Element root, Visitor visitor) {
        if (root == null) {
            return;
        }
        root.accept(visitor);
        if (root instanceof CompositeElement) {
            CompositeElement compositeElement = (CompositeElement) root;
            for (Element children : compositeElement.getElementList()) {
                preorder(children, visitor);
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
