package com.project;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> listaNumero = new ArrayList<>();
        System.out.println("hola bienvenido a mi calculadora");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);
        System.out.println("Dime que operacion quieres realizar");
        //pedida de operacion
        String operacion = sc.nextLine();
        if (operacion.equalsIgnoreCase("suma")){
            while (true){
                    System.out.println("*");
            }
        }if(operacion.equalsIgnoreCase("resta")){
            System.out.println("esto es una resta");
        }if(operacion.equalsIgnoreCase("multiplicacion")){
            System.out.println("Esto es una multiplicacion");
        }if (operacion.equalsIgnoreCase("division")){
            System.out.println("esto es una division");
        }else{
            System.out.println("operacion no reconocida");
        }





    }
}