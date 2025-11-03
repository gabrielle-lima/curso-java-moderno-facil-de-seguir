public class CalculadoraSimples {
    public static void main(String[] args) {
        int a = 500;
        int b = 6;

        int operacaoSoma = a + b;
        int operacaoSubtracao = a - b;
        int operacaoMultiplicacao = a * b;
        double operacaoDivisao = (double) a / b;
        int modulo = a % b;

        System.out.println(operacaoSoma);
        System.out.println(operacaoSubtracao);
        System.out.println(operacaoMultiplicacao);
        System.out.println(operacaoDivisao);
        System.out.println(modulo);
    }

}
