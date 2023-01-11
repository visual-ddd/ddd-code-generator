package com.wd.paas.generator.newdsl.generate.visitor.objectstruct;

import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.Visitor;
import com.wd.paas.generator.newdsl.generate.visitor.element.CompositeElement;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shimmer
 */
@Slf4j
public class DslStruct {

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
