public class Aplicacao {
    public static void main(String[] args) {
        Livro livro = new Livro();
        System.out.println(livro);
        Livro livro2 = new Livro("O senhor dos anéis", "J R R Tolkien");
        System.out.println(livro2);
        Livro livro3 = new Livro("Cálculo 1", "James Stewart",2021, 230.40);
        System.out.println(livro3);
    }
}
