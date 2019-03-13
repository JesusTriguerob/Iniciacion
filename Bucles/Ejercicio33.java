package boletin5;

import java.util.Scanner;
public class Ejercicio33 {

	public static void main(String[] args) {
		/*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
		programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
		dos asteriscos menos en la base para simular la curvatura de las esquinas
		inferiores.*/
		
		Scanner s = new Scanner(System.in);
		int base=0;
		int altura=0;
		do {
			System.out.print("introduce la altura de la U: ");
			 altura = s.nextInt();
			 for (int i = 1; i < altura; i++) {
				System.out.println("*        *");
			}
			 for (int i = 1; i>base; i--) {
				 System.out.print(" * * * * ");
				
			}
		} while (altura<base);
	}

}