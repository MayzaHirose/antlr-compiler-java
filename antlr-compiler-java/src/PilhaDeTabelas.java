import java.util.LinkedList;

import compiler.util.TipoDeDado;

//A pilha de tabelas é a pilha de escopos, com cada tabela representando um escopo
public class PilhaDeTabelas {
    private final LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }

    public void desempilhar() {
        pilha.pop();
    }
    
    public TipoDeDado tipoDeDadoDoSimbolo(String nome){
        for(TabelaDeSimbolos ts : pilha){
            EntradaTabelaDeSimbolos simbolo = ts.getSimbolo(nome);
            if(simbolo != null) {
                return simbolo.getTipoDeDado();
            }
        }
        return null;
    }
}
