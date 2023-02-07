package com.wd.paas.generator.generate.element;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author shimmer
 */
public abstract class CompositeElement implements Element {

    private final List<Element> elementList = new ArrayList<>();

    public void add(Element element) {
        this.elementList.add(element);
    }

    public void addAll(List<Element> elementList) {
        this.elementList.addAll(elementList);
    }

    public void remove(Element element) {
        this.elementList.remove(element);
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public <T> List<T> getChildElementList(Class<T> targetClass) {
        return elementList.stream()
                .filter(element -> Objects.equals(element.getClass(), targetClass))
                .map(element -> (T) element)
                .collect(Collectors.toList());
    }
}
