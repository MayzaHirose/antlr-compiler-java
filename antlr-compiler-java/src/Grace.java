import java.util.Arrays;
import java.util.List;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Grace {
	public static void main( String[] args) throws Exception 	{     
        
		GraceLexer lexer = new GraceLexer(CharStreams.fromFileName("src/Code.grc"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		GraceParser parser = new GraceParser(tokens);
		lexer.removeErrorListeners();
        lexer.addErrorListener(GraceErrorListener.INSTANCE);
        parser.removeErrorListeners();
        parser.addErrorListener(GraceErrorListener.INSTANCE);

        GraceParser.StartContext tree = parser.start();
		
		//System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		final List<String> ruleNames = Arrays.asList(GraceParser.ruleNames);
	    final TreeViewer view = new TreeViewer(ruleNames, tree);
	    view.open();
	    
	    // Análise semântica
        GraceVisitorSemantico visitorSemantico = new GraceVisitorSemantico();
        visitorSemantico.visitStart(tree);
	}
}
