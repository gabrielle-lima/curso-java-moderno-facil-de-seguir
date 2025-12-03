public class CalculadoraCientifica extends Calculadora{

//    public int somar(int b, int a) {
//        return a + b;
//    }

    public static void main(String[] args) {
        CalculadoraCientifica c = new CalculadoraCientifica();
       double result = c.somar(1,2);
        System.out.println(result);
    }
}
