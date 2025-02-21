package entities;

import java.util.ArrayList;
import java.util.List;

//Aqui criei uma lista de produtos
public class CarrinhoCompra{
    List <Produto> produtos = new ArrayList<>();

    //Aqui consigo fazer a manipulacao da lista de produtos acima, adicionando, removendo, calculando o tamanho
    public void adicionaProduto(Produto p){
        produtos.add(p);
    }

    public void removeProduto(Produto p){
        produtos.remove(p);
    }

    public int calcularTotal(){
        return produtos.size();
    }
    /*Aqui uma boa brincadeira
    Criei um metodo para listar os produtos da minha lista inicializada la em cima
    Entao inicializei uma variavel do tipo StringBuilder. PQ ?
        -> Melhor performance no momento de percorrer minha lista, no caso um simples string abriria instancias a cada iteracao
        e o Builder cuida para que isso nao ocorra, usando a instancia ja feita, manipula esta mesma.

    Uma observacao.: Quando retorno o toString da classe produto, como eu sobescrevi o toString padrao ele retorna com o meu personalizado hahai, muito massa!!

    */
    public String listarProdutos(){
        StringBuilder lista = new StringBuilder();
        for (Produto p : produtos){
            lista.append(p).append("\n");

        }
        return lista.toString();
    }
    
}
