package com.wd.paas.script;

import com.beust.jcommander.JCommander;
import com.wd.paas.generator.CodeGenerateService;
import com.wd.paas.generator.CodeGenerateServiceImpl;
import com.wd.paas.generator.convert.project.ProjectDTO;
import com.wd.paas.generator.convert.project.domainchart.ChartDTO;
import com.wd.paas.generator.convert.project.domainchart.DomainChartDTO;
import com.wd.paas.generator.generate.GenerateContext;
import com.wd.paas.generator.generate.constant.GenerateWayEnum;
import com.wd.paas.generator.input.chartXml.ChartXmlStream2DomainChartDTO;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.VelocityContext;

/**
 * 脚本main
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        CLI cli = new CLI();
        JCommander jCommander = JCommander.newBuilder().addObject(cli).build();
        try {
            jCommander.parse(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(ExitStatus.SYSTEM_EXCEPT.getValue());
        }
        cli.run(jCommander);
    }
}
