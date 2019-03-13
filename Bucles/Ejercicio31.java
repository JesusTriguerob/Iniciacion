package boletin5;

import java.util.Scanner;
public class Ejercicio31 {

	public static void main(String[] args) {

/*		Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
		programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
		mitad (división entera entre 2) de la altura más uno.*/
	Scanner s = new Scanner(System.in);
	
	int altura;
	
	System.out.println(" introduce la la altura de la L: ");
	altura = s.nextInt();
	
	for (int i = 1; i < altura; i++) {
		System.out.println("*");
	}
	
	for (int i = 0; i < altura / 2 + 1; i++) {
		System.out.print("* ");
	}
	
	}

}