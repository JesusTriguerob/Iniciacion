package Matematicas;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class pruebasfunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
     Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero minimo a mostrar del array");
        int numMin = s.nextInt();
        Thread.sleep(1000);
        System.out.println("Introduce el numero maximo a mostrar del array");
        int numMax = s.nextInt();
        Thread.sleep(1000);
           System.out.println("Introduce el tamaño del array");
        int num = s.nextInt();
        Thread.sleep(1000);
        int[] ej1 = funcionesArrays.arrays.generaArrayInt(numMin, numMax, num);
        System.out.println("El array generado es: ");
        System.out.println("");
     funcionesArrays.arrays.muestraArrayInt(ej1);  
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("minimo: " + funcionesArrays.arrays.minimoArrayInt(ej1));
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("Maximo: " + funcionesArrays.arrays.maximoArrayInt(ej1));
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("Media: " + funcionesArrays.arrays.mediaArrayInt(ej1));
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("Introduce un numero y el programa dirá si esta en el array");
        int numesta = s.nextInt();
        System.out.println(funcionesArrays.arrays.estaEnElArray(ej1, numesta));
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("Introduce un numero del array mostrado y te dira la posicion donde se encuentra ");
        int posnum = s.nextInt();
        System.out.println("Esta en la posicion: " + funcionesArrays.arrays.posicionEnElArray(ej1, posnum));
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("Array volteado");
        for (int n : funcionesArrays.arrays.volteaArrayInt(ej1)) {
            System.out.print(n + " ");
        }
            System.out.println();
            System.out.println("");
            Thread.sleep(1000);
            System.out.println("Array original");
             funcionesArrays.arrays.muestraArrayInt(ej1);
             System.out.println("");
             Thread.sleep(1000);
             System.out.println("¿Cuantas posiciones quieres rotar a la derecha?");
               int der = s.nextInt();
           for (int n : funcionesArrays.arrays.rotaALaDerecha(ej1, der)) {
            System.out.print(n + " ");
        }
            System.out.println();
        System.out.println("");
        Thread.sleep(1000);
System.out.println("¿Cuantas posiciones quieres rotar a la izquierda?");
               int izq = s.nextInt();   
           for (int n : funcionesArrays.arrays.rotaALaIzquierda(ej1, izq)) {
            System.out.print(n + " ");
        }
            System.out.println();
        Thread.sleep(2000);
        System.out.println("Enhorabuena, has conseguido ejecutar todas las variables con exito.");
    }
    
    }

    

