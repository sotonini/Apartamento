package org.example.MODELOS;

public class Apartamento {

    private String ubicacioin;
    private Integer tamaño;
    private String iluminacionNatural;
    private String acabados;
    private String amenidades;
    private double costo;
    private String condicionesGenerales;

    public Apartamento() {
    }

    public Apartamento(String ubicacioin, Integer tamaño, String iluminacionNatural, String acabados, String amenidades, double costo, String condicionesGenerales) {
        this.ubicacioin = ubicacioin;
        this.tamaño = tamaño;
        this.iluminacionNatural = iluminacionNatural;
        this.acabados = acabados;
        this.amenidades = amenidades;
        this.costo = costo;
        this.condicionesGenerales = condicionesGenerales;
    }

    public String getUbicacioin() {
        return ubicacioin;
    }

    public void setUbicacioin(String ubicacioin) {
        this.ubicacioin = ubicacioin;
    }

    public Integer getTamaño() {
        return tamaño;
    }

    public void setTamaño(Integer tamaño) {
        this.tamaño = tamaño;
    }

    public String getIluminacionNatural() {
        return iluminacionNatural;
    }

    public void setIluminacionNatural(String iluminacionNatural) {
        this.iluminacionNatural = iluminacionNatural;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }

    public String getAmenidades() {
        return amenidades;
    }

    public void setAmenidades(String amenidades) {
        this.amenidades = amenidades;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCondicionesGenerales() {
        return condicionesGenerales;
    }

    public void setCondicionesGenerales(String condicionesGenerales) {
        this.condicionesGenerales = condicionesGenerales;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "ubicacioin='" + ubicacioin + '\'' +
                ", tamaño=" + tamaño +
                ", iluminacionNatural='" + iluminacionNatural + '\'' +
                ", acabados='" + acabados + '\'' +
                ", amenidades='" + amenidades + '\'' +
                ", costo=" + costo +
                ", condicionesGenerales='" + condicionesGenerales + '\'' +
                '}';
    }
}
