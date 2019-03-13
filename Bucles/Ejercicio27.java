package boletin5;
//Escribe un programa que muestre, cuente y sume los m�ltiplos de 3 que hay
//entre 1 y un n�mero le�do por teclado.

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		
		   System.out.print("Introduzca un n�mero entero mayor que 1: ");
		    int numeroIntroducido = s.nextInt();

		    int cuenta = 0;
		    int suma = 0;
		    
		    for (int i = 1; i < numeroIntroducido; i++) {
		      if ((i % 3) == 0) {
		        System.out.print(i + " ");
		        cuenta++;
		        suma += i;
		      }
		    }
		        
		    System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay " + cuenta);
		    System.out.println(" m�ltiplos de 3 y suman " + suma);
		  }
		}
