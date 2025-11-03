public class HospitalSantaClara {
    public static void main(String[] args) {
        int codigoDeSaida =0;
        for(int codigoCarteirinha = 1; codigoCarteirinha < 10; codigoCarteirinha++) {
            if(codigoCarteirinha == codigoDeSaida) {
                break;
            } else if(codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
                System.out.println("Código aceito");
                continue;
            } else {
                System.out.println("Código inválido");
            }


        }
    }
}
