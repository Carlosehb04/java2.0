package com.devprojects;

import java.util.Scanner;

/**
 * Hello world!
 */
public class SumaPromedioFor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);


        int n;
        int suma = 0;
        double promedio;
        int numeroTotal;
    

        System.out.println("Ingrese el numero a sumar y sacar promedio");
        numeroTotal = teclado.nextInt();


        for(int i = 0; i < numeroTotal; i++){
            System.out.println("Ingrese el numero " +  (i + 1));
            n = teclado.nextInt();
            suma = suma + n;
        }

        promedio = suma / numeroTotal;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
