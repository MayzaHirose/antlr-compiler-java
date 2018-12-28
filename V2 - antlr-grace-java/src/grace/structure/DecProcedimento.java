package grace.structure;

import grace.util.Categoria;

public class DecProcedimento extends RegistroTabelaDeSimbolos {
	
	private String valorRetorno;

	public DecProcedimento(String cadeia, Categoria categoria, String valorRetorno) {
		super(cadeia, categoria);
		this.valorRetorno = valorRetorno;
	}

	public String getValorRetorno() {
		return valorRetorno;
	}

	public void setValorRetorno(String valorRetorno) {
		this.valorRetorno = valorRetorno;
	}

}
