public class ProdutoImpl implements Produto{

  public String nome;
  public int quantidade;

    ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ProdutoImpl() {
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
       setQuantidade(getQuantidade() + quantidade);
        System.out.println(quantidade);

    }

    @Override
    public void removerQuantidade(int quantidade) {
        if(quantidade > 0) {
            setQuantidade(getQuantidade() - quantidade);
        } else {
            System.out.println("Estoque pequeno demais");
        }
        System.out.println(quantidade);
    }
}
