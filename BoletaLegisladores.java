public class BoletaLegisladores extends BoletaElectoral {
    public BoletaLegisladores(String nombreCandidato, String partidoPolitico) {
        super(nombreCandidato, partidoPolitico);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        return (int) (cantidadEmitida * 0.90);
    }
}
