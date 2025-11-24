public class Funcionario {
    String nome;
    String cargo;
    int idade;

    Funcionario(int idade,String cargo,String nome) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }
  Funcionario(String nome,String cargo, int idade) {

  }
// na sobrecarga o que muda é a ordem ou quantidade de parametros, os metodos tem nomes iguais mas assinaturas diferentes
    Funcionario() {} // sobrecarga do construtor (metodo), mesmo nome mas metodo diferente

    Funcionario(String nome) {
      this.nome = nome;
    }

   public  static void main(String[] args) {
       Funcionario funcionario = new Funcionario("Gabi", "Desenvolvedora", 24);


        System.out.println("Nome:" + funcionario.nome + "    Cargo: " + funcionario.cargo + "  Idade: " + funcionario.idade);
    }

}
