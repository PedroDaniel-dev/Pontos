package fila;

/**
 * Define as operações básicas da estrutura de dados FILA
 * @param <T> Tipo a ser armazenado na fila
 */
public interface IFila<T> {

    /**
     * Insere o item e no final da fila.
     * 
     * @param e Item a ser inserido.
     * @return Verdadeiro, se a operação foi bem sucedida; ou falso, caso contrário.
     */
    public boolean inserir(T e);

    /**
     * Remove o item do início da fila e o retorna.
     * 
     * @return Item do início da fila; ou null, se a fila estiver vazia.
     */
    public T remover();
    
    /**
     * Retorna o item da posição p da fila.
     * O primeiro item da lista está na posição ZERO.
     * 
     * @param p Posição do item
     * @return Item da posição p; ou null, caso p seja inválido.
     */
    public T getItem(int p);
    
    /**
     * Verifica se a fila contém o item e.
     * 
     * @param e Item a ser buscado.
     * @return Verdadeiro se item e pertence à fila; ou falso, caso contrário.
     */
    public boolean contem(T e);
    
    /**
     * Retorna a primeira posição do item e na fila.
     * 
     * @param e Item a ser buscado.
     * @return Primeira posição do item e na fila; ou -1, se e não pertence à fila.
     */
    public int posicao(T e);
    
    /**
     * Retorna a quantidade de itens da fila.
     * 
     * @return Quantidade de itens da fila
     */
    public int quantidade();

    /**
     * Verifica se a fila está vazia.
     * @return Verdadeiro, se a fila estiver vazia; ou falso, caso contrário 
     */
    public boolean estaVazia();
    
    /**
     * Remove todos os itens da fila.
     */
    public void removerTodos();
}
