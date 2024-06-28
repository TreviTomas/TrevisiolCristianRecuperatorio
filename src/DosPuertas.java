public class DosPuertas extends Vehiculo{
    public DosPuertas(String modelo, Integer km, Integer año, Integer codInterno, Double tarifaDiaria) {
        super(modelo, km, año, codInterno, tarifaDiaria);
    }

    @Override
    public String toString() {
        return "DosPuertas{}"+super.toString();
    }
}
