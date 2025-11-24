public class Carro {
    private String marcaDoCarro;
    private String modeloDoCarro;
    private int anoDoCarro;

    Carro() {
        this.marcaDoCarro = "Desconhecido";
        this.modeloDoCarro = "Desconhecido";
        this.anoDoCarro = 0;
    }  // construtor default
    Carro(String marcaDoCarro, String modeloDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        anoDoCarro = 0;
    }

    Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }

    public void exibeDetalhes() {
        System.out.println(" Marca: " + marcaDoCarro + " Modelo: " + modeloDoCarro + " Ano: " + anoDoCarro);
    }
}
