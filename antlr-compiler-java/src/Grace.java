import java.util.Arrays;
import java.util.List;

import org.antlr.v4.gui.TreeViewer;
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
		
		final List<String> ruleNames = Arrays.asList(GraceParser.ruleNames);
	    final TreeViewer view = new TreeViewer(ruleNames, tree);
	    view.open();
	
	}
}
