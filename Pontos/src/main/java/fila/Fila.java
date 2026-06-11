package fila;

/**
 * Implementa a estrutura de dados FILA usando uma Lista Simplesmente Encadeada
 * @param <T> Tipo a ser armazenado na fila
 */
public class Fila<T> implements IFila<T> {

    private No  first;
    private No  last;
    private int qtdItens;

    private class No {
        public T  item;
        public No prox;

        public No(T item) {
            this.item = item;
            this.prox = null;
        }
    }
    
    @Override
    public boolean inserir(T e) {
        No no;
        
        try {
            no = new No(e);
        }
        catch(OutOfMemoryError ex) {
            return false;
        }
        
        if (first == null)
            first = no;
        else
            last.prox = no;
        
        last = no;
        qtdItens++;
        
        return true;
    }

    @Override
    public T remover() {
        if (qtdItens == 0)
            return null;
        
        No aux = first;
        
        first = first.prox;
        
        if (first == null)
            last = null;
        
        qtdItens--;
        
        return aux.item;
    }

    @Override
    public T getItem(int p) {
        if (p < 0 || p >= qtdItens)
            return null;
        
        No aux = first;
        
        while (p > 0) {
            aux = aux.prox;
            p--;
        }
        
        return aux.item;
    }

    @Override
    public boolean contem(T e) {
        return posicao(e) != -1;
    }

    @Override
    public int posicao(T e) {
        No aux = first;
        int p = 0;
        
        while (aux != null) {
            if (e.equals(aux.item))
                return p;
            aux = aux.prox;
            p++;
        }
        
        return -1;
    }

    @Override
    public int quantidade() {
        return qtdItens;
    }

    @Override
    public boolean estaVazia() {
        return qtdItens == 0;
    }

    @Override
    public void removerTodos() {
        No aux;
        
        while (first != null) {
            aux = first;
            first = first.prox;
            aux.item = null;
            aux.prox = null;
        }
        
        last = null;
        qtdItens = 0;
    }
    
    /**
     * Retorna uma string com os itens da fila no formato [e1, e2, e3, ..., en].
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        
        buffer.append("[");
        
        if (first != null) {
            No aux = first;
            
            while (aux.prox != null) {
                buffer.append(aux.item);
                buffer.append(", ");
                aux = aux.prox;
            }

            buffer.append(aux.item);
        }
        
        buffer.append("]");
        
        return buffer.toString();
    }
}
