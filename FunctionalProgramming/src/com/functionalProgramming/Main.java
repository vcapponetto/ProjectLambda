package com.functionalProgramming;

import com.functionalProgramming.Ejercicio1Intro.FunctionTest;
import com.functionalProgramming.Ejercicio2Lambdas.Messages;
import com.functionalProgramming.Ejercicio2Lambdas.Operations;
import com.functionalProgramming.Ejercicio2Lambdas.RestaNros;
import com.functionalProgramming.Ejercicio2Lambdas.Warnings;

public class Main {
    public static void main(String[] args) {

        //--Una forma de utlizar lambdas
        Operations op = ((num1, num2) -> System.out.println("la suma es: " + (num1+num2)));
        op.imprimeSuma(15,30);

        FunctionTest ft = () -> System.out.println("Hola Mundo");
        ft.saludar();

        //--Otra forma de utilizar la interfaz funcional con lambdas en métodos
        Main obj = new Main();
        obj.MiObject(ft);

        //--With 2 params
        Messages msg = (name1, name2) -> {
            System.out.println("-Con 2 parámetros y más de una línea de código en la implementación");
            System.out.println("Names : " + name1 + ", "+name2);
        };
        msg.showNames("Cosme","Fulanito");

        //--without params
        Warnings warning = () -> System.out.println("Warning !!");
        warning.warningMsg();

        //--returning a value
        RestaNros resta = ((num1, num2) -> num1 - num2);
        System.out.println("La resta es: " + resta.resta(5,2));



    }

    public void MiObject (FunctionTest functionTest) {
        functionTest.saludar();
    }


}
