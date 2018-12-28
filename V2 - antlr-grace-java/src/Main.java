import java.util.Arrays;
import java.util.List;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
	public static void main( String[] args) throws Exception 	{
	GraceGrammarLexer lexer = new GraceGrammarLexer(CharStreams.fromFileName("resources/teste1.grc"));
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	
	GraceGrammarParser parser = new GraceGrammarParser(tokens);
	//lexer.removeErrorListeners();
    //lexer.addErrorListener(GraceErrorListener.INSTANCE);
    //parser.removeErrorListeners();
    //parser.addErrorListener(GraceErrorListener.INSTANCE);

	GraceGrammarParser.StartContext tree = parser.start();
	
	System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	
	final List<String> ruleNames = Arrays.asList(GraceGrammarParser.ruleNames);
    final TreeViewer view = new TreeViewer(ruleNames, tree);
    view.open();
    
    // Análise semântica
    GraceVisitorSemanticAnalysis visitorSemantico = new GraceVisitorSemanticAnalysis();
    visitorSemantico.start(tree);
    
    /*for(int i=0;i<GraceVisitorSemantico.pilhaDeTabelas.qtdTabelas;i++) {
    	List<EntradaTabelaDeSimbolos> listaDeSimbolos = GraceVisitorSemantico.pilhaDeTabelas.topo().getListaSimbolos();
		for(EntradaTabelaDeSimbolos simbolo: listaDeSimbolos) {
			if(i==0) System.out.println("Escopo: " + GraceVisitorSemantico.pilhaDeTabelas.topo().getEscopo());
			System.out.println(simbolo.getCadeia() + "\t" + simbolo.getCategoria() + "\t" + simbolo.getTipoDeDado() + "\t" + simbolo.getValor());
		}
		System.out.println("--------------------------------------------------------");
		GraceVisitorSemantico.pilhaDeTabelas.desempilhar();
    }*/
}
}
