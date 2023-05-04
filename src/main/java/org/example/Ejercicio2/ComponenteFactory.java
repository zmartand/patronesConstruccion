package org.example.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class ComponenteFactory implements AbstractFactory {

    @Override
    public DispositivoEntrada crearDispositivoEntrada(String tipo) {
        DispositivoEntrada dispositivoEntrada = null;

        if (tipo.equalsIgnoreCase("Teclado")) {
            dispositivoEntrada = new Teclado("FabricanteX", "ModeloY", 50.0, "USB", new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        } else if (tipo.equalsIgnoreCase("Raton")) {
            dispositivoEntrada = new Raton("FabricanteA", "ModeloB", 30.0, "USB", new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        } else if (tipo.equalsIgnoreCase("TabletaGrafica")) {
            dispositivoEntrada = new TabletaGrafica("FabricanteC", "ModeloD", 100.0, "USB", new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        }

        return dispositivoEntrada;
    }

    @Override
    public DispositivoSalida crearDispositivoSalida(String tipo) {
        DispositivoSalida dispositivoSalida = null;

        if (tipo.equalsIgnoreCase("Pantalla")) {
            dispositivoSalida = new Pantalla("FabricanteE", "ModeloF", 200.0);
        } else if (tipo.equalsIgnoreCase("ImpresoraLaser")) {
            dispositivoSalida = new ImpresoraLaser("HP", "LaserJet Pro", 200.0, "Toner X", 100, Arrays.asList(1, 2, 3));
        }

        return dispositivoSalida;
    }
}

