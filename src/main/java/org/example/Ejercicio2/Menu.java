package org.example.Ejercicio2;

public class Menu {
    public void menu() {
        AbstractFactory componenteFactory = new ComponenteFactory();
        OrdenadorBuilder ordenadorBuilder = new OrdenadorBuilder();

        DispositivoEntrada teclado = componenteFactory.crearDispositivoEntrada("Teclado");
        DispositivoEntrada raton = componenteFactory.crearDispositivoEntrada("Raton");
        DispositivoSalida pantalla = componenteFactory.crearDispositivoSalida("Pantalla");
        DispositivoSalida impresoraLaser = componenteFactory.crearDispositivoSalida("ImpresoraLaser");

        Ordenador ordenador = ordenadorBuilder.addDispositivoEntrada(teclado)
                .addDispositivoEntrada(raton)
                .addDispositivoSalida(pantalla)
                .addDispositivoSalida(impresoraLaser)
                .build();

        System.out.println("Precio total del ordenador: " + ordenador.calcularPrecio());
    }
}
