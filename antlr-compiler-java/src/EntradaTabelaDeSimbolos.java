import compiler.util.TipoDeDado;
import compiler.util.TipoSimbolo;

public class EntradaTabelaDeSimbolos {
    private String nome;
    private TipoSimbolo tipoSimbolo; 
    private TipoDeDado tipoDeDado;
    
    public EntradaTabelaDeSimbolos(String nome, TipoSimbolo tipoSimbolo, TipoDeDado tipoDeDado) {
        this.nome = nome;
        this.tipoSimbolo = tipoSimbolo;
        this.tipoDeDado = tipoDeDado;
    }
    
    public String getNome() {
        return nome;
    }
    
    public TipoSimbolo getTipoSimbolo() {
        return tipoSimbolo;
    }
    
    public TipoDeDado getTipoDeDado(){
        return tipoDeDado;
    }
}