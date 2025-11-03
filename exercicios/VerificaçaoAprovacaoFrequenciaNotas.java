public class VerificaçaoAprovacaoFrequenciaNotas {
    public static void main(String[] args) {
        double nota1 = 60.0;
        double nota2 = 50.0;
        double frequencia = 30.0;

        double mediaNotas = ((nota1 + nota2) / 2);
        if(mediaNotas >= 7.0 && frequencia >= 75.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
