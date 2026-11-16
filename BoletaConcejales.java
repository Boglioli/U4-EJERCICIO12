public class BoletaConcejales extends BoletaElectoral {
    public BoletaConcejales(String nombreCandidato, String partidoPolitico) {
        super(nombreCandidato, partidoPolitico);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        return (int) (cantidadEmitida * 0.60);
    }
}