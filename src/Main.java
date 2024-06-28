import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new DosPuertas("mercedes", 100, 2020, 1, 500.0);
        Vehiculo vehiculo2 = new CuatroPuertas("reno", 200, 2019, 2, 700.0);
        Vehiculo vehiculo3 = new Camioneta("volwawen", 300, 2021, 3, 1000.0);

        Cliente cliente1 = new Cliente("Cliente1", "12345678", true);
        Cliente cliente2 = new Cliente("Cliente2", "11111111", true);

        List<Alquiler> alquileres = new ArrayList<>();

        Alquiler alquiler1 = new Alquiler("01-01-2024", "11-01-2024", 10, 500, cliente1, vehiculo1);
        Alquiler alquiler2 = new Alquiler("01-01-2024", "16-01-2024", 15, 700, cliente2, vehiculo2);
        Alquiler alquiler3 = new Alquiler("01-01-2024", "06-01-2024", 5, 300, cliente1, vehiculo3);

        alquileres.add(alquiler1);
        alquileres.add(alquiler2);
        alquileres.add(alquiler3);

        CalcularCosto calcularCosto = new CalcularCostoImpl();
        double costoKilometro = 50.0;

        System.out.println("Alquileres realizados:");
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
            double costoTotal = calcularCosto.calcularCostoTotal(alquiler, alquiler.getVehiculo().getTarifaDiaria(), costoKilometro);
            System.out.println("Costo Total: $" + costoTotal);
        }

        Alquiler alquilerMayorCosto = null;
        double mayorCosto = 0.0;

        for (Alquiler alquiler : alquileres) {
            double costoTotal = calcularCosto.calcularCostoTotal(alquiler, alquiler.getVehiculo().getTarifaDiaria(), costoKilometro);
            if (costoTotal > mayorCosto) {
                mayorCosto = costoTotal;
                alquilerMayorCosto = alquiler;
            }
        }
        if (alquilerMayorCosto != null) {
            System.out.println("Alquiler con el mayor costo:");
            System.out.println("Costo Total Mayor: $" + mayorCosto+" perteneciente a la siguiente transaccion: "+ alquilerMayorCosto);
        }

    }
}
