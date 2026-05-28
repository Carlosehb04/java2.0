package com.devprojects;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class TriangulosSuperficie 
{
    public static void main( String[] args ){

        Scanner tecaldo = new Scanner(System.in);
  

        int n;
        int contador;

        float base;
        float altura;
        float superficie;

        System.out.print("Introduzca el número de triángulos: ");
        n = tecaldo.nextInt();

        for(contador = 1; contador <= n; contador++){
            System.out.print("Introduzca la base del triángulo " + contador + ": ");
            base = tecaldo.nextFloat();
            System.out.print("Introduzca la altura del triángulo " + contador + ": ");
            altura = tecaldo.nextFloat();
            superficie = (base * altura) / 2;
            System.out.println("La superficie del triángulo " + contador + " es: " + superficie);
        }


    }
  
}
