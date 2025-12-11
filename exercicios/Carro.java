public class Carro  implements Veiculo {
    @Override
    public void iniciar() {
        System.out.println("Iniciando carro");
    }

    @Override
    public void parar() {
        System.out.println("Parando carro");
    }

    @Override
    public void buzinar() {
        Veiculo.super.buzinar();
    }


//    private String marcaDoCarro;
//    private String modeloDoCarro;
//    private int anoDoCarro;

//    classesabstratas.Carro() {
//        this.marcaDoCarro = "Desconhecido";
//        this.modeloDoCarro = "Desconhecido";
//        this.anoDoCarro = 0;
//    }  // construtor default
//    classesabstratas.Carro(String marcaDoCarro, String modeloDoCarro) {
//        this.marcaDoCarro = marcaDoCarro;
//        this.modeloDoCarro = modeloDoCarro;
//        anoDoCarro = 0;
//    }
//
//    classesabstratas.Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
//        this.marcaDoCarro = marcaDoCarro;
//        this.modeloDoCarro = modeloDoCarro;
//        this.anoDoCarro = anoDoCarro;
//    }
//
//    public void exibeDetalhes() {
//        System.out.println(" Marca: " + marcaDoCarro + " Modelo: " + modeloDoCarro + " Ano: " + anoDoCarro);
//    }
}
