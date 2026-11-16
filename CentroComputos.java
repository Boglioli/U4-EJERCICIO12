import java.util.ArrayList;
public class CentroComputos {
    private ArrayList<BoletaElectoral> boletas = new ArrayList<>();
    public void agregarBoleta(BoletaElectoral boleta) {
        boletas.add(boleta);
    }
    public void procesarVotos() {
        int total = 0;
        for (BoletaElectoral boleta : boletas) {
            int votos = boleta.contarVoto(100);
            total += votos;
            System.out.println("candidato: " + boleta.nombreCandidato);
            System.out.println("partido: " + boleta.partidoPolitico);
            System.out.println("votos " + votos);
            System.out.println("--------------------");
        }
        System.out.println("total de votos validos " + total);
    }
}
