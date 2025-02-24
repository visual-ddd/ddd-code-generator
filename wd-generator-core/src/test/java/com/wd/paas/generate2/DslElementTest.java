package com.wd.paas.generate2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class DslElementTest {

    private DSLModel model;
    private DslElement parentElement;
    private DslElement childElement;
    private DslElement referenceElement;

    @BeforeEach
    void setUp() {
        model = new DSLModel("test-model");

        parentElement = DslElement.builder()
                .id("aggregate-1")
                .type("AGGREGATE")
                .name("OrderAggregate")
                .model(model)
                .build();
        model.addElement(parentElement);

        childElement = DslElement.builder()
                .id("entity-1")
                .type("ENTITY")
                .name("OrderItem")
                .parent(parentElement)
                .model(model)
                .build();
        model.addElement(childElement);

        referenceElement = DslElement.builder()
                .id("vo-1")
                .type("VALUE_OBJECT")
                .name("Money")
                .model(model)
                .build();
        model.addElement(referenceElement);
    }

    //-- 基础属性测试 --//
    @Test
    void should_hold_basic_properties() {
        assertThat(childElement.getId()).isEqualTo("entity-1");
        assertThat(childElement.getType()).isEqualTo("ENTITY");
        assertThat(childElement.getName()).isEqualTo("OrderItem");
        assertThat(childElement.getModel()).isEqualTo(model);
    }

    //-- 父子关系测试 --//
    @Test
    void should_maintain_parent_child_relationship() {
        // 验证子元素的父引用
        assertThat(childElement.getParent())
                .isEqualTo(parentElement)
                .extracting(DslElement::getId)
                .isEqualTo("aggregate-1");

        // 验证父元素未主动维护子列表（如需要可扩展）
        assertThat(parentElement.getChildren()).isNullOrEmpty();
    }

    //-- 引用关系测试 --//
    @Test
    void should_manage_references() {
        // 添加引用
        childElement.addReference(new DSLReference("VALUE_OBJECT", "vo-1"));

        // 验证引用存在性
        assertThat(childElement.getReferences())
                .hasSize(1)
                .first()
                .satisfies(ref -> {
                    assertThat(ref.getType()).isEqualTo("VALUE_OBJECT");
                    assertThat(ref.getRefId()).isEqualTo("vo-1");
                });

        // 验证引用元素解析
        DslElement resolvedRef = childElement.getModel().getElementByIdOrThrow("vo-1");
        assertThat(resolvedRef).isEqualTo(referenceElement);
    }

    //-- 模型归属测试 --//
    @Test
    void should_bind_to_model() {
        assertThat(childElement.getModel())
                .isEqualTo(model)
                .extracting(DSLModel::getId)
                .isEqualTo("test-model");
    }

    //-- 异常场景测试 --//
    @Test
    void should_throw_when_missing_required_fields() {
        // 缺失id的构建
        assertThatThrownBy(() -> DslElement.builder()
                .type("AGGREGATE")
                .build())
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("id is required");

        // 缺失type的构建
        assertThatThrownBy(() -> DslElement.builder()
                .id("test")
                .build())
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("type is required");
    }

    //-- 复杂引用链测试 --//
    @Test
    void should_handle_nested_references() {
        // 构建三层嵌套结构
        DslElement grandParent = DslElement.builder()
                .id("bounded-context-1")
                .type("BOUNDED_CONTEXT")
                .model(model)
                .build();

        parentElement.setParent(grandParent);
        childElement.addReference(new DSLReference("RULE", "rule-1"));

        // 验证跨层级引用
        assertThat(childElement)
                .extracting(e -> DependencyResolver.findDependencyElement(e, "BOUNDED_CONTEXT"))
                .isEqualTo(grandParent);
    }
}
