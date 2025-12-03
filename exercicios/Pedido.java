public class Pedido implements PedidoRestaurante{

    public String item;
    public double valor;

    public Pedido() {
    }

    public Pedido(String item, double valor) {
        this.item = item;
        this.valor = valor;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void adicionarItem(String item, double preco) {
        Pedido pedido = new Pedido(item, preco);
        System.out.println("" + pedido.getItem());
        System.out.println("R$" + pedido.getValor());
        double valorTotal = valor += preco;
        System.out.println("R$" + valorTotal);

    }

    @Override
    public void calcularTotal() {
        System.out.println("O total é: R$" + this.valor );

    }



}
