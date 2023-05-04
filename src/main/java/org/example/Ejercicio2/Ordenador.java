package org.example.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
    private List<DispositivoEntrada> dispositivosEntrada;
    private List<DispositivoSalida> dispositivosSalida;

    public Ordenador() {
        dispositivosEntrada = new ArrayList<>();
        dispositivosSalida = new ArrayList<>();
    }

    public void addDispositivoEntrada(DispositivoEntrada dispositivoEntrada) {
        dispositivosEntrada.add(dispositivoEntrada);
    }

    public void addDispositivoSalida(DispositivoSalida dispositivoSalida) {
        dispositivosSalida.add(dispositivoSalida);
    }

    public void removeDispositivoEntrada(DispositivoEntrada dispositivoEntrada) {
        dispositivosEntrada.remove(dispositivoEntrada);
    }

    public void removeDispositivoSalida(DispositivoSalida dispositivoSalida) {
        dispositivosSalida.remove(dispositivoSalida);
    }

    public double calcularPrecio() {
        double precio = 0;
        for (DispositivoEntrada dispositivoEntrada : dispositivosEntrada) {
            precio += dispositivoEntrada.getPrecio();
        }
        for (DispositivoSalida dispositivoSalida : dispositivosSalida) {
            precio += dispositivoSalida.getPrecio();
        }
        return precio;
    }
}

