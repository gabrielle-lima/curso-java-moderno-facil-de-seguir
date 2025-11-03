public class DiasNoMes {
    public static void main(String[] args) {
     String mes = "Abril";
     String totalDiasNoMes = switch(mes) {
         case "Janeiro",
              "Março",
              "Maio",
              "Julho",
              "Agosto",
              "Outubro",
              "Dezembro" -> "O total de dias é 31";
         case "Abril",
              "Junho",
              "Setembro",
              "Novembro" -> "O total de dias é 30";
         case "Fevereiro" -> "O total de dias é 28";
         default -> "Mês desconhecido";
     };
        System.out.println(totalDiasNoMes);
    }
}
