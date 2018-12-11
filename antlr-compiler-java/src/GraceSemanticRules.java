import java.util.ArrayList;
import java.util.List;

import compiler.util.Categoria;
import compiler.util.TipoDeDado;

public class GraceSemanticRules {
	private static List<String> opArit = new ArrayList<>();
	private static List<String> opRel = new ArrayList<>();

	public static TipoDeDado verificaVariavelInicializadaComTipoCorreto(String valor, TipoDeDado tipoEsperado, Categoria categoria) {
		Boolean isTipoCorreto = Boolean.FALSE;
		TipoDeDado tipoEncontrado = null;
		
		if(categoria.equals(Categoria.VARIAVEL_SIMPLES)) {
			switch (tipoEsperado.toString()) {
			case "int":
				if(isExpressaoAritmetica(valor) || isVariavelDeclarada(valor, tipoEsperado)) {
					isTipoCorreto = expressaoPossuiMesmoTipoInteiro(valor, tipoEsperado);
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
		} else if(categoria.equals(Categoria.VARIAVEL_ARRANJO)){
			String[] valoresArranjo = valor.split(",");
			switch (tipoEsperado.toString()) {
			case "int":
				for(String s: valoresArranjo) {
					try {
						Integer.parseInt(s);
						isTipoCorreto = Boolean.TRUE;
					} catch (Exception e) {
						if(s.equals("true") || s.equals("false")) {
							tipoEncontrado = TipoDeDado.BOOL;
						} else {
							tipoEncontrado = TipoDeDado.STRING;
						}
						isTipoCorreto = Boolean.FALSE;
						break;
					}	
				}
				break;
			case "string":
				for(String s: valoresArranjo) {
					if(s.startsWith("\"") && s.endsWith("\"")) {
						isTipoCorreto = Boolean.TRUE;
					} else {
						if(s.equals("true") || s.equals("false")) {
							tipoEncontrado = TipoDeDado.BOOL;
						} else {
							tipoEncontrado = TipoDeDado.INT;
						}
						isTipoCorreto = Boolean.FALSE;
						break;
					}
				}
				break;
			case "bool":
				for(String s: valoresArranjo) {
					if(s.equals("true") || s.equals("false")) {
						isTipoCorreto = Boolean.TRUE;
					} else {
						if(s.startsWith("\"") && s.endsWith("\"")) {
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
		}
				
		return isTipoCorreto ? tipoEsperado : tipoEncontrado;
	}

	public static Boolean verificaExisteVariavelMesmoNome(String cadeia, TabelaDeSimbolos tabelaDeSimbolos) {
		return tabelaDeSimbolos.existeSimbolo(cadeia);
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
	
	private static Boolean isVariavelDeclarada(String valor, TipoDeDado tipoEsperado) {
		if(GraceVisitorSemantico.pilhaDeTabelas.topo().existeSimbolo(valor) || existeSimboloNoEscopoGlobal(valor)) {
			if(!GraceVisitorSemantico.pilhaDeTabelas.topo().getSimbolo(valor).getTipoDeDado().equals(tipoEsperado)) {
				return Boolean.FALSE;
			} else {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	public static Boolean variavelReadDeclarada(String valor) {
		if(GraceVisitorSemantico.pilhaDeTabelas.topo().existeSimbolo(valor) || existeSimboloNoEscopoGlobal(valor)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	private static Boolean expressaoPossuiMesmoTipoInteiro(String valor, TipoDeDado tipoEsperado) {
		if(opArit.isEmpty()) {
			populaListaOpArit();
		}
		for (int i=0; i<valor.length(); i++) {
			String c = valor.substring(i, i+1); //include/exclude
			if(!opArit.contains(c)) {
				if(GraceVisitorSemantico.pilhaDeTabelas.topo().existeSimbolo(c) || existeSimboloNoEscopoGlobal(c)) {
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
	
	public static Boolean existeSimboloNoEscopoGlobal(String c) {
		for(TabelaDeSimbolos tbl: GraceVisitorSemantico.pilhaDeTabelas.getPilha()) {
			if(tbl.getEscopo().equals("global")) {
				if(tbl.existeSimbolo(c)) {
					return tbl.getSimbolo(c).getTipoDeDado().equals(TipoDeDado.INT);
				}
			}
		}
		return Boolean.FALSE;
	}
	
	public static Boolean verificaExpressaoIfCorreto(String left, String opRelacional, String right) {
		GraceVisitorSemantico.leftOK = integerOk(left);
		GraceVisitorSemantico.rightOK = integerOk(right);
		GraceVisitorSemantico.opRelacionalOK = isOperadorFuncional(opRelacional);
		return GraceVisitorSemantico.leftOK && GraceVisitorSemantico.opRelacionalOK && GraceVisitorSemantico.rightOK;
	}
	
	public static Boolean verificaSeExisteProcedimento(String nome) {
		for(TabelaDeSimbolos tbl: GraceVisitorSemantico.pilhaDeTabelas.getPilha()) {
			if(tbl.getEscopo().equals("global")) {
				return tbl.existeSimbolo(nome);
			}
		}
		return Boolean.FALSE;
	}
	
	public static Boolean subprogramaTemParametros(String nome) {
		ParametroFunProc parametrosSubprograma = GraceVisitorSemantico.mapParametros.get(nome);
		return parametrosSubprograma.getOrdemParametros().size() > 0;
	}
	
	public static Boolean integerOk(String valor) {
		if(GraceVisitorSemantico.pilhaDeTabelas.topo().existeSimbolo(valor)) {
			if(GraceVisitorSemantico.pilhaDeTabelas.topo().getSimbolo(valor).getTipoDeDado().equals(TipoDeDado.INT)) {
				return Boolean.TRUE;
			}
		} else if(existeSimboloNoEscopoGlobal(valor)) {
			return Boolean.TRUE;
		} else {
			try {
				Integer.parseInt(valor);
				return Boolean.TRUE;
			} catch (Exception e) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
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
