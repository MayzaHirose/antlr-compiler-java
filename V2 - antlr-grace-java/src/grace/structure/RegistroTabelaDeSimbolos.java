package grace.structure;

import grace.util.Categoria;

public class RegistroTabelaDeSimbolos {
	private String cadeia;
    private Categoria categoria;
    
    public RegistroTabelaDeSimbolos(String cadeia, Categoria categoria) {
        this.cadeia = cadeia;
        this.categoria = categoria;
    }
    
    public String getCadeia() {
        return cadeia;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
  
	public void setCadeia(String cadeia) {
		this.cadeia = cadeia;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
