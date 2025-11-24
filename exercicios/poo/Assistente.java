package poo;

public class Assistente extends Funcionario {

    @Override
    public void ganhoAnual() {
        Funcionario f = new Funcionario();
        f.addAumento(1000);
        super.ganhoAnual();
    }
}

