package org.example.Ejercicio2;

import java.util.List;

public class Raton extends DispositivoEntrada {
    private String fabricante;
    private String modelo;
    private double precio;
    private String conector;
    private List<Integer> puertosValidos;

    public Raton(String fabricante, String modelo, double precio, String tipoConector, List<Integer> puertosValidos) {
        super(fabricante, modelo, precio, tipoConector, puertosValidos);
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

    public String getConector() {
        return conector;
    }

    public List<Integer> getPuertosValidos() {
        return puertosValidos;
    }
}
