package org.example;
// Clase Producto
public class Base {
    private  String nombre;
    private  int numAmbulancias;
    private  double tiempoMedioAsistencia;

    public Base(String nombre, int ambulancias, double tiempoMedioAsistencia) {
        this.nombre = nombre;
        this.numAmbulancias = ambulancias;
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAmbulancias() {
        return numAmbulancias;
    }

    public double getTiempoMedioAsistencia() {
        return tiempoMedioAsistencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAmbulancias(int ambulancias) {
        this.numAmbulancias = ambulancias;
    }
    public void setTiempoMedioAsistencia(double tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }

}



