package com.ciceonline.polimorfismo;

import com.ciceonline.interfaces.InterfazFamilia;

public class Padre implements InterfazFamilia {

    @Override
    public String saludar(){
        return "Hola Hijo";
    }
}
