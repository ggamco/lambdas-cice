package com.ciceonline.impl;

import com.ciceonline.interfaces.InterfazJava8;

public class ClaseImplemetacion implements InterfazJava8 {

    @Override
    public String metodoAbstracto(String nombre, String apellido) {
        return nombre + " " + apellido;
    }
}
