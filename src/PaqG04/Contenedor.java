package PaqG04;

public class Contenedor {
    int id;
    int peso;
    String pais;
    boolean aduanas;
    int prioridad;
    String descripcion;
    String empresaEnvia;
    String empresaRecibe;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setAduanas(boolean aduanas) {
        this.aduanas=aduanas;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}