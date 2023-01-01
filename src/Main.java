import Gremmers.visitor.AntlrToAST;
import Gremmers.prog.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import syntax.projectLexer;
import syntax.projectParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            String source = "folders/test1.txt";
            CharStream input = CharStreams.fromFileName(source);
            projectLexer lexer = new projectLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            projectParser parser = new projectParser(tokens);
            ParseTree dartAST = parser.prog();
            AntlrToAST programVisitor = new AntlrToAST();
            Program prog = (Program) programVisitor.visit(dartAST);

            System.out.println(prog);
            System.out.println("hiiii");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        System.out.println("Hello world!");
    }
}