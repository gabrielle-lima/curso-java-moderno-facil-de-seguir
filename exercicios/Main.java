public class Main {
    public static void main(String[] args) {
//    classesabstratas.Carro carro = new classesabstratas.Carro();
//    carro.iniciar();
//    carro.buzinar();
//    classesabstratas.Caminhao caminhao = new classesabstratas.Caminhao();
//    caminhao.iniciar();
//    caminhao.buzinar();
//
    Pedido pedido = new Pedido();
    pedido.adicionarItem("HAMBURGUER COM BACON", 12.00);
    pedido.adicionarItem("COCA COLA", 15.00);
    pedido.calcularTotal();
    }
}
