package com.wake.generator.application.generate.api;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wake.generator.application.generate.common.GenerateElementTypeEnum;
import com.wake.generator.application.generate.entity.GenerateChart;
import com.wake.generator.application.generate.entity.GenerateElement;
import com.wake.generator.application.generate.generator.DomainChartCodeGenerator;
import com.wake.generator.application.generate.generator.GeneratedCode;
import com.wake.generator.application.generate.util.ChartXmlParser;
import com.wake.generator.client.generete.api.CodeGenerateService;
import com.wake.generator.client.generete.dto.GenerateDomainDto;
import com.wake.generator.client.generete.dto.GenerateProjectDto;
import com.wake.generator.infra.manage.repository.mapper.ChartMapper;
import com.wake.generator.infra.manage.repository.mapper.DomainMapper;
import com.wake.generator.infra.manage.repository.model.ChartDO;
import com.wake.generator.infra.manage.repository.model.DomainDO;
import com.wakedata.common.core.util.BeanUtil;
import com.wakedata.common.storage.enums.BucketEnum;
import com.wakedata.common.storage.service.FileStorageService;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.zip.ZipOutputStream;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * 代码生成器服务实现类
 *
 * @author ZhuXueLiang
 * @date 2022/3/24 17:43
 * @since 1.0
 */
@Slf4j
@Service
public class CodeGenerateByXmlServiceImpl implements CodeGenerateService {

    @Resource
    private DomainMapper domainMapper;
    @Resource
    private ChartMapper chartMapper;
    @Resource
    private FileStorageService fileStorageService;

    @Override
    public void generateCodeByChartXml(GenerateProjectDto projectDto,
        ZipOutputStream zipOutputStream) {
        // 解析需要生成的图谱
        List<GenerateChart> generateChartList = parseGenerateChartsByProject(projectDto);
        // 生成代码到输出流
        GeneratedCode codeGenerator = new DomainChartCodeGenerator(generateChartList);
        codeGenerator.run(zipOutputStream);
    }

    /**
     * 根据传递的项目模型,解析出需要代码生成的图谱列表
     *
     * @param projectDto 待解析的项目模型
     * @return 需要代码生成的图谱列表
     */
    private List<GenerateChart> parseGenerateChartsByProject(GenerateProjectDto projectDto) {
        // 解析出需要生成的图谱模型
        List<GenerateChart> generateCharts = parseGenerateCharts(projectDto);
        // 添加项目生成元素
        addGenerateProjectElement(generateCharts, projectDto);
        return generateCharts;
    }

    /**
     * 解析出需要生成的图谱集合
     *
     * @param projectDto 项目模型
     * @return 需要生成的图谱集合
     */
    private List<GenerateChart> parseGenerateCharts(GenerateProjectDto projectDto) {
        // 获取项目下的领域集合
        List<GenerateDomainDto> domainList = getDomainsByProject(projectDto);
        return domainList.stream()
            .map(domain -> parseGenerateChart(projectDto, domain))
            .collect(Collectors.toList());
    }

    /**
     * 解析单个需要生成的图谱
     *
     * @param project 项目模型
     * @param domain  领域模型
     * @return 需要生成的图谱
     */
    private GenerateChart parseGenerateChart(GenerateProjectDto project, GenerateDomainDto domain) {
        GenerateChart generateChart = new GenerateChart();
        InputStream chartXmlStream = getChartXmlStreamByDomainId(domain.getId());
        generateChart.setGenerateElements(ChartXmlParser.parse(chartXmlStream));
        generateChart.setGlobal(ChartXmlParser.transformGlobal(project, domain));
        return generateChart;
    }

    /**
     * 根据 领域id 获取领域图谱文件流
     *
     * @param domainId 领域id
     * @return 领域图谱文件流
     */
    private InputStream getChartXmlStreamByDomainId(Long domainId) {
        DomainDO domainDO = domainMapper.selectById(domainId);
        ChartDO chartDO = chartMapper.selectById(domainDO.getChartId());
        String fileKey = chartDO.getFileKey();
        return fileStorageService.getFileStream(BucketEnum.MATERIAL, fileKey);
    }

    /**
     * 从项目中取出领域图谱集合,当没有传递领域图谱,则从数据库查询
     * <p/>
     * 用途:兼容选择图谱生成
     *
     * @param projectDto 项目模型
     * @return 需要生成的领域模型集合
     */
    private List<GenerateDomainDto> getDomainsByProject(GenerateProjectDto projectDto) {
        List<GenerateDomainDto> domainDtoList = projectDto.getDomainList();
        if (CollectionUtils.isEmpty(domainDtoList)) {
            // 查询项目下所有领域
            Long projectId = projectDto.getId();
            List<DomainDO> domainDOList = domainMapper.selectList(
                new LambdaQueryWrapper<DomainDO>().eq(DomainDO::getProjectId, projectId));
            domainDtoList = BeanUtil.copyList(domainDOList, GenerateDomainDto.class);
        }
        return domainDtoList;
    }

    /**
     * 在生成列表中添加生成项目
     *
     * @param generateCharts 领域图谱
     * @param projectDto     项目模型
     */
    private void addGenerateProjectElement(List<GenerateChart> generateCharts,
        GenerateProjectDto projectDto) {
        GenerateElement projectShape = new GenerateElement();
        projectShape.setShapeType(GenerateElementTypeEnum.PROJECT);
        Set<GenerateElement> domainShapes = Collections.singleton(projectShape);
        GenerateChart generateChart = new GenerateChart();
        generateChart.setGlobal(
            ChartXmlParser.transformGlobal(projectDto, new GenerateDomainDto()));
        generateChart.setGenerateElements(domainShapes);
        generateCharts.add(generateChart);
    }

}
