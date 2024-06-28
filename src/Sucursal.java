//NO SE ME OCURRIO COMO IMPLEMENTARLO CON ALQUILER PERDON.
public class Sucursal {
    private String ciudad;
    private String direccion;
    private String numTelefono;

    public Sucursal(String ciudad, String direccion, String numTelefono) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
                '}';
    }
}
