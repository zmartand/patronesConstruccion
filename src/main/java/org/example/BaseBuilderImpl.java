package org.example;

//Concrete Builder
public class BaseBuilderImpl implements BaseBuilder {
    private String nombre;
    private int numAmbulancias;
    private double tiempoMedioAsistencia;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addAmbulancia(int ambulancias) {
        this.numAmbulancias += ambulancias;
    }

    public void addTiempoMedioAsistencia(double tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = (this.tiempoMedioAsistencia * numAmbulancias + tiempoMedioAsistencia) / (numAmbulancias + 1);
    }

    public Base getResult() {
        return new Base(nombre, numAmbulancias, tiempoMedioAsistencia);
    }
}




