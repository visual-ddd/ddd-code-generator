package com.wd.paas.generator.generate.element;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 容器节点（父节点），包含子节点列表
 *
 * @author shimmer
 */
public abstract class CompositeElement extends ElementNode {

    private final List<ElementNode> childElementNodeList = new ArrayList<>();

    public void add(ElementNode node) {
        this.childElementNodeList.add(node);
    }

    public void addAll(List<ElementNode> nodeList) {
        this.childElementNodeList.addAll(nodeList);
    }

    public void remove(ElementNode node) {
        this.childElementNodeList.remove(node);
    }

    public List<ElementNode> getChildElementNodeList() {
        return childElementNodeList;
    }

    public <T> List<T> getChildElementList(Class<T> targetClass) {
        return childElementNodeList.stream()
                .filter(element -> Objects.equals(element.getClass(), targetClass))
                .map(element -> (T) element)
                .collect(Collectors.toList());
    }
}
