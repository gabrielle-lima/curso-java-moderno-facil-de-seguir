public class Classe {
    public int calcularSoma(int a, int b) {
        return a + b;
    }

    @Deprecated
    @SuppressWarnings("deprecation")
    public int calcularProduto(int a, int b) {
        return a * b;
    }
}
