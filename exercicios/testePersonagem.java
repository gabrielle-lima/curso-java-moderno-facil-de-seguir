public class testePersonagem {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Gabi", 100, "Mago");
        personagem.tentarAumentarNivelDePoder(10);
        System.out.println(personagem.nivelDePoder);
        System.out.println(personagem.nome);
        System.out.println(personagem.classe);
        personagem.alterarClasseENome("Paladino", "Gabizinha");
        System.out.println(personagem.nome);
        System.out.println(personagem.classe);
        personagem.realmenteAumentaNivelDePoder(10000000);
        System.out.println(personagem.nivelDePoder);
    }
}
