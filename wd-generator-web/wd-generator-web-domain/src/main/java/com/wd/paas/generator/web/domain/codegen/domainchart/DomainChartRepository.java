package com.wd.paas.generator.web.domain.codegen.domainchart;

import com.wd.paas.generator.convert.project.domainchart.DomainChartDTO;
import java.io.InputStream;
import java.util.List;

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
     * 更新图谱云文件
     *
     * @param aggregation 聚合
     */
    void updateChartXml(DomainChart aggregation);

    /**
     * 删除
     *
     * @param id 主键
     */
    void deleteDomainChartById(Long id);

    /**
     * 根据项目id删除
     *
     * @param projectId 所属项目
     */
    void deleteDomainChartByProjectId(Long projectId);

    /**
     * 查询
     *
     * @param id 主键
     * @return 查询结果
     */
    DomainChart selectDomainChartById(Long id);

    /**
     * 通过项目查询领域图谱列表
     *
     * @param projectId 项目id
     * @return 查询结果
     */
    List<DomainChartDTO> buildDomainChartDTOList(Long projectId);


    /**
     * 下载图谱云文件
     *
     * @param domainChartId 领域id
     * @return 文件流
     */
    InputStream downloadChartXmlByDomainChartId(Long domainChartId);

    /**
     * 获取图谱组件库
     *
     * @return 组件库文件流
     */
    InputStream downloadChartXmlComponent();
}
