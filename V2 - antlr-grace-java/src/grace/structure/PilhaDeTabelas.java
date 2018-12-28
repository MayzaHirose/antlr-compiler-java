package grace.structure;

import java.util.LinkedList;

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
    
    public LinkedList<TabelaDeSimbolos> getPilha() {
    	return pilha;
    }
}
