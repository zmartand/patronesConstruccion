package org.example.Ejercicio2;

import java.util.ArrayList;

public class Pantalla extends DispositivoSalida {
    private String fabricante;
    private String modelo;
    private double precio;

    public Pantalla(String fabricante, String modelo, double precio) {
        super(fabricante, modelo, precio, new ArrayList<Integer>());
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}