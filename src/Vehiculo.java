public class Vehiculo {
    private String modelo;
    private Integer km;
    private Integer año;
    private Integer codInterno;
    private Double tarifaDiaria;

    public Vehiculo(String modelo, Integer km, Integer año, Integer codInterno, Double tarifaDiaria) {
        this.modelo = modelo;
        this.km = km;
        this.año = año;
        this.codInterno = codInterno;
        this.tarifaDiaria = tarifaDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getCodInterno() {
        return codInterno;
    }

    public void setCodInterno(Integer codInterno) {
        this.codInterno = codInterno;
    }

    public Double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(Double tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", km=" + km +
                ", año=" + año +
                ", codInterno=" + codInterno +
                ", tarifaDiaria=" + tarifaDiaria +
                '}';
    }
}
