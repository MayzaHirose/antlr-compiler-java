import java.util.Arrays;
import java.util.List;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Grace {
	public static void main( String[] args) throws Exception 	{     
        
		GraceLexer lexer = new GraceLexer(CharStreams.fromFileName("src/bubblesort.grc"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		GraceParser parser = new GraceParser(tokens);
		//lexer.removeErrorListeners();
        //lexer.addErrorListener(GraceErrorListener.INSTANCE);
        //parser.removeErrorListeners();
        //parser.addErrorListener(GraceErrorListener.INSTANCE);

        GraceParser.StartContext tree = parser.start();
		
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		final List<String> ruleNames = Arrays.asList(GraceParser.ruleNames);
	    final TreeViewer view = new TreeViewer(ruleNames, tree);
	    view.open();
	    
	    // Análise semântica
        //GraceVisitorSemantico visitorSemantico = new GraceVisitorSemantico();
        //visitorSemantico.start(tree);
        
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
