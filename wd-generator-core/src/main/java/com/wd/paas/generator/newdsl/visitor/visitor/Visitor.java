package com.wd.paas.generator.newdsl.visitor.visitor;

import com.wd.paas.generator.newdsl.visitor.element.*;
import com.wd.paas.generator.newdsl.visitor.element.Enum;

/**
 * 访问者, 提供元素的操作方法
 *
 * @author shimmer
 */
public interface Visitor {

    /**
     * 访问应用
     *
     * @param application 应用
     */
    void visit(Application application);

    /**
     * 访问业务域
     *
     * @param businessDomain 业务域
     */
    void visit(BusinessDomain businessDomain);

    /**
     * 访问业务域场景
     *
     * @param businessScenario 业务域场景
     */
    void visit(BusinessScenario businessScenario);

    /**
     * 访问领域模型
     *
     * @param domainModel 领域模型
     */
    void visit(DomainModel domainModel);

    /**
     * 访问聚合
     *
     * @param aggregate 聚合
     */
    void visit(Aggregate aggregate);

    /**
     * 访问聚合根
     *
     * @param aggregateRoot 聚合根
     */
    void visit(AggregateRoot aggregateRoot);

    /**
     * 访问实体
     *
     * @param entity 实体
     */
    void visit(Entity entity);

    /**
     * 访问枚举
     *
     * @param anEnum 枚举
     */
    void visit(Enum anEnum);

    /**
     * 访问指令
     *
     * @param command 指令
     */
    void visit(Command command);

    /**
     * 访问值对象
     *
     * @param valueObject 值对象
     */
    void visit(ValueObject valueObject);

    /**
     * 访问指令参数
     *
     * @param commandParameter 指令参数
     */
    void visit(CommandParameter commandParameter);

    /**
     * 访问事件
     *
     * @param event 事件
     */
    void visit(Event event);

}
