import java.util.LinkedList;

import compiler.util.TipoDeDado;

//A pilha de tabelas é a pilha de escopos, com cada tabela representando um escopo
public class PilhaDeTabelas {
    private final LinkedList<TabelaDeSimbolos> pilha;
    public int qtdTabelas = 0;

    public PilhaDeTabelas() {
        pilha = new LinkedList<>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
        qtdTabelas++;
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String cadeia) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(cadeia)) {
                return true;
            }
        }
        return false;
    }

    public void desempilhar() {
        pilha.pop();
    }
    
    public TipoDeDado tipoDeDadoDoSimbolo(String cadeia){
        for(TabelaDeSimbolos ts : pilha){
            EntradaTabelaDeSimbolos simbolo = ts.getSimbolo(cadeia);
            if(simbolo != null) {
                return simbolo.getTipoDeDado();
            }
        }
        return null;
    }
    
    public LinkedList<TabelaDeSimbolos> getPilha() {
    	return pilha;
    }
}
