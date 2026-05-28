package com.devprojects;

import java.util.Scanner;

public class SerieIncremental 
{
    public static void main( String[] args ){
       
        Scanner tecaldo = new Scanner(System.in);
 

        int contador = 1;

        while(contador <= 25){
            System.out.println(contador * 11);
         contador++;
        }

    }
}
