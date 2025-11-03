public class SomaDeValoresAcumulados {
    public static void main(String[] args) {
       int soma = 0;
       for(int i = 0; i <= 10;i++) {
           i += soma;
           System.out.println(i);
       }
        System.out.println(soma);

    }
}
