package com.wd.paas.generator.newdsl.generate.visitor.element;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shimmer
 */
public abstract class CompositeElement extends Element {

    private final List<Element> elementList = new ArrayList<>();

    public void add(Element element) {
        this.elementList.add(element);
    }

    public void remove(Element element) {
        this.elementList.remove(element);
    }

    public List<Element> getElementList() {
        return elementList;
    }
}
