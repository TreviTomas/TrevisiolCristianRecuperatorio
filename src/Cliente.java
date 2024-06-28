public class Cliente {
    private String nombre;
    private String dni;
    private Boolean licencia;

    public Cliente(String nombre, String dni, Boolean licencia) {
        this.nombre = nombre;
        this.dni = dni;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean getLicencia() {
        return licencia;
    }

    public void setLicencia(Boolean licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", licencia=" + licencia +
                '}';
    }
}
