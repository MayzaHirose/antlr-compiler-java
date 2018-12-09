import java.util.ArrayList;
import java.util.List;

import compiler.util.TipoDeDado;
import compiler.util.TipoSimbolo;

public class TabelaDeSimbolos {
    private final String escopo;
    private final List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<>();
        this.escopo = escopo;
    }
    
    public void adicionarSimbolo(String nome, TipoSimbolo tipoSimbolo, TipoDeDado tipoDeDado) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome, tipoSimbolo, tipoDeDado));
    }
    
    public void adicionarSimbolo(EntradaTabelaDeSimbolos simbolo) {
        simbolos.add(simbolo);
    }
    
    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds : simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public String getEscopo(){
        return escopo;
    }
    
    public EntradaTabelaDeSimbolos getSimbolo(String nome){
         for(EntradaTabelaDeSimbolos etds : simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds;
            }
        }
        return null;
    }
    
    public List<EntradaTabelaDeSimbolos> getListaSimbolos(){
        return simbolos;
    }
}