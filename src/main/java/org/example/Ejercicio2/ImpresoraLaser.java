package org.example.Ejercicio2;

import java.util.List;

public class ImpresoraLaser extends DispositivoSalida {
    private String fabricante;
    private String modelo;
    private double precio;
    private String tipoCartucho;
    private int numPaginas;

    public ImpresoraLaser(String fabricante, String modelo, double precio, String tipoCartucho, int numPaginas, List<Integer> puertosValidos) {
        super(fabricante, modelo, precio, puertosValidos);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoCartucho = tipoCartucho;
        this.numPaginas = numPaginas;
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

    public String getTipoCartucho() {
        return tipoCartucho;
    }

}
