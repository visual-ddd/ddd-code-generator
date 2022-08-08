package com.wake.generator.application.generate.api;

import com.wake.generator.application.generate.entity.DomainChart;
import com.wake.generator.application.generate.handler.DomainChartCodeGenerator;
import com.wake.generator.application.generate.handler.GeneratedCode;
import com.wake.generator.application.generate.util.JAXBContextParseXmlUtil;
import com.wake.generator.application.generate.util.Xml2ChartConvert;
import com.wake.generator.application.generate.util.model.MXFileRoot;
import com.wake.generator.application.generate.util.model.ObjectLabel;
import com.wake.generator.client.generete.api.CodeGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.zip.ZipOutputStream;

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

    @Override
    public void generateCodeByChartXml(Long chartId, ZipOutputStream zipOutputStream) {
        // 查询图谱xml流
        InputStream inputStream = null;
        // 生成代码
        this.generateCode(inputStream, zipOutputStream);
    }

    public static void main(String[] args) {
        File file = new File("./newFile.zip");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream)) {
            // 生成代码,并传递到输出流
            CodeGenerateByXmlServiceImpl codeGenerateByXmlService = new CodeGenerateByXmlServiceImpl();
            File file1 = new File("/Users/shimmer/IdeaProjects/wake-code-generator/a.xml");
            codeGenerateByXmlService.generateCode(Files.newInputStream(file1.toPath()), zipOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void generateCode(InputStream inputStream, ZipOutputStream zipOutputStream) {
        List<ObjectLabel> objectLabelList = this.parseXml(inputStream);
        DomainChart domainChart = Xml2ChartConvert.transformDomainChart(objectLabelList);
        GeneratedCode codeGenerator = new DomainChartCodeGenerator(domainChart);
        codeGenerator.run(zipOutputStream);
    }

    private List<ObjectLabel> parseXml(InputStream inputStream) {
        MXFileRoot mxFileRoot;
        try {
            mxFileRoot = JAXBContextParseXmlUtil
                    .xml2javaFromRecource(inputStream, MXFileRoot.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return mxFileRoot.getDiagram().getMxGraphModel().getRoot().getObjectLabelList();
    }

}
