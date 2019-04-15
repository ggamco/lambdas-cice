package com.ciceonline.interfaces;

@FunctionalInterface
public interface InterfazJava8 {

    String metodoAbstracto(String nombre, String apellido);

    default String metodoDefault(String nombre){
        return nombre;
    }

}
