package boletin5;
/*	Escribe un programa que muestre por pantalla todos los n�meros enteros
		positivos menores a uno le�do por teclado que no sean divisibles entre otro
		tambi�n le�do de igual forma.*/
	
	import java.util.Scanner;
	public class Ejercicio29 {

		public static void main(String[] args) {
		/*	Escribe un programa que muestre por pantalla todos los n�meros enteros
			positivos menores a uno le�do por teclado que no sean divisibles entre otro
			tambi�n le�do de igual forma.*/
		
		
		Scanner s = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		do {
			System.out.println(" introduce un n�mero positivo ");
			num1=s.nextInt();
			if (num1<0) {
				System.out.println(" numero incorrecto, vuelve a introducir otro. ");
			}
		} while (num1<0);
		
		for (int i = num1; i > 0; i--) {
			
		}

		do {
			System.out.println(" introduce un n�mero positivo ");
			num2=s.nextInt();
			if (num2<0) {
				System.out.println(" numero incorrecto, vuelve a introducir otro. ");
			}
		} while (num2<0);
		
		for (int i = num2; i > 0; i--) {
			
		}}}
		
	