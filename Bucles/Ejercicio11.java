package boletin5;
//*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
//*los 5 primeros números enteros a partir de uno que se introduce por teclado.

import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
	
			System.out.println("Escribe un numero en el que a partir de este, se realizaran los calculos de los siguientes 5");
			int n = s.nextInt();
			int cincoVeces = 7;
				while ( cincoVeces >1) {
				System.out.println("Numero /t/t Cuadrado /t/t Cubo");
				System.out.println(n + "/t/t" +(n*n) + "/t/t" +(n*n*n));
				cincoVeces--;
				n++;
				}
				
			}
		}


