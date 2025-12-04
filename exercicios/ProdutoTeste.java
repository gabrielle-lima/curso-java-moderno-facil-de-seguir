public class ProdutoTeste {
    private String nome;
    private double preco;
    private int quantidade;


    public ProdutoTeste(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String exibeInfo() {
        return "Nome: " + nome + " Preco:  " + preco + " Quantidade:  " + quantidade;
    }
}
