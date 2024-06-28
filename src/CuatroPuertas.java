public class CuatroPuertas extends Vehiculo{
    public CuatroPuertas(String modelo, Integer km, Integer año, Integer codInterno, Double tarifaDiaria) {
        super(modelo, km, año, codInterno, tarifaDiaria);
    }

    @Override
    public String toString() {
        return "CuatroPuertas{}"+super.toString();
    }
}
