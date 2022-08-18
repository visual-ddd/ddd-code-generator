package com.wake.generator.application.generate.api;

import com.wake.generator.application.generate.common.DomainShapeEnum;
import com.wake.generator.application.generate.entity.DomainChart;
import com.wake.generator.application.generate.entity.DomainShape;
import com.wake.generator.application.generate.handler.DomainChartCodeGenerator;
import com.wake.generator.application.generate.handler.GeneratedCode;
import com.wake.generator.application.generate.util.Xml2ChartConvert;
import com.wake.generator.client.generete.api.CodeGenerateService;
import com.wake.generator.client.generete.dto.GenerateDomainDto;
import com.wake.generator.client.generete.dto.GenerateProjectDto;
import com.wake.generator.infra.manage.repository.mapper.ChartMapper;
import com.wake.generator.infra.manage.repository.mapper.DomainMapper;
import com.wake.generator.infra.manage.repository.model.ChartDO;
import com.wake.generator.infra.manage.repository.model.DomainDO;
import com.wakedata.common.storage.enums.BucketEnum;
import com.wakedata.common.storage.service.FileStorageService;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipOutputStream;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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

    private static void addProject(Set<DomainShape> domainShapes) {
        DomainShape projectShape = new DomainShape();
        projectShape.setShapeType(DomainShapeEnum.PROJECT);
        domainShapes.add(projectShape);
    }

    @Override
    public void generateCodeByChartXml(GenerateProjectDto projectDto,
        ZipOutputStream zipOutputStream) {
        List<GenerateDomainDto> domainDtoList = projectDto.getDomainList();
        for (GenerateDomainDto domainDto : domainDtoList) {
            // 获取最新的图谱文件
            DomainDO domainDO = domainMapper.selectById(domainDto.getId());
            ChartDO chartDO = chartMapper.selectById(domainDO.getChartId());
            String fileKey = chartDO.getFileKey();
            InputStream fileStream = fileStorageService.getFileStream(BucketEnum.MATERIAL, fileKey);
            Set<DomainShape> domainShapes = Xml2ChartConvert.getDomainShape(fileStream);
            // 添加项目元素
            addProject(domainShapes);
            DomainChart domainChart = new DomainChart();
            domainChart.setDomainShapeList(domainShapes);
            domainChart.setGlobal(Xml2ChartConvert.transformGlobal(projectDto, domainDto));
            // 生成代码
            GeneratedCode codeGenerator = new DomainChartCodeGenerator(domainChart);
            codeGenerator.run(zipOutputStream);
        }
    }

}
