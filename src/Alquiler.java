public class Alquiler {
    private String fechaInicio;
    private String fechaFinal;
    private Integer diasAlquilados;
    private Integer kmRealizados;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Alquiler(String fechaInicio, String fechaFinal, Integer diasAlquilados, Integer kmRealizados, Cliente cliente, Vehiculo vehiculo) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.diasAlquilados = diasAlquilados;
        this.kmRealizados = kmRealizados;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Integer getDiasAlquilados() {
        return diasAlquilados;
    }

    public void setDiasAlquilados(Integer diasAlquilados) {
        this.diasAlquilados = diasAlquilados;
    }

    public Integer getKmRealizados() {
        return kmRealizados;
    }

    public void setKmRealizados(Integer kmRealizados) {
        this.kmRealizados = kmRealizados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "fechaInicio='" + fechaInicio + '\'' +
                ", fechaFinal='" + fechaFinal + '\'' +
                ", diasAlquilados=" + diasAlquilados +
                ", kmRealizados=" + kmRealizados +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
