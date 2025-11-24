public class Personagem {
    String nome;
    int nivelDePoder;
    String classe;

    Personagem(String nome, int nivelDePoder, String classe) {
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
        this.classe = classe;
    }


    public void tentarAumentarNivelDePoder(int nivelDePoder) {
      nivelDePoder += 10;
    }

    public void alterarClasseENome(String novaClasse, String novoNome) {
        this.classe = novaClasse;
        this.nome = novoNome;
    }

    public void realmenteAumentaNivelDePoder(int novoNivelDePoder) {
        nivelDePoder *= novoNivelDePoder;
    }
}
