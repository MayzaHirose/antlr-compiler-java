package grace.structure;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeSimbolos {
	private final String escopo;
    private final List<RegistroTabelaDeSimbolos> registros;
    
    public TabelaDeSimbolos(String escopo) {
    	this.escopo = escopo;
    	this.registros = new ArrayList<>();
    }
    
    public String getEscopo(){
    	return escopo;
    }
    
    public void adicionarRegistro(RegistroTabelaDeSimbolos registro) {
    	registros.add(registro);
    }

    public Boolean existeSimbolo(String cadeia) {
        for(RegistroTabelaDeSimbolos registro : registros) {
            if(registro.getCadeia().equals(cadeia)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
    
    public RegistroTabelaDeSimbolos getRegistro(String cadeia){
         for(RegistroTabelaDeSimbolos registro : registros) {
            if(registro.getCadeia().equals(cadeia)) {
                return registro;
            }
        }
        return null;
    }
    
    public List<RegistroTabelaDeSimbolos> getRegistros(){
        return registros;
    }
    
    public RegistroTabelaDeSimbolos getUltimoRegistroTabela() {
    	return registros.get(registros.size()-1);
    }
}
