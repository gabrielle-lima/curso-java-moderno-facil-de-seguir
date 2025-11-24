import java.util.Random;

public class SomaDeNumeros {
    public static void main(String[] args) {
        int[] numeros = new int[1000];
        Random random = new Random();
        int soma = 0;
        for(int i = 1; i < numeros.length; i++) {
           numeros[i] = random.nextInt(1000);
//            System.out.println(numeros[i]);
            int numero = numeros[i];
            soma += numero;
            System.out.println(numero);
        }
    }
}
