package org.example.Ejercicio2;

public class OrdenadorBuilder {
    private Ordenador ordenador;

    public OrdenadorBuilder() {
        ordenador = new Ordenador();
    }

    public OrdenadorBuilder addDispositivoEntrada(DispositivoEntrada dispositivoEntrada) {
        ordenador.addDispositivoEntrada(dispositivoEntrada);
        return this;
    }

    public OrdenadorBuilder addDispositivoSalida(DispositivoSalida dispositivoSalida) {
        ordenador.addDispositivoSalida(dispositivoSalida);
        return this;
    }

    public Ordenador build() {
        return ordenador;
    }
}
