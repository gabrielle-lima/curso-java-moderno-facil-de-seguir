public class NotaDosAlunos {
    public static void main(String[] args) {
        double[] notas = new double[5];
        notas[0] = 76.0;
        notas[1] = 80.0;
        notas[2] = 90.0;
        notas[3] = 100.0;
        notas[4]=  30.0;

        for(int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
    }
}
