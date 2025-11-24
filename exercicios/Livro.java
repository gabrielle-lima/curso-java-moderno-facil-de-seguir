public class Livro {

    public String titulo;
    private String autor;
    protected int anoDePublicacao;
    double preco;


    Livro() {
    this.titulo = "Desconhecido";
    this.autor = "Desconhecido";
    this.anoDePublicacao = 0;
    this.preco = 0.0;
    }
    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    Livro(String titulo, String autor, int anoDePublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDePublicacao=" + anoDePublicacao +
                ", preco=" + preco +
                '}';
    }
}
