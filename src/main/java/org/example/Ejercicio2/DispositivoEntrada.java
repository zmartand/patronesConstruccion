package org.example.Ejercicio2;

import java.util.List;

public abstract class DispositivoEntrada implements Componente {
    private String fabricante;
    private String modelo;
    private double precio;
    private String tipoConector;
    private List<Integer> puertosValidos;

    public DispositivoEntrada(String fabricante, String modelo, double precio, String tipoConector, List<Integer> puertosValidos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoConector = tipoConector;
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

    public String getTipoConector() {
        return tipoConector;
    }

    public List<Integer> getPuertosValidos() {
        return puertosValidos;
    }
}

