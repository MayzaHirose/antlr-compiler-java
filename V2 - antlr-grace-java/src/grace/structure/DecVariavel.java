package grace.structure;

import grace.util.Categoria;
import grace.util.TipoDeDado;

public class DecVariavel extends RegistroTabelaDeSimbolos {
	
	private String valor;
	private TipoDeDado tipoDeDado;

	public DecVariavel(String cadeia, Categoria categoria, TipoDeDado tipoDeDado, String valor) {
		super(cadeia, categoria);
		this.tipoDeDado = tipoDeDado;
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public TipoDeDado getTipoDeDado() {
		return tipoDeDado;
	}

	public void setTipoDeDado(TipoDeDado tipoDeDado) {
		this.tipoDeDado = tipoDeDado;
	}

}
