package com.wd.paas.generate2;

import lombok.Getter;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class DSLModel {

    @Getter
    private final String id;
    private final Map<String, DslElement> elementRegistry = new ConcurrentHashMap<>();
    private volatile boolean frozen = false; // 模型冻结状态标识

    public DSLModel(String id) {
        this.id = Objects.requireNonNull(id, "Model ID cannot be null");
    }

    /**
     * 添加元素到模型（线程安全）
     */
    public synchronized void addElement(DslElement element) {
        checkFrozenState();
        validateElement(element);
        
        String elementId = element.getId();
        if (elementRegistry.containsKey(elementId)) {
            throw new ModelException("Element ID冲突: " + elementId);
        }
        elementRegistry.put(elementId, element);
    }

    /**
     * 根据ID获取元素（快速无锁读取）
     */
    public Optional<DslElement> getElementById(String elementId) {
        Objects.requireNonNull(elementId, "Element ID cannot be null");
        return Optional.ofNullable(elementRegistry.get(elementId));
    }

    /**
     * 带异常抛出的版本
     */
    public DslElement getElementByIdOrThrow(String elementId) {
        return getElementById(elementId)
                .orElseThrow(() -> new ModelException("Element not found: " + elementId));
    }

    /**
     * 冻结模型（禁止修改）
     */
    public void freeze() {
        this.frozen = true;
    }

    //-- 私有方法 --//
    private void validateElement(DslElement element) {
        if (element == null) {
            throw new ModelException("Cannot add null element");
        }
        if (element.getId() == null) {
            throw new ModelException("Element must have non-null ID");
        }
    }

    private void checkFrozenState() {
        if (frozen) {
            throw new ModelException("Model is frozen, modifications are prohibited");
        }
    }
}

/**
 * 模型专用异常
 */
class ModelException extends RuntimeException {
    public ModelException(String message) {
        super(message);
    }
}
