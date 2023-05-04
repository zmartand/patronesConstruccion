package org.example;
//Clase Abstract Builder
public abstract class BaseBuilder {
   protected  Base base;
   public Base getBase(){
       return base;
   }
    public void crearBase(){
         base = new Base();
    }
public abstract BaseBuilder setNombre(String nombre);
public abstract BaseBuilder setNumAmbulancias(int numAmbulancias);
public abstract BaseBuilder setTiempoMedioAsistencia(int tiempoMedioAsistencia);

}

