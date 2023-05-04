package org.example.Ejercicio2;

import java.util.List;

public abstract class DispositivoSalida implements Componente {
    private String fabricante;
    private String modelo;
    private double precio;
    private List<Integer> puertosValidos;

    public DispositivoSalida(String fabricante, String modelo, double precio, List<Integer> puertosValidos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.puertosValidos = puertosValidos;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public List<Integer> getPuertosValidos() {
        return puertosValidos;
    }
}


