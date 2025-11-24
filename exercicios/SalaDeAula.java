public class SalaDeAula {
    static int totalAlunos = 0;

   public SalaDeAula() {}

   public  static void adicionarAlunos() {
        totalAlunos++;
    }
    public static void mostrarTotalAlunos() {
        System.out.println("Total alunos:  " + totalAlunos);
    }
}
