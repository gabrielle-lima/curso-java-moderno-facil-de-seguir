public class VerificadorDeMes {
    public static void main(String[] args) {
        int mes = 11;
        switch(mes) {
            case 1 -> System.out.println("O mês é Janeiro");
            case 2 -> System.out.println("O mês é Fevereiro");
            case 3 -> System.out.println("O mês é Março");
            case 4 -> System.out.println("O mês é Abril");
            case 5 -> System.out.println("O mês é Maio");
            case 6 -> System.out.println("O mês é Junho");
            case 7 -> System.out.println("O mês é Julho");
            case 8 -> System.out.println("O mês é Agosto");
            case 9 -> System.out.println("O mês é Setembro");
            case 10 -> System.out.println("O mês é Outubro");
            case 11 -> System.out.println("O mês é Novembro");
            case 12 -> System.out.println("O mês é Dezembro");
            default -> System.out.println("o mês é inválido");
        }
    }
}
