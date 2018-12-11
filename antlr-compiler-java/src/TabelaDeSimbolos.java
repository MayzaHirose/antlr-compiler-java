import java.util.ArrayList;
import java.util.List;

import compiler.util.TipoDeDado;
import compiler.util.Categoria;

public class TabelaDeSimbolos {
    private final String escopo;
    private final List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<>();
        this.escopo = escopo;
    }
    
    public void adicionarSimbolo(String cadeia, Categoria categoria, TipoDeDado tipoDeDado, String valor) {
        simbolos.add(new EntradaTabelaDeSimbolos(cadeia, categoria, tipoDeDado, valor));
    }
    
    public void adicionarSimbolo(EntradaTabelaDeSimbolos simbolo) {
        simbolos.add(simbolo);
    }

    public Boolean existeSimbolo(String cadeia) {
        for(EntradaTabelaDeSimbolos etds : simbolos) {
            if(etds.getCadeia().equals(cadeia)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
    
    public String getEscopo(){
        return escopo;
    }
    
    public EntradaTabelaDeSimbolos getSimbolo(String cadeia){
         for(EntradaTabelaDeSimbolos etds : simbolos) {
            if(etds.getCadeia().equals(cadeia)) {
                return etds;
            }
        }
        return null;
    }
    
    public List<EntradaTabelaDeSimbolos> getListaSimbolos(){
        return simbolos;
    }
}