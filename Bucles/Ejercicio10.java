package boletin5;

//*Escribe un programa que calcule la media de un conjunto de n�meros positivos
//*introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se
//*introducir�n. El usuario indicar� que ha terminado de introducir los datos
//*cuando meta un n�mero negativo.

import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			System.out.println("Este programa calcula la media de todos los numeros que introduzcas");
			System.out.println("Para parar de pedir numero, introduzca uno negativo");
		    double numIntroducido = 0;
		    double suma = 0;
			double num = 0;
			while (numIntroducido>=0) {
				numIntroducido = s.nextDouble();
				num++;
				suma =+ numIntroducido;
			}
			System.out.println("La media de los numeros introducidos es " + (suma - numIntroducido) + (num -1));
	}

}
