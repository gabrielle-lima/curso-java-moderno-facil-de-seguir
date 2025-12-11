public class TesteLoja {
    public static void main(String[] args) {
        LojaComercial lojaComercial = new LojaComercial("LOJA DA BOLINHA", "123456789");
        lojaComercial.abrir();
        System.out.println("A loja está aberta? " + lojaComercial.aberta);
        lojaComercial.fechar();
        System.out.println("A loja está fechada?  " + lojaComercial.aberta);
    }
}
