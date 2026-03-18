class Cesto<T> {
    private T conteudo;

    public void guardar(T item) {
        this.conteudo = item;
    }

    public T pegar() {
        return conteudo;
    }
}

class Peixe {
 private String nome;
 private int tamanho;

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Peixe(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }
}

class Polvo {
    private String nome;

    private int tentaculos;

    public String getNome() {
        return nome;
    }

    public int getTentaculos() {
        return tentaculos;
    }


    public Polvo(String nome, int tentaculos) {
        this.nome = nome;
        this.tentaculos = tentaculos;
    }
}

public class CestoDePeixesEPolvos {
    public static void main(String[] args) {
        Cesto<Peixe> caixaDePeixes = new Cesto<>();
        Peixe peixe = new Peixe("Pirarucu", 100);

        caixaDePeixes.guardar(peixe);
        System.out.println(peixe.getNome());
        System.out.println(peixe.getTamanho());

        Cesto<Polvo> caixaDePolvo = new Cesto<>();
        Polvo polvo = new Polvo("Cthulhu", 30);
        caixaDePolvo.guardar(polvo);

        System.out.println(polvo.getNome());
        System.out.println(polvo.getTentaculos());

    }
}