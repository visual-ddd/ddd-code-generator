package com.wd.paas.generator.web.domain.codegen.domainchart;

/**
 * 领域图谱-聚合根-仓储接口
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
public interface DomainChartRepository {

    /**
     * 新增
     *
     * @param aggregation 聚合
     * @return 主键id
     */
    Long insertDomainChart(DomainChart aggregation);

    /**
     * 更新
     *
     * @param aggregation 聚合
     */
    void updateDomainChart(DomainChart aggregation);

    /**
     * 删除
     *
     * @param id 主键
     */
    void deleteDomainChartById(Long id);

    /**
     * 查询
     *
     * @param id 主键
     * @return 查询结果
     */
    DomainChart selectDomainChartById(Long id);

}
