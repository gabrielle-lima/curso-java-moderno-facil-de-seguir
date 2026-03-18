class Caixa<T> {
    private T elemento;
    private int capacidade;
    private int indice;

    public Caixa(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public T getElemento() {
        return elemento;
    }

    public T setElemento(T elemento) {
        return this.elemento = elemento;
    }

    public void adicionar(T elemento, int indice) {
            this.indice = indice;
            setElemento(elemento);
    }

    public T obter(int indice) {
        Caixa<T> caixa = new Caixa<>(10);
        return  this.elemento;
    }

}


public class CaixaDeLetrasEPrecos {
    public static void main(String[] args) {
        Caixa<Double> caixa = new Caixa<>(2);
        caixa.adicionar(20.50, 1);
        caixa.adicionar(9.00, 2);


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

