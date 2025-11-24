package empresa.dados;

public class Funcionario {
   public  String nome;
   public  double salario;



    public Funcionario(String nome, double salario) {
        this.nome =  nome;
        this.salario = salario;
    }

    public void obterInfo() {
        System.out.println(nome + "\n" + salario);
    }
    public void aumentarSalario(double aumento) {
       aumento += 1000; // passagem por valor primitivo não reflete pois é uma cópia
    }

    public void alterarQualquerSalario(Funcionario func, double novoSalario) {
        func.salario = novoSalario;
    }

    public void aumentarSalario(int porcentagem) {
        salario += salario * porcentagem / 100.0; // equivale a salario = salario + salario * porcentagem / 100.0;
    }


}
