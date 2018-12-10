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
	public static Boolean verificaVariavelInicializadaComTipoCorreto(String valor, TipoDeDado tipoEsperado) {
		Boolean isTipoCorreto = Boolean.FALSE;
		
		switch (tipoEsperado.toString()) {
		case "INT":
			try {
				Integer.parseInt(valor);
				isTipoCorreto = Boolean.TRUE;
			} catch (Exception e) {
				isTipoCorreto = Boolean.FALSE;
			}		
			break;
		case "STRING":
			if(valor.startsWith("\"") && valor.endsWith("\"")) {
				isTipoCorreto = Boolean.TRUE;
			} else {
				isTipoCorreto = Boolean.FALSE;
			}
			break;
		case "BOOL":
			switch (valor) {
			case "true":
				isTipoCorreto = Boolean.TRUE;
				break;
			case "false":
				isTipoCorreto = Boolean.TRUE;
				break;
			default:
				isTipoCorreto = Boolean.FALSE;
				break;
			}
			break;
		}
				
		return isTipoCorreto;
	}
}
