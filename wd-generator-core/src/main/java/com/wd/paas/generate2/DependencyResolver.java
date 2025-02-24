package com.wd.paas.generate2;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Optional;

public class DependencyResolver {

    private static final Logger LOG = LoggerFactory.getLogger(DependencyResolver.class);

    /**
     * 查找依赖元素（支持多种关联策略）
     *
     * @param current 当前元素上下文
     * @param depType 依赖的元素类型
     * @return 找到的依赖元素（找不到时抛出异常）
     */
    public static DslElement findDependencyElement(DslElement current, String depType) {
        // 策略优先级：显式引用 > 父元素 > 同级命名约定 > 全局查找
        DslElement element = resolveDependency(current, depType);
        LOG.debug("Found {} dependency for {}: {}", depType, current.getId(), element.getId());
        return element;
    }

    private static DslElement resolveDependency(DslElement current, String depType) {
    return tryFindByExplicitRef(current, depType)
            .orElseGet(() -> tryFindByParent(current, depType)
//                    .orElseGet(() -> tryFindByNamingConvention(current, depType)
//                            .orElseGet(() -> tryGlobalSearch(current, depType)
                                    .orElseThrow(() -> new CodeGenException("Missing dependency: " + depType)));
}

    //-- 私有方法实现不同查找策略 --//

    /**
     * 策略1：通过显式引用查找
     * 示例：<reference type="AGGREGATE" refId="orderAggregate"/>
     */
    private static Optional<DslElement> tryFindByExplicitRef(DslElement current, String depType) {
        if (CollectionUtils.isEmpty(current.getReferences())) {
            return Optional.empty();
        }
        return current.getReferences().stream()
                .filter(ref -> depType.equals(ref.getType()))
                .findFirst()
                .map(ref -> current.getModel().getElementByIdOrThrow(ref.getRefId()));
    }

    /**
     * 策略2：在父级链中查找
     * 示例：Entity元素的父级是Aggregate
     */
    private static Optional<DslElement> tryFindByParent(DslElement current, String depType) {
        DslElement parent = current.getParent();
        while (parent != null) {
            if (depType.equals(parent.getType())) {
                return Optional.of(parent);
            }
            parent = parent.getParent();
        }
        return Optional.empty();
    }

//    /**
//     * 策略3：通过命名约定查找
//     * 示例：OrderRepository → OrderAggregate
//     */
//    private static Optional<DslElement> tryFindByNamingConvention(DslElement current, String depType) {
//        String baseName = StringUtils.removeEnd(current.getName(), "Repository");
//        return current.getModel().getElements().stream()
//                .filter(e -> depType.equals(e.getType()))
//                .filter(e -> e.getName().equals(baseName))
//                .findFirst();
//    }
//
//    /**
//     * 策略4：全局类型匹配查找
//     */
//    private static Optional<DslElement> tryGlobalSearch(DslElement current, String depType) {
//        return current.getModel().getElements().stream()
//                .filter(e -> depType.equals(e.getType()))
//                .findFirst();
//    }
}
