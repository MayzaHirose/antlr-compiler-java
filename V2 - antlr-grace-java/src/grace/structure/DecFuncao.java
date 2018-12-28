package grace.structure;

import grace.util.Categoria;
import grace.util.TipoDeDado;

public class DecFuncao extends RegistroTabelaDeSimbolos {

	private TipoDeDado tipoRetorno;
	private String valorRetorno;

	public DecFuncao(String cadeia, Categoria categoria, TipoDeDado tipoRetorno, String valorRetorno) {
		super(cadeia, categoria);
		this.tipoRetorno = tipoRetorno;
		this.valorRetorno = valorRetorno;
	}

	public TipoDeDado getTipoRetorno() {
		return tipoRetorno;
	}

	public void setTipoRetorno(TipoDeDado tipoRetorno) {
		this.tipoRetorno = tipoRetorno;
	}

	public String getValorRetorno() {
		return valorRetorno;
	}

	public void setValorRetorno(String valorRetorno) {
		this.valorRetorno = valorRetorno;
	}
}
