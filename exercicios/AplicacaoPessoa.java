public class AplicacaoPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setIdade(21);
        p.nome = "Gabrielle";
        System.out.println(p.nome);
        System.out.println(p.getIdade());
    }
}
