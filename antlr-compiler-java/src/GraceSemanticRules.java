import java.util.ArrayList;
import java.util.List;

import compiler.util.TipoDeDado;

public class GraceSemanticRules {
	private static List<String> opArit = new ArrayList<>();
	
	public GraceSemanticRules() {
		opArit.add("+");
		opArit.add("-");
		opArit.add("*");
		opArit.add("/");
		opArit.add("%");
	}
	
	// PROGRAMA
	public static Boolean verificaSePossuiFuncaoMain() {
		return Boolean.TRUE;
	}
	
	public static Boolean verificaSeFuncaoMainEstaNoFinal() {
		return Boolean.TRUE;
	}
	
	// DECLARAÇÃO
	public static TipoDeDado verificaVariavelInicializadaComTipoCorreto(String valor, TipoDeDado tipoEsperado) {
		Boolean isTipoCorreto = Boolean.FALSE;
		TipoDeDado tipoEncontrado = null;
		
		switch (tipoEsperado.toString()) {
		case "int":
			if(isExpressaoAritmetica(valor)) {
				isTipoCorreto = expressaoPossuiMesmoTipo(valor, tipoEsperado);
			} else {
				try {
					Integer.parseInt(valor);
					isTipoCorreto = Boolean.TRUE;
				} catch (Exception e) {
					if(valor.equals("true") || valor.equals("false")) {
						tipoEncontrado = TipoDeDado.BOOL;
					} else {
						tipoEncontrado = TipoDeDado.STRING;
					}
					isTipoCorreto = Boolean.FALSE;
				}	
			}
			break;
		case "string":
			if(isExpressaoAritmetica(valor)) {
				isTipoCorreto = Boolean.FALSE;
			} else {
				if(valor.startsWith("\"") && valor.endsWith("\"")) {
					isTipoCorreto = Boolean.TRUE;
				} else {
					if(valor.equals("true") || valor.equals("false")) {
						tipoEncontrado = TipoDeDado.BOOL;
					} else {
						tipoEncontrado = TipoDeDado.INT;
					}
					isTipoCorreto = Boolean.FALSE;
				}
			}
			break;
		case "bool":
			if(isExpressaoAritmetica(valor)) {
				isTipoCorreto = Boolean.FALSE;
			} else {
				switch (valor) {
				case "true":
					isTipoCorreto = Boolean.TRUE;
					break;
				case "false":
					isTipoCorreto = Boolean.TRUE;
					break;
				default:
					if(valor.startsWith("\"") && valor.endsWith("\"")) {
						tipoEncontrado = TipoDeDado.STRING;
					} else {
						tipoEncontrado = TipoDeDado.INT;
					}
					isTipoCorreto = Boolean.FALSE;
					break;
				}
			}
			break;
		}
				
		return isTipoCorreto ? tipoEsperado : tipoEncontrado;
	}

	public static Boolean verificaExisteVariavelMesmoNome(String cadeia, TabelaDeSimbolos tabelaDeSimbolos) {
		return tabelaDeSimbolos.existeSimbolo(cadeia);
	}
	
	private static Boolean isExpressaoAritmetica(String valor) {
		for(String s: opArit) {
			if(valor.contains(s)) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	private static Boolean expressaoPossuiMesmoTipo(String valor, TipoDeDado tipoEsperado) {
		for (int i=0; i<valor.length(); i++) {
			String c = valor.substring(i, i+1);
			if(!opArit.contains(c)) {
				if(GraceVisitorSemantico.pilhaDeTabelas.topo().existeSimbolo(c)) {
					if(!GraceVisitorSemantico.pilhaDeTabelas.topo().getSimbolo(c).getTipoDeDado().equals(tipoEsperado)) {
						return Boolean.FALSE;
					}
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
	
	private Boolean isArranjo() {
		return Boolean.TRUE;
	}
}
