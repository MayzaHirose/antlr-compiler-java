import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import grace.structure.DecVariavel;
import grace.structure.TabelaDeSimbolos;
import grace.structure.TabelaParametrosSubprogramas;
import grace.util.Categoria;
import grace.util.TipoDeDado;

public class GraceRulesSemanticAnalysis {
	private static List<String> opArit = new ArrayList<>();
	private static List<String> opRel = new ArrayList<>();

	public static Boolean verificaExisteRegistroMesmoNome(String cadeia, TabelaDeSimbolos escopoAtual) {
		return escopoAtual.existeSimbolo(cadeia);
	}
	
	public static Categoria verificaCategoriaRegistro(String cadeia, TabelaDeSimbolos escopoAtual) {
		return escopoAtual.getRegistro(cadeia).getCategoria();
	}
	
	public static TipoDeDado verificaVariavelInicializadaComTipoCorreto(String valor, TipoDeDado tipoEsperado, Categoria categoria) {
		TipoDeDado tipoEncontrado = null;
		if(categoria.equals(Categoria.VARIAVEL_SIMPLES)) {
			if(isExpressaoDoTipoInteiro(valor)) {
				tipoEncontrado = TipoDeDado.INT;
			} else if(isExpressaoDoTipoBooleano(valor)) {
				tipoEncontrado = TipoDeDado.BOOL;
			} else if(isExpressaoDoTipoString(valor)) {
				tipoEncontrado = TipoDeDado.STRING;
			}
			
		} else if(categoria.equals(Categoria.VARIAVEL_ARRANJO)) {
			String[] valoresArranjo = valor.split(",");
			if(isArranjoDeInteiros(valoresArranjo)) {
				tipoEncontrado = TipoDeDado.INT;
			} else if(isArranjoDeBooleano(valoresArranjo)) {
				tipoEncontrado = TipoDeDado.BOOL;
			} else if(isArranjoDeStrings(valoresArranjo)) {
				tipoEncontrado = TipoDeDado.STRING;
			}
		}
		
		return tipoEncontrado;
	}
	
	private static Boolean isExpressaoDoTipoInteiro(String expressao) {
		if(isVariavelDeclarada(expressao, TipoDeDado.INT)) {
			return Boolean.TRUE;
		} 
		
		if(isExpressaoAritmetica(expressao)) {
			return expressaoPossuiOperandosInteiro(expressao);
		} else {
			try {
				Integer.parseInt(expressao);
				return Boolean.TRUE;
			} catch (Exception e) {
				return Boolean.FALSE;
			}	
		}
	}
	
	private static Boolean isExpressaoDoTipoBooleano(String expressao) {
		if(expressao.equals("true") || expressao.equals("false")) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	private static Boolean isExpressaoDoTipoString(String expressao) {
		if(expressao.startsWith("\"") && expressao.endsWith("\"")) {
			return Boolean.TRUE;
		} 
		return Boolean.FALSE;
	}
	
	private static Boolean isArranjoDeInteiros(String[] arranjo) {
		for(String item: arranjo) {
			try {
				Integer.parseInt(item);
				return Boolean.TRUE;
			} catch (Exception e) {
				return Boolean.FALSE;
			}	
		}
		return Boolean.FALSE;
	}
	
	private static Boolean isArranjoDeBooleano(String[] arranjo) {
		for(String item: arranjo) {
			if(item.equals("true") || item.equals("false")) {
				return Boolean.TRUE;
			} 
		}
		return Boolean.FALSE;
	}
	
	private static Boolean isArranjoDeStrings(String[] arranjo) {
		for(String item: arranjo) {
			if(item.startsWith("\"") && item.endsWith("\"")) {
				return Boolean.TRUE;
			} 
		}
		return Boolean.FALSE;
	}
	
	public static Boolean isVariavelDeclarada(String valor, TipoDeDado tipoEsperado) {
		LinkedList<TabelaDeSimbolos> pilha = GraceVisitorSemanticAnalysis.pilhaDeTabelas.getPilha();
		
		for (int i = 0; i < pilha.size(); i++) {
			if(pilha.get(i).existeSimbolo(valor)) {	
				if(pilha.get(i).getRegistro(valor) instanceof DecVariavel) {
					DecVariavel registroVar = (DecVariavel) pilha.get(i).getRegistro(valor);
					if(tipoEsperado == null) {
						return Boolean.TRUE;
					}else if(!registroVar.getTipoDeDado().equals(tipoEsperado)) {
						return Boolean.FALSE;
					} else {
						return Boolean.TRUE;
						
					}
				}
			}
		}
		
		return Boolean.FALSE;
	}
	
	private static Boolean isExpressaoAritmetica(String valor) {
		if(opArit.isEmpty()) {
			populaListaOpArit();
		}
		for(String s: opArit) {
			if(valor.contains(s)) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	private static Boolean expressaoPossuiOperandosInteiro(String expressao) {
		if(opArit.isEmpty()) {
			populaListaOpArit();
		}
		for (int i=0; i<expressao.length(); i++) {
			String c = expressao.substring(i, i+1); //include/exclude
			if(!opArit.contains(c)) { //ignora operadores
				if(!isVariavelDeclarada(c, TipoDeDado.INT)) {
					return Boolean.FALSE;
				} else {
					try {
						Integer.parseInt(c);
					} catch (Exception e) {
						return Boolean.FALSE;
					}
				}
			}
		}
		return Boolean.TRUE;
	}
	
	public static Boolean variavelReadDeclarada(String valor) {
		if(isVariavelDeclarada(valor, null)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public static Boolean verificaSeExisteSubprograma(String valor) {
		LinkedList<TabelaDeSimbolos> pilha = GraceVisitorSemanticAnalysis.pilhaDeTabelas.getPilha();
		
		for (int i = 0; i < pilha.size(); i++) {
			if(pilha.get(i).existeSimbolo(valor) && (pilha.get(i).getRegistro(valor).getCategoria().equals(Categoria.PROCEDIMENTO) 
					|| pilha.get(i).getRegistro(valor).getCategoria().equals(Categoria.FUNCAO))) {	
				return Boolean.TRUE;
			}
		}
		
		return Boolean.FALSE;
	}
	
	public static Boolean subprogramaTemParametros(String nome) {
		TabelaParametrosSubprogramas parametrosSubprograma = GraceVisitorSemanticAnalysis.mapParametros.get(nome);
		return parametrosSubprograma.getOrdemParametros().size() > 0;
	}
	
	public static Boolean tipoParametroNaOrdemCorreta(String param, Integer ordem, String nomeSubprograma) {
		TipoDeDado tipoEsperado = GraceVisitorSemanticAnalysis.mapParametros.get(nomeSubprograma).getOrdemParametros().get(ordem);
		TipoDeDado tipoEncontrado = null;
		
		if(isExpressaoDoTipoInteiro(param)) {
			tipoEncontrado = TipoDeDado.INT;
		} else if(isExpressaoDoTipoBooleano(param)) {
			tipoEncontrado = TipoDeDado.BOOL;
		} else if(isExpressaoDoTipoString(param)) {
			tipoEncontrado = TipoDeDado.STRING;
		}
		
		return tipoEncontrado.equals(tipoEsperado);
	}
	
	public static Boolean verificaExpressaoCondicionalCorreta(String left, String opRelacional, String right) {
		GraceVisitorSemanticAnalysis.leftOK = isExpressaoDoTipoInteiro(left);
		GraceVisitorSemanticAnalysis.rightOK = isExpressaoDoTipoInteiro(right);
		GraceVisitorSemanticAnalysis.opRelacionalOK = isOperadorFuncional(opRelacional);
		return GraceVisitorSemanticAnalysis.leftOK && GraceVisitorSemanticAnalysis.opRelacionalOK && GraceVisitorSemanticAnalysis.rightOK;
	}
	
	public static Boolean isRetornoIgualDeclarado(String expressao, TipoDeDado retorno) {
		TipoDeDado tipoEncontrado = null;
		
		if(isExpressaoDoTipoInteiro(expressao)) {
			tipoEncontrado = TipoDeDado.INT;
		} else if(isExpressaoDoTipoBooleano(expressao)) {
			tipoEncontrado = TipoDeDado.BOOL;
		} else if(isExpressaoDoTipoString(expressao)) {
			tipoEncontrado = TipoDeDado.STRING;
		}
		
		return tipoEncontrado.equals(retorno);
	}
	
	public static Boolean isOperadorFuncional(String op) {
		if(opRel.isEmpty()) {
			populaListaOpRel();
		}
		return opRel.contains(op);
	}
	
	private static void populaListaOpArit() {
		opArit.add("+");
		opArit.add("-");
		opArit.add("*");
		opArit.add("/");
		opArit.add("%");
	}
	
	private static void populaListaOpRel() {
		opRel.add(">");
		opRel.add(">=");
		opRel.add("<");
		opRel.add("<=");
	}
}
