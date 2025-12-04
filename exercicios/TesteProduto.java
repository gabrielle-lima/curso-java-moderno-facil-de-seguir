
public class TesteProduto {
    public static void main(String[] args) {
//        Produto produto = new Produto("Abrobrinha", 15.00, 2);
//        System.out.println(produto.exibeInfo());
        ProdutoImpl produto = new ProdutoImpl();
        produto.setNome("TESTE ABC");
        produto.setQuantidade(10);
        produto.adicionarQuantidade(10);
        System.out.println(produto.getQuantidade());
        ProdutoImpl produto2 = new ProdutoImpl("BOLINHA", 10);
        produto2.removerQuantidade(5);
        System.out.println(produto2.getQuantidade());
    }
}
