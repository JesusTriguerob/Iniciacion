package boletin5;

import java.util.Scanner;

public class Ejercicio16 {

	  public static void main(String[] args) {
	            Scanner s=new Scanner (System.in);
	    System.out.print("Introduzca un n�mero entero y le dir� si es primo: ");
	    int numeroIntroducido = s.nextInt();

	    boolean esPrimo = true;
	    
	    for (int i = 2; i < numeroIntroducido; i++) {
	      if ((numeroIntroducido % i) == 0) {
	        esPrimo = false;
	      }
	    }
	        
	    if (esPrimo) {
	      System.out.println("El n�mero introducido es primo.");
	    } else {
	      System.out.println("El n�mero introducido no es primo.");
	    }

	  }
	}