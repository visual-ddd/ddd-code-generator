package com.wd.paas.generator.web.domain.codegen.domainchart.chart.shell;

import cn.hutool.core.io.IoUtil;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChart;
import com.wd.paas.generator.web.domain.codegen.domainchart.DomainChartRepository;
import com.wd.paas.generator.web.domain.codegen.project.Project;
import com.wd.paas.generator.web.domain.codegen.project.ProjectRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 创建领域图谱-指令处理器
 *
 * @author GaoZhiYi, ZhuXueLiang
 * @date 2022/10/15 10:05:57
 * @since 1.0
 */
@Component
public class DomainChartShellCreateCmdHandler {

    @Resource
    private DomainChartRepository repository;
    @Resource
    private ProjectRepository projectRepository;

    public void handle(DomainChartShellCreateCmd cmd) {
        DomainChart domainChart = repository.selectDomainChartById(cmd.getId());
        Project project = projectRepository.selectProjectById(domainChart.getProjectId());

        String shellUrl = "generator\\" + domainChart.getDomainName() + "\\" + "run.sh";

        String shell = "curl https://test-material-1259575047.cos.ap-guangzhou.myqcloud.com/wd-generator-script-latest.jar -o ../wd-generator-script-latest.jar \n" +
                "curl https://test-material-1259575047.cos.ap-guangzhou.myqcloud.com/" + domainChart.getFileKey() + " -o '" + domainChart.getDomainName() + ".drawio' \n\n" +
                "java -jar ../wd-generator-script-latest.jar \\\n" +
                "--chartXmlPath '" + domainChart.getDomainName() + ".drawio' \\\n" +
                "--projectName '" + project.getProjectName() + "' \\\n" +
                "--projectAuthor '" + project.getProjectAuthor() + "' \\\n" +
                "--projectGroup '" + project.getPackagePath() + "' \\\n" +
                "--domainName '" + domainChart.getDomainName() + "' \\\n" +
                "--domainDesc '" + domainChart.getDomainDesc() + "' \\\n" +
                "--domainAuthor '" + domainChart.getDomainAuthor() + "' \\\n" +
                "--outputPath ../../../";

        try (InputStream inputStream = new ByteArrayInputStream(shell.getBytes())) {
            ZipOutputStream zipOutputStream = cmd.getZipOutputStream();
            zipOutputStream.putNextEntry(new ZipEntry(shellUrl));

            IoUtil.copy(inputStream, zipOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}