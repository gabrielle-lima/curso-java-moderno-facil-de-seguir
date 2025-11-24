import empresa.dados.Funcionario;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gabi", 6.500);
//        funcionario.aumentarSalario(5.000);
     //   funcionario.alterarQualquerSalario(funcionario, 15000);
        funcionario.aumentarSalario(1000);
        funcionario.obterInfo();

    }
}
