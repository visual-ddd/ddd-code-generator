package wd.paas.script.javaparser;


import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.GenericVisitorAdapter;

class TestVisitor extends GenericVisitorAdapter<Void, Void> {
    @Override
    public Void visit(MethodCallExpr n, Void arg) {
        System.out.println("function call: " + n.toString());
        return super.visit(n, arg);
    }

    @Override
    public Void visit(MethodDeclaration n, Void arg) {
        System.out.println("function declaration: " + n.getNameAsString());
        return super.visit(n, arg);
    }
}
