
package com.szy.domain.SpellGroup.DemoClass;

/**
 * 聚合存储接口
 *
 * @author shimmer
 * @date 2022-03-16
 */
public interface DemoClassRepository {

    Long createDemoClass(DemoClass aggregation);

    void updateDemoClass(DemoClass aggregation);

    void deleteDemoClass(Long id);

    List<DemoClass> selectDemoClass();

}
