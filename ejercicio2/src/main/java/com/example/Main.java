package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 10;
        int max = 20;
        int amplitud = max - min;
        var numeroAleatorio = Math.random();
        int NumeroFinal= (int) (numeroAleatorio * amplitud) + min;
        int intentos = 5;
        int resultado;

        do {
            System.out.println("Elige un numero entero entre 10 y 20");
            resultado = input.nextInt();

         if (resultado < NumeroFinal){
            System.out.println("Fallaste, tu numero es inferior al numero aleatorio");
            intentos--;
        } else if (resultado > NumeroFinal){
            System.out.println("Fallaste, tu numero es mayor al numero aleatorio");
            intentos--;
        } if (intentos == 0){
            System.out.println("perdiste, te has quedado sin intentos, el numero era "+NumeroFinal);
            break;
        } if (resultado == NumeroFinal){
            System.out.println("Felicitaciones! " +resultado +" es el numero correcto!");
            break;
        }
     } while(intentos != 0);


        
    }
}