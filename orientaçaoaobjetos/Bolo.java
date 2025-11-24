public class Bolo {

    int quantidadeDeAcucar; // valor default de variavel numerica primitiva é 0

    public static void main(String[] args) {
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantidadeDeAcucar = 200;

         Bolo boloDeBaunilha = new Bolo();
         boloDeBaunilha.quantidadeDeAcucar = 150;

        System.out.println("Quantidade de açúcar no bolo de chocolate: " + boloDeChocolate.quantidadeDeAcucar + "g");
        System.out.println("Quantidade de açúcar no bolo de baunilha:  " + boloDeBaunilha.quantidadeDeAcucar + "g");

	}
}