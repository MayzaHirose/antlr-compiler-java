import compiler.util.TipoDeDado;

public class GraceSemanticRules {
	
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
			break;
		case "string":
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
			break;
		case "bool":
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
			break;
		}
				
		return isTipoCorreto ? tipoEsperado : tipoEncontrado;
	}

	public static Boolean verificaExisteVariavelMesmoNome(String cadeia, TabelaDeSimbolos tabelaDeSimbolos) {
		if(tabelaDeSimbolos.existeSimbolo(cadeia)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
