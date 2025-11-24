package poo;

public class Estudante extends Pessoa{

    String matricula;

    public Estudante(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
}
