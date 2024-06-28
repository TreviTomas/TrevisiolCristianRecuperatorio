public class CalcularCostoImpl implements CalcularCosto {
    @Override
    public double calcularCostoTotal(Alquiler alquiler, double tarifaDiaria, double costoKilometro) {
        double costoDias = alquiler.getDiasAlquilados() * tarifaDiaria;
        double costoKilometros = alquiler.getKmRealizados() * costoKilometro;
        return costoDias + costoKilometros;
    }
}
