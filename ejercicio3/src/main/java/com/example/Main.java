package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("ingrese la base del triangulo");
        int baseTriangulo = scanner.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        int alturaTriangulo = scanner.nextInt();
        int areaTriangulo = (baseTriangulo * alturaTriangulo / 2);
        System.out.println("el area de tu triangulo es " +areaTriangulo);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("ingrese el lado del cuadrado");
        int ladoCuadrado = scanner.nextInt();
        int areaCuadrado = (ladoCuadrado * ladoCuadrado);
        System.out.println("el Area de tu cuadrado es de "+areaCuadrado);
       
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("ingrese la base del rectangulo");
        int baseRectangulo = scanner.nextInt();
        System.out.println("ingrese la altura de su rectangulo");
        int alturaRectangulo = scanner.nextInt();
        int areaRectangulo = (baseRectangulo * alturaRectangulo);
        System.out.println("el area de tu Rectangulo es "+areaRectangulo);
    }

    private static void calcularCirculo(Scanner scanner) {
       System.out.println("ingrese el radio de tu circulo");
       int radioCirculo = scanner.nextInt();
       var PI =  Math.PI;
       double areaCirculo = (radioCirculo * PI);
       System.out.println("el area de tu Circulo es "+areaCirculo);
    }
 
}