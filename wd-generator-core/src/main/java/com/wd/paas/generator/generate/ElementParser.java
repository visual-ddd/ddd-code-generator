package com.wd.paas.generator.generate;

import com.wd.paas.generator.generate.element.CompositeElement;
import com.wd.paas.generator.generate.element.ElementNode;
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
public class ElementParser {

    private final List<ElementNode> elementNodes;

    public ElementParser() {
        this.elementNodes = new ArrayList<>();
    }

    public ElementParser(List<ElementNode> elementNodes) {
        this.elementNodes = elementNodes;
    }

    public void accept(Consumer<ElementNode> consumer) {
        elementNodes.forEach(element -> preorder(element, consumer));
    }

    /**
     * 访问element数据结构，并调用元素具体的访问方法。
     *
     * @param root 需要遍历的element节点
     */
    private static void preorder(ElementNode root, Consumer<ElementNode> consumer) {
        if (root == null) {
            return;
        }
        consumer.accept(root);
        if (root instanceof CompositeElement) {
            CompositeElement compositeElement = (CompositeElement) root;
            for (ElementNode children : compositeElement.getChildElementNodeList()) {
                preorder(children, consumer);
            }
        }
    }

    public void add(ElementNode element) {
        this.elementNodes.add(element);
    }

    public void remove(ElementNode element) {
        this.elementNodes.remove(element);
    }
}
