class Caixa<T> {
    private T[] elementos;
    private int capacidade;

    @SuppressWarnings("unchecked")
    public Caixa(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = (T[]) new Object[capacidade];
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void adicionar(T elemento, int indice) {
        if (indice >= 0 && indice < capacidade) {
            this.elementos[indice] = elemento;
        }
    }

    public T obter(int indice) {
        if (indice >= 0 && indice < capacidade) {
            return this.elementos[indice];
        }
        return null;
    }

}


public class CaixaDeLetrasEPrecos {
    public static void main(String[] args) {
        Caixa<Double> caixa = new Caixa<>(2);
        caixa.adicionar(20.50, 0);
        caixa.adicionar(9.00, 1);


        System.out.println(caixa.obter(0));
        System.out.println(caixa.obter(1));
//        System.out.println(caixa.obter(2));
//        System.out.println(caixa.obter(3));
//        System.out.println(caixa.obter(4));
//        System.out.println(caixa.obter(5));



        Caixa<Character> caixaCaracteres = new Caixa<>(2);
        caixaCaracteres.adicionar('a', 0);
        caixaCaracteres.adicionar('b', 1);



        System.out.println(caixaCaracteres.obter(0));
        System.out.println(caixaCaracteres.obter(1));
//        System.out.println(caixaCaracteres.obter(2));
//        System.out.println(caixaCaracteres.obter(3));
//        System.out.println(caixaCaracteres.obter(4));






    }
}

