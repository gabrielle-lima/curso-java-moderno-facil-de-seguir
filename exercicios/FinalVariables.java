public class FinalVariables {

    public final int numeroMaximo = 100;
    public final String mensagem = "Bem-vindo ao mundo da programação!";


    public final void imprimirValoresFinais() {
        System.out.println(mensagem);
        System.out.println(numeroMaximo);
    }

    public static void main(String[] args) {
        FinalVariables f = new FinalVariables();
//        f.numeroMaximo = 10;
//        f.mensagem = "abcde";
//        f.imprimirValoresFinais();
 }

}
