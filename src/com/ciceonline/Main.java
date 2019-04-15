package com.ciceonline;

import com.ciceonline.impl.ClaseImplemetacion;
import com.ciceonline.interfaces.InterfazFamilia;
import com.ciceonline.interfaces.InterfazJava8;
import com.ciceonline.polimorfismo.Hijo;
import com.ciceonline.polimorfismo.Padre;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        InterfazJava8 java8 = (n, a) -> (n + " " + a);
        System.out.println(java8.metodoAbstracto("gustavo", "gamboa"));
        java8 = (n,a) -> (a + ", " + n);
        System.out.println(java8.metodoAbstracto("gustavo", "gamboa"));
        java8 = (n,a) -> (null);

        Padre papa = new Hijo();
        papa = new Padre();
        papa.saludar();

        InterfazFamilia familia = new Hijo();

    }
}
