import compiler.util.TipoDeDado;
import compiler.util.Categoria;

public class EntradaTabelaDeSimbolos {
    private String cadeia;
    private Categoria categoria; 
    private TipoDeDado tipoDeDado;
    private String valor;
    
    public EntradaTabelaDeSimbolos(String cadeia, Categoria categoria, TipoDeDado tipoDeDado, String valor) {
        this.cadeia = cadeia;
        this.categoria = categoria;
        this.tipoDeDado = tipoDeDado;
        this.valor = valor;
    }
    
    public String getCadeia() {
        return cadeia;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    
    public TipoDeDado getTipoDeDado(){
        return tipoDeDado;
    }
    
    public String getValor(){
        return valor;
    }

	public void setCadeia(String cadeia) {
		this.cadeia = cadeia;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setTipoDeDado(TipoDeDado tipoDeDado) {
		this.tipoDeDado = tipoDeDado;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
    
}