package org.example.Ejercicio1;


public class Demo {
    public void demo() {
        BaseBuilderImpl baseBuilder = new BaseBuilderImpl();
        baseBuilder.setNombre("Villanueva de la Cañada");
        baseBuilder.addAmbulancia(1);
        baseBuilder.addTiempoMedioAsistencia(10.5);
        baseBuilder.addAmbulancia(2);
        baseBuilder.addTiempoMedioAsistencia(15.3);

        Base base = baseBuilder.getResult();
        System.out.println("Base: " + base.getNombre());
        System.out.println("Ambulancias: " + base.getAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + base.getTiempoMedioAsistencia());
    }
}

