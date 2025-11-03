public class VerificacaoNumeroPar {
    public static void main(String[] args) {
        int numero = 10;

        String resultado = ((numero % 2) == 0) ? "Par" : "Número é impar";
        System.out.println(resultado);

    }
}
