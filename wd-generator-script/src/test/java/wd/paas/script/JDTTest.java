package wd.paas.script;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.printer.DotPrinter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Optional;

public class JDTTest {

    @Test
    public void test() throws IOException {

        String path = "/Users/shimmer/Project/Idea/Company/wake/wake-code-generator/wd-generator-script/src/main/java/com/wd/paas/script/Main.java";

        File base = new File("/");
        String absolutePath = base.getCanonicalPath() + File.separator + path;
        ParseResult<CompilationUnit> result = new JavaParser().parse(Paths.get(absolutePath));
        Optional<CompilationUnit> compilationUnit = result.getResult();
        // 1. Yaml格式输出打印
//        compilationUnit.ifPresent(YamlPrinter::print);
        // 2. XML格式输出打印
//        compilationUnit.ifPresent(XmlPrinter::print);
        // 3. dot打印(可以通过Graphiz dot命令，将输出生成为图片格式，例如 dot -Tpng ast.dot > ast.png)
        compilationUnit.ifPresent(e -> System.out.println(new DotPrinter(true).output(e)));
    }

}
