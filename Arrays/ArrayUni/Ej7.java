package ArrayUni;

import java.util.Scanner;

/*Escribe un programa que genere 100 n�meros aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedir� entonces
por teclado dos valores y a continuaci�n cambiar� todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los n�meros
que se han cambiado deben aparecer entrecomillados.*/

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num1= 100;
		int num2= 20;
		int a=5;
		do {
			
		int[] numeros = new int[num1];
		
				for (int i = 0; i <num1; i++) {
					numeros[i]=(int)(Math.random()*num2);
				}
				for (int i = 0; i <num1; i++) {
					System.out.print(" " + numeros[i]);
				}
		System.out.println(" ");
			System.out.println("introduce dos valores");
			System.out.println("Introduce los numeros a representar");
			int valor1 = s.nextInt();
			System.out.println("Introduce el numero maximo de los numeros aleatorios");
			int valor2 = s.nextInt();
			num1=valor1;
			num2=valor2;
	} while (a<=100);
		}

}
