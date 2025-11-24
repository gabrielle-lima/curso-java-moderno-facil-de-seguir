package poo;

public class Funcionario {



     public String nome;
     public  double salario;

    public void addAumento(double valor) {
        salario += valor;
    }

    public void ganhoAnual() {
        salario *= 12;
    }
}
