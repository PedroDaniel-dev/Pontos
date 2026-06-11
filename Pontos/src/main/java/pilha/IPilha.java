package pilha;

/**
 * Define as operações básicas da estrutura de dados PILHA
 * @param <T> Tipo a ser armazenado na pilha
 */
public interface IPilha<T> {

    /**
     * Insere o item e no topo da pilha.
     * 
     * @param e Item a ser inserido.
     * @return Verdadeiro, se a operação foi bem sucedida; ou falso, caso contrário.
     */
    public boolean push(T e);

    /**
     * Remove o item do topo da pilha e o retorna.
     * 
     * @return Item do topo da pilha; ou null, se a pilha estiver vazia.
     */
    public T pop();
    
    /**
     * Retorna o item do topo da pilha sem removê-lo.
     * 
     * @return Item do topo da pilha; ou null, se a pilha estiver vazia.
     */
    public T peek();
    
    /**
     * Retorna a quantidade de itens da pilha.
     * 
     * @return Quantidade de itens da pilha
     */
    public int quantidade();

    /**
     * Verifica se a pilha está vazia.
     * @return Verdadeiro, se a pilha estiver vazia; ou falso, caso contrário 
     */
    public boolean estaVazia();
    
    /**
     * Remove todos os itens da pilha.
     */
    public void removerTodos();
}
