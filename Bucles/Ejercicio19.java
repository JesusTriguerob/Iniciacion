package boletin5;

import java.util.Scanner;
public class Ejercicio19 {

	  public static void main(String[] args) {
		  	Scanner s=new Scanner (System.in);
	    System.out.print("Por favor, introduzca la altura de la pir�mide: ");
	    int alturaIntroducida = s.nextInt();

	    System.out.print("Introduzca el car�cter de relleno: ");
	    String relleno = s.nextLine();
	    
	    int planta = 1;
	    int longitudDeLinea = 1;
	    int espacios = alturaIntroducida-1;
	    
	    while (planta <= alturaIntroducida) {
	      
	      // inserta espacios
	      for (int i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }

	      // pinta la l�nea
	      for (int i = 1; i <= longitudDeLinea; i++) {
	        System.out.print(relleno);
	      }

	      System.out.println();

	      planta++;
	      espacios--;
	      longitudDeLinea += 2;
	    }
	  }
	}