package org.example.Ejercicio2;

public interface AbstractFactory {
    DispositivoEntrada crearDispositivoEntrada(String tipo);
    DispositivoSalida crearDispositivoSalida(String tipo);
}

