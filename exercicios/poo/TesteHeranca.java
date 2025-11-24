package poo;

public class TesteHeranca {
    public static void main(String[] args) {
        Assistente assistente = new Assistente();
        assistente.nome = "Teste";
        assistente.salario = 3000;

        assistente.addAumento(500);
        System.out.println(assistente.nome);
        System.out.println(assistente.salario);

    }
}
