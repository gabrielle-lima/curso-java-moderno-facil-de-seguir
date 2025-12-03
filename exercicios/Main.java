public class Main {
    public static void main(String[] args) {
//    Carro carro = new Carro();
//    carro.iniciar();
//    carro.buzinar();
//    Caminhao caminhao = new Caminhao();
//    caminhao.iniciar();
//    caminhao.buzinar();
//
    Pedido pedido = new Pedido();
    pedido.adicionarItem("HAMBURGUER COM BACON", 12.00);
    pedido.adicionarItem("COCA COLA", 15.00);
    pedido.calcularTotal();
    }
}
