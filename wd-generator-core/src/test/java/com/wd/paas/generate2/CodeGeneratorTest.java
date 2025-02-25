package com.wd.paas.generate2;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.io.TempDir;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CodeGeneratorTest {

    @TempDir
    Path tempDir;

    @Mock
    private TemplateLoader templateLoader;

    @Mock
    private VariableResolver variableResolver;

    @Mock
    private VelocityEngine velocityEngine;

    private CodeGenerator codeGenerator;
    private DslElement testElement;
    private TemplateMeta validTemplate;

    @BeforeEach
    void setUp() {
        // 初始化被测对象，注入mock的VelocityEngine
        codeGenerator = new CodeGenerator(templateLoader, variableResolver);
        testElement = DslElement.builder().id("OrderAggregate").type("AGGREGATE").build();
        validTemplate = new TemplateMeta();
        validTemplate.setEnabled(true);
        validTemplate.setTemplate("/templates/aggregate.vm");
        validTemplate.setOutput("domain/${className}.java");
    }

    @Test
    void should_generate_code_successfully() {
        // Mock模板加载
        when(templateLoader.getTemplate("AGGREGATE")).thenReturn(validTemplate);

        // Mock变量解析
        Map<String, Object> mockContext = Collections.singletonMap("className", "OrderAggregate");
        when(variableResolver.resolveVariables(testElement, validTemplate)).thenReturn(mockContext);

        // Mock Velocity渲染
        StringWriter writer = new StringWriter();
        when(velocityEngine.mergeTemplate(any(), any(), any(), any()))
                .thenAnswer(inv -> {
                    writer.write("public class OrderAggregate {}");
                    return null;
                });

        // 执行测试
        codeGenerator.generate(testElement);

        // 验证文件写入
        ArgumentCaptor<File> fileCaptor = ArgumentCaptor.forClass(File.class);
        ArgumentCaptor<String> contentCaptor = ArgumentCaptor.forClass(String.class);
        verify(velocityEngine).mergeTemplate(
                eq("/templates/aggregate.vm"),
                eq("UTF-8"),
                any(VelocityContext.class),
                any(StringWriter.class)
        );

        // 验证输出路径解析
        File expectedFile = tempDir.resolve("domain/OrderAggregate.java").toFile();
        assertThat(expectedFile)
                .exists();
    }

    @Test
    void should_process_dependencies_first() {
        // 设置依赖模板
        TemplateMeta depTemplate = new TemplateMeta();
        depTemplate.setEnabled(true);
        validTemplate.setDependencies(Collections.singletonList("VALUE_OBJECT"));

        DslElement depElement = DslElement.builder().id("Money").type("VALUE_OBJECT").build();
        when(templateLoader.getTemplate("AGGREGATE")).thenReturn(validTemplate);
        when(templateLoader.getTemplate("VALUE_OBJECT")).thenReturn(depTemplate);
        when(DependencyResolver.findDependencyElement(testElement, "VALUE_OBJECT")).thenReturn(depElement);

        codeGenerator.generate(testElement);

        // 验证调用顺序：先处理VALUE_OBJECT依赖
        InOrder inOrder = inOrder(templateLoader);
        inOrder.verify(templateLoader).getTemplate("VALUE_OBJECT");
        inOrder.verify(templateLoader).getTemplate("AGGREGATE");
    }

    @Test
    void should_skip_disabled_template() {
        validTemplate.setEnabled(false);
        when(templateLoader.getTemplate("AGGREGATE")).thenReturn(validTemplate);

        codeGenerator.generate(testElement);

        verifyNoInteractions(variableResolver);
        verifyNoInteractions(velocityEngine);
    }

    @Test
    void should_throw_when_template_rendering_fails() {
        when(templateLoader.getTemplate("AGGREGATE")).thenReturn(validTemplate);
        when(variableResolver.resolveVariables(testElement, validTemplate)).thenReturn(Collections.emptyMap());
        doThrow(new RuntimeException("Velocity error")).when(velocityEngine)
                .mergeTemplate(any(), any(), any(), any());

        assertThatThrownBy(() -> codeGenerator.generate(testElement))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Failed to render template");
    }

    @Test
    void should_handle_file_write_failure() throws IOException {
        when(templateLoader.getTemplate("AGGREGATE")).thenReturn(validTemplate);
        when(variableResolver.resolveVariables(testElement, validTemplate)).thenReturn(Collections.singletonMap("className", "Order"));

        // 模拟无权限写入
        File mockFile = mock(File.class);
        when(mockFile.getAbsolutePath()).thenReturn("/sys/readonly.file");
        doThrow(new IOException("Access denied")).when(mockFile).createNewFile();

        assertThatThrownBy(() -> codeGenerator.generate(testElement))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Failed to write file");
    }

    @Test
    void should_resolve_output_path_correctly() {
        // Mock路径解析
        when(velocityEngine.evaluate(any(), any(), eq("outputPathRule"), anyString()))
                .thenAnswer(inv -> {
                    StringWriter w = inv.getArgument(1);
                    w.write("domain/Order.java");
                    return true;
                });

        String path = codeGenerator.resolveOutputPath(validTemplate, Collections.emptyMap());
        assertThat(path).isEqualTo("domain/Order.java");
    }
}