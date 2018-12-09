import java.util.HashMap;
import java.util.LinkedList;

public class GraceVisitorSemantico extends GraceBaseVisitor<String> {
	PilhaDeTabelas pilhaDeTabelas; // cada tabela comum escopo
    HashMap<String, LinkedList<EntradaTabelaDeSimbolos>> mapRegistros; // mapeia o nome de cada registro com uma lista que armazena todos os seus respectivos campos
    HashMap<String, LinkedList<String>> mapParametros; // mapeia o nome de cada fun��o e procedimento com uma lista que armazena todos os seus respectivos par�metros
	
    @Override 
	public String visitStart(GraceParser.StartContext ctx) { 
    	System.out.println(ctx.getText());
    	pilhaDeTabelas = new PilhaDeTabelas();
        mapRegistros = new HashMap<>();
        mapParametros = new HashMap<String, LinkedList<String>>();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
		return visitChildren(ctx); 
	}
    
	@Override 
	public String visitDeclaracao(GraceParser.DeclaracaoContext ctx) { 
		System.out.println(ctx.getText());
		return visitChildren(ctx); 
	}

}
