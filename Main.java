import entities.CarrinhoCompra;
import entities.Categoria;
import entities.Produto;

public class Main {
    public static void main(String[] args) {

        Produto  produto1 = new Produto("Arroz", 45, Categoria.ALIMENTO);
        Produto  produto2 = new Produto();
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();

        produto2.setNome("Sapato");
        produto2.setPreco(299.90);
        produto2.setCategoria(Categoria.VESTUARIO);

        carrinhoCompra.adicionaProduto(produto2);
        carrinhoCompra.adicionaProduto(produto1);

        System.out.println(carrinhoCompra.listarProdutos());






    }
}