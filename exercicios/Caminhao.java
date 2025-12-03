public class Caminhao implements Veiculo{


    @Override
    public void iniciar() {
        System.out.println("Iniciando caminhão");
    }

    @Override
    public void parar() {
        System.out.println("Parando caminhão");
    }

    @Override
    public void buzinar() {
        Veiculo.super.buzinar();
    }
}
