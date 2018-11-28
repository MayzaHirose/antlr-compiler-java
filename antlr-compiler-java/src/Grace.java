import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Grace {
	public static void main( String[] args) throws Exception 	{

		ANTLRInputStream input = new ANTLRInputStream(System.in);

		GraceLexer lexer = new GraceLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		GraceParser parser = new GraceParser(tokens);
		ParseTree tree = parser.start(); // begin parsing at rule 'start'
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
}
