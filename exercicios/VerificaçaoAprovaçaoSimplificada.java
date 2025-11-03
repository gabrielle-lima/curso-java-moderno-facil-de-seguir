public class VerificaçaoAprovaçaoSimplificada {
    public static void main(String[] args) {
        double nota1 = 2.0;
        double nota2 = 10.0;
        double mediaNotas = ((nota1 + nota2) / 2);
        if(mediaNotas >= 6.0) {
            System.out.println("Aprovado");
            
        } else {
            System.out.println("Reprovado");
        }
    }
}
