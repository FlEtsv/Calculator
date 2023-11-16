package com.project;
import java.util.Scanner;

class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            mostrarInterfaz();
            System.out.println("Seleccione una opción (0 para salir): ");
            opcion = scanner.nextInt();

            if (opcion != 0) {
                System.out.println("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                OperacionesCalculadora calculadora = new OperacionesCalculadora(num1, num2);

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + calculadora.sumar());
                        break;
                    case 2:
                        System.out.println("Resultado: " + calculadora.restar());
                        break;
                    case 3:
                        System.out.println("Resultado: " + calculadora.multiplicar());
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + calculadora.dividir());
                        } else {
                            System.out.println("No es posible dividir por cero.");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }

        } while (opcion != 0);

        System.out.println("¡Calculadora cerrada!");
    }

    private static void mostrarInterfaz() {
        System.out.println("***************************");
        System.out.println("*        CALCULADORA      *");
        System.out.println("***************************");
        System.out.println("* 1. Sumar                *");
        System.out.println("* 2. Restar               *");
        System.out.println("* 3. Multiplicar          *");
        System.out.println("* 4. Dividir              *");
        System.out.println("* 0. Salir                *");
        System.out.println("***************************");
    }
}