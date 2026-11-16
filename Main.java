public class Main {
    public static void main(String[] args) {
        CentroComputos centro = new CentroComputos();
        BoletaElectoral v1 = new BoletaIntendente("franco perez", "partido A");
        BoletaElectoral v2 = new BoletaConcejales("gabriel lopez" , "partido B");
        BoletaElectoral v3 = new BoletaLegisladores("tomi arce" , "partido C");
        centro.agregarBoleta(v1);
        centro.agregarBoleta(v2);
        centro.agregarBoleta(v3);
        centro.procesarVotos();
    }
}
