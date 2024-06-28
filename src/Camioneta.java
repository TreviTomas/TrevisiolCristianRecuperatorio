public class Camioneta extends Vehiculo{
    public Camioneta(String modelo, Integer km, Integer año, Integer codInterno, Double tarifaDiaria) {
        super(modelo, km, año, codInterno, tarifaDiaria);
    }

    @Override
    public String toString() {
        return "Camioneta{}"+super.toString();
    }
}
