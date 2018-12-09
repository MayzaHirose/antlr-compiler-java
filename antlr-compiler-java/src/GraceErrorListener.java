import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class GraceErrorListener implements ANTLRErrorListener {
	public static GraceErrorListener INSTANCE = new GraceErrorListener();

	@Override
	public void syntaxError(Recognizer<?, ?> rcgnzr, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException re) {
		System.out.println(rcgnzr);
		System.out.println(offendingSymbol);
		System.out.println(line);
		System.out.println(charPositionInLine);
		System.out.println(msg);
		System.out.println(re);
		if(offendingSymbol instanceof Token){
			Token token = (Token)offendingSymbol;
			String texto = token.getText();
			
		   // Erro léxico
		   if(token.getType() == GraceLexer.ERROR_CHAR){
		       if(texto.equals("{")) System.err.println("Linha " + (line+1) + ": comentario nao fechado");
		       else System.err.println("Linha " + line + ": " + texto + " - simbolo nao identificado");
		   }
		   
		   // Erro sintático
		   else{
		       if(texto.equals("<EOF>")) texto = "EOF";
		       System.err.println("Linha " + line + ": erro sintatico proximo a " + texto);
		   }
		}
	}
	
	@Override
	public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {}
	
	@Override
	public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {}
	
	@Override
	public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {}
}
