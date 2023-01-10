package wd.paas.script.javaparser;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.printer.YamlPrinter;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;
import wd.paas.script.util.String2FileConverter;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Optional;

public class JDTTest {

    @Test
    public void buildJavaUnit() {
        CompilationUnit cu = new CompilationUnit();
        cu.setPackageDeclaration("wd.paas.script.javaparser");

        ClassOrInterfaceDeclaration mainClass = cu.addClass("GenClass").setPublic(true);
        mainClass.addAnnotation(Data.class);

        mainClass.addField(String.class, "name", Modifier.Keyword.PRIVATE, Modifier.Keyword.STATIC);
        mainClass.addField(String.class, "age", Modifier.Keyword.PRIVATE);

        MethodDeclaration mainMethod = mainClass.addMethod("test", Modifier.Keyword.PUBLIC);
        mainMethod.setType(String.class);
        mainMethod.addParameter(String.class, "name");
        mainMethod.addParameter(String.class, "age");

        // add a statement do the method body
        BlockStmt methodBody = new BlockStmt();
        MethodCallExpr methodCallExpr = new MethodCallExpr("System.out.println").addArgument("name + age");
        ReturnStmt returnStmt = new ReturnStmt("name");

        methodBody.addStatement(methodCallExpr)
                .addStatement(returnStmt);
        mainMethod.setBody(methodBody);

//        YamlPrinter.print(cu);
//        System.out.println(cu);
        String2FileConverter.string2File(cu.toString(), "src/test/java/wd/paas/script/javaparser/GenClass.java");
        Assert.assertTrue(true);
    }

    @Test
    public void parserJavaUnit() throws IOException {

        String path = "src/test/java/wd/paas/script/javaparser/GenClass.java";

        ParseResult<CompilationUnit> result = new JavaParser().parse(Paths.get(path));
        Optional<CompilationUnit> compilationUnit = result.getResult();

        // 1. Yaml格式输出打印
        compilationUnit.ifPresent(cu -> {
            Optional<ClassOrInterfaceDeclaration> genClass = cu.getClassByName("GenClass");
            genClass.ifPresent(e -> e.setName("GenClassChart"));

            String yml = new YamlPrinter(true).output(cu);
            String2FileConverter.string2File(yml, "src/test/java/wd/paas/script/javaparser/GenClassChart.yml");
            String2FileConverter.string2File(cu.toString(), "src/test/java/wd/paas/script/javaparser/GenClassChart.java");
        });

        // 2. XML格式输出打印
//        compilationUnit.ifPresent(XmlPrinter::print);

        // 3. dot打印(可以通过Graphiz dot命令，将输出生成为图片格式，例如 dot -Tpng ast.dot > ast.png)
//        compilationUnit.ifPresent(e -> System.out.println(new DotPrinter(true).output(e)));

        Assert.assertTrue(true);
    }

}
